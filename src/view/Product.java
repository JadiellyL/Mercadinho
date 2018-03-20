
package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Produto;
import model.dao.ProdutoDao;

/**
 *
 * @author jade
 */
public class Product extends JFrame{
    JLabel Nome, Quantidade, Preco, Fornecedor, Codigo;
    JTextField Cadastro_Nome_produto, Cadastro_quantidade_produto, 
            cadastro_preco_produto,cadastro_fornecedor_produto, cadastrar_codigo_produto;
    JButton Cadastrar, Cancelar, Editar, Excluir, Buscar;
    
    public Product(){
        
        super("Cadastrar Cliente");
        
        JPanel painel = new JPanel();
        JPanel painel2 = new JPanel();
        JPanel painel3 = new JPanel();
        JPanel painel4 = new JPanel();
        
        
        add(BorderLayout.WEST,painel2);
        add(BorderLayout.CENTER,painel);
        add(BorderLayout.EAST,painel3);
        add(BorderLayout.SOUTH,painel4);
        painel.setLayout(new GridLayout(25, 5));
        
         
        Codigo = new JLabel("Código:", JLabel.LEFT);
        cadastrar_codigo_produto = new JTextField();
        
        Nome = new JLabel("Nome:", JLabel.LEFT);
        Cadastro_Nome_produto = new JTextField();
        
        Quantidade = new JLabel("Qtd:", JLabel.LEFT);
        Cadastro_quantidade_produto = new JTextField();
        
        Preco = new JLabel("Preço:", JLabel.LEFT);
        cadastro_preco_produto = new JTextField();
        
        Fornecedor = new JLabel("Fornecedor:", JLabel.LEFT);
        cadastro_fornecedor_produto = new JTextField();
        
        Cadastrar = new JButton("Cadastrar");
        Cadastrar.addActionListener(new botaoCadastrar());
        
        Cancelar = new JButton("Cancelar");
        Cancelar.addActionListener(new botaoCancelar());
        //add(BorderLayout.EAST,Cancelar);
        
        Buscar = new JButton("Buscar");
        Buscar.addActionListener(new botaoBuscar());
        //painel.add(BorderLayout.EAST, Buscar);
                
        Editar = new JButton("Editar");
        Editar.addActionListener(new botaoEditar());
        
        Excluir = new JButton("Excluir");
        Excluir.addActionListener(new botaoExcluir());
        
        painel.add(Codigo);
        painel.add(cadastrar_codigo_produto);
        
        painel.add(Buscar);
                
        painel.add(Nome);
        painel.add(Cadastro_Nome_produto);
        
        painel.add(Quantidade);
        painel.add(Cadastro_quantidade_produto);
        
        painel.add(Preco);
        painel.add(cadastro_preco_produto);
        
        painel.add(Fornecedor);
        painel.add(cadastro_fornecedor_produto);
        
        painel.add(BorderLayout.SOUTH, Cadastrar);
        painel.add(BorderLayout.SOUTH, Editar);
        painel.add(BorderLayout.SOUTH, Excluir);
        painel.add(BorderLayout.SOUTH, Cancelar);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setSize(700,600);
        
        setVisible(true);
        
    }
    
public void limparCampos(){
    Cadastro_Nome_produto.setText("");
    Cadastro_quantidade_produto.setText("");
    cadastro_preco_produto.setText("");
    cadastro_fornecedor_produto.setText("");
}
    
   
 class botaoCadastrar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Produto p = new Produto();
             
            ProdutoDao pd = new ProdutoDao();

            p.setNome_produto(Cadastro_Nome_produto.getText());
            p.setQuantidade_produto(Integer.parseInt(Cadastro_quantidade_produto.getText()));
            p.setPreco_produto(Double.parseDouble(cadastro_preco_produto.getText()));
            p.setFornecedor_produto(cadastro_fornecedor_produto.getText());

            pd.create(p);
            
            limparCampos();
            
        }
 }
 
 class botaoCancelar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            limparCampos();
        }
 }
 
 class botaoEditar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            ProdutoDao pd = new ProdutoDao();
        
            Produto p = new Produto();

            p.setCod_produto(Integer.parseInt(cadastrar_codigo_produto.getText()));
            p.setNome_produto(Cadastro_Nome_produto.getText());
            p.setQuantidade_produto(Integer.parseInt(Cadastro_quantidade_produto.getText()));
            p.setPreco_produto(Double.parseDouble(cadastro_preco_produto.getText()));
            p.setFornecedor_produto(cadastro_fornecedor_produto.getText());


            pd.update(p);

           limparCampos();
        }
}
 
 class botaoExcluir implements ActionListener{
    @Override
        public void actionPerformed(ActionEvent e) {
            ProdutoDao prodd = new ProdutoDao();
       
             Produto p = new Produto();
       
            p.setCod_produto(Integer.parseInt(cadastrar_codigo_produto.getText()));
            prodd.delete(p);
            
             limparCampos();
        }
 }
 
 class botaoBuscar implements ActionListener{
    @Override
        public void actionPerformed(ActionEvent e) {
            List<Produto> produtos = new ProdutoDao().read();
        
        ProdutoDao ptd = new ProdutoDao();
       
        
        String codigoDigitado = cadastrar_codigo_produto.getText();
        
        for(Produto p : produtos){
           
            String pd = Integer.toString(p.getCod_produto());
             
                        
            if(codigoDigitado.equals(pd)){
                //JOptionPane.showMessageDialog(null, "Encontrado!");
                
                Cadastro_Nome_produto.setText(p.getNome_produto());
                Cadastro_quantidade_produto.setText(Integer.toString(p.getQuantidade_produto()));
                cadastro_preco_produto.setText(Double.toString(p.getPreco_produto()));
                cadastro_fornecedor_produto.setText(p.getFornecedor_produto());
               
                }else{
            //if(!codigoDigitado.equals(pd)){
                    
                    //JOptionPane.showMessageDialog(null, "Não encontrado!");
                   
               }
        }
   
        }
}
    public static void main(String[] args) {

        new Product();
    }
    
}
