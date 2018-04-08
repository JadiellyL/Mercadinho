
package view;

import controller.botaoCadastrar;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import model.Produto;
import model.Vendedor;
import model.dao.ProdutoDao;
import model.dao.VendedorDao;

/**
 *
 * @author jade
 */
public class Vendedorr extends JFrame{
   public JLabel Nome, Sexo, Senha, Codigo;
   public JPasswordField Senha_vendedor;
   public JTextField cadastro_nome_vendedor, cadastro_sexo_vendedor, 
            cadastro_senha_vendedor, cadastrar_codigo_vendedor;
   public JButton Cadastrar, Cancelar, Editar, Excluir, Buscar, Salvar;
    
    public Vendedorr(){
        super("Cadastrar Vendedor");
              
        JPanel painel = new JPanel();
        JPanel painel2 = new JPanel();
        JPanel painel3 = new JPanel();
        JPanel painel4 = new JPanel();
        
        painel.setLayout(new GridLayout(15, 2));
        add(BorderLayout.WEST,painel2);
        add(BorderLayout.CENTER,painel);
        add(BorderLayout.EAST,painel3);
        add(BorderLayout.SOUTH,painel4);
        
        painel2.setSize(400, 400);
        
        Codigo = new JLabel("Código:", JLabel.LEFT);
        cadastrar_codigo_vendedor = new JTextField();
                        
        Nome = new JLabel("Nome:", JLabel.LEFT);
        cadastro_nome_vendedor = new JTextField();
        
        Sexo = new JLabel("Sexo:", JLabel.LEFT);
        cadastro_sexo_vendedor = new JTextField();
        
        Senha = new JLabel("Senha:", JLabel.LEFT);
        cadastro_senha_vendedor = new JPasswordField();
        
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
        
        Salvar = new JButton("Salvar");
        Salvar.addActionListener(new botaoSalvar());
        
        painel.add(Codigo);
        painel.add(cadastrar_codigo_vendedor);
        
        painel.add(Buscar);
        
        painel.add(Nome);
        painel.add(cadastro_nome_vendedor);
        
        painel.add(Sexo);
        painel.add(cadastro_sexo_vendedor);
        
        painel.add(Senha);
        painel.add(cadastro_senha_vendedor);
                
        Salvar.setVisible(false);
        
        painel4.add(BorderLayout.SOUTH, Cadastrar);
        painel4.add(BorderLayout.SOUTH, Editar);
        painel4.add(BorderLayout.SOUTH, Salvar);
        painel4.add(BorderLayout.SOUTH, Excluir);
        painel4.add(BorderLayout.SOUTH, Cancelar);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setSize(400,400);
        
        setVisible(true);
        
    }

 public void limparCampos(){
     cadastrar_codigo_vendedor.setText("");
     cadastro_nome_vendedor.setText("");
     cadastro_sexo_vendedor.setText("");
     cadastro_senha_vendedor.setText("");
 }
 
 
 class botaoCadastrar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Vendedor v = new Vendedor();
            VendedorDao vd = new VendedorDao();
                        
            v.setNome_vendedor(cadastro_nome_vendedor.getText());
            v.setSexo_vendedor(cadastro_sexo_vendedor.getText());
            v.setSenha_vendedor(cadastro_senha_vendedor.getText());

            vd.create(v);
            limparCampos();
        }
 }
 
 class botaoCancelar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           Editar.setVisible(true);
           limparCampos();
            
        }
 }
 
 class botaoEditar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
             
             Editar.setVisible(false);
             Salvar.setVisible(true);
            
            
        }
 }
 
 class botaoSalvar implements ActionListener{
     @Override
        public void actionPerformed(ActionEvent e) {
            VendedorDao vd = new VendedorDao();
        
            Vendedor v = new Vendedor();

            v.setCod_vendedor(Integer.parseInt(cadastrar_codigo_vendedor.getText()));
            v.setNome_vendedor(cadastro_nome_vendedor.getText());
            v.setSexo_vendedor(cadastro_sexo_vendedor.getText());
            v.setSenha_vendedor(cadastro_senha_vendedor.getText());


            vd.update(v);

           limparCampos();
        }
     
 }
 
 class botaoExcluir implements ActionListener{
    @Override
        public void actionPerformed(ActionEvent e) {
            VendedorDao vd = new VendedorDao();
       
             Vendedor v = new Vendedor();
       
            v.setCod_vendedor(Integer.parseInt(cadastrar_codigo_vendedor.getText()));
            vd.delete(v);
            
             limparCampos();
            
        }
 }
 
 class botaoBuscar implements ActionListener{
    @Override
        public void actionPerformed(ActionEvent e) {
            
            List<Vendedor> vendedores = new VendedorDao().read();
        
            VendedorDao vd = new VendedorDao();
       
            String codigoDigitado = cadastrar_codigo_vendedor.getText();
        
             for(Vendedor v : vendedores){
           
            String pd = Integer.toString(v.getCod_vendedor());
             
                        
            if(codigoDigitado.equals(pd)){
                //JOptionPane.showMessageDialog(null, "Encontrado!");
                
                cadastro_nome_vendedor.setText(v.getNome_vendedor());
                cadastro_sexo_vendedor.setText(v.getSexo_vendedor());
                cadastro_senha_vendedor.setText(v.getSenha_vendedor());
                               
                }else{
            //if(!codigoDigitado.equals(pd)){
                    
                    //JOptionPane.showMessageDialog(null, "Não encontrado!");
                   
               }
        }
   
        }
            
        
  }
    public static void main(String args[]) {
        new Vendedorr();
    }
    
}
