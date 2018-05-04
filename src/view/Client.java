
package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.security.acl.Group;
import java.util.List;
import static javax.swing.GroupLayout.Alignment.CENTER;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.Cliente;
import model.Venda;
import model.dao.ClienteDao;

/**
 *
 * @author jade
 */
//txtdata = new JTextField(new Date().toString());


public class Client extends JFrame{
    
    JLabel Cpf, Nome, Sexo, Rua, Numero, Bairro, Cidade, Celular;
    JTextField cadastro_nome_cliente, Cadastro_sexo_cliente,
            cadastro_rua_cliente, cadastro_numero_cliente, cadastro_bairro_cliente,
            cadastro_cidade_cliente;
    JFormattedTextField cadastrar_cpf_cliente, cadastro_celular_cliente;
    JButton Cadastrar, Cancelar, Editar, Excluir, Buscar;
    JRadioButton Masculino, Feminino;
    
    public Client(){
                
        super("Cadastrar Cliente");
        
        Cliente c = new Cliente();
        ClienteDao cd = new ClienteDao();
        
        JPanel painel = new JPanel();
        JPanel painel2 = new JPanel();
        JPanel painel3 = new JPanel();
        JPanel painel4 = new JPanel();
       
        add(BorderLayout.WEST,painel2);
        add(BorderLayout.CENTER,painel);
        add(BorderLayout.EAST,painel3);
        add(BorderLayout.SOUTH,painel4);
        //painel.setLayout(new FlowLayout(800));
        painel.setLayout(new GridLayout(25, 5));
        JPanel cont = new JPanel();
        
        add(BorderLayout.CENTER,painel);
        //add(BorderLayout.SOUTH, cont);
        
        painel.setSize(400, 400);
        
        //cont.setSize(400, 400);
                
        Cpf = new JLabel("CPF:", JLabel.CENTER);
        cadastrar_cpf_cliente = new javax.swing.JFormattedTextField();
        
        try {
            cadastrar_cpf_cliente.setFormatterFactory
        (new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
         
                    
        Nome = new JLabel("Nome:", JLabel.CENTER);
        cadastro_nome_cliente = new JTextField(12);
                       
        Sexo = new JLabel("Sexo:", JLabel.CENTER);
        Feminino = new JRadioButton("Feminino");
        Masculino = new JRadioButton("Masculino");
                  
        Rua = new JLabel("Rua:", JLabel.CENTER);
        cadastro_rua_cliente = new JTextField(12);
        
        Numero = new JLabel("Número:", JLabel.CENTER);
        cadastro_numero_cliente = new JTextField(12);
        
        Bairro = new JLabel("Bairro:", JLabel.CENTER);
        cadastro_bairro_cliente = new JTextField(12);
        
        Cidade = new JLabel("Cidade:", JLabel.CENTER);
        cadastro_cidade_cliente = new JTextField();
        
        Celular = new JLabel("Celular:", JLabel.CENTER);
        cadastro_celular_cliente = new javax.swing.JFormattedTextField();
       
       try {
            cadastro_celular_cliente.setFormatterFactory
        (new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
       
     
       
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
        
        painel.add(Cpf);
        painel.add(cadastrar_cpf_cliente);
        
        painel.add(Buscar);
               
        painel.add(Nome);
        painel.add(cadastro_nome_cliente);
        
        painel.add(Sexo);
        painel.add(Feminino);
        painel.add(Masculino);
       
        painel.add(Rua);
        painel.add(cadastro_rua_cliente);
        
        painel.add(Numero);
        painel.add(cadastro_numero_cliente);
        
        painel.add(Bairro);
        painel.add(cadastro_bairro_cliente);
        
        painel.add(Cidade);
        painel.add(cadastro_cidade_cliente);
        
        painel.add(Celular);
        painel.add(cadastro_celular_cliente);
        
        
        
        //cont.add(Cadastrar);
        
        painel.add(BorderLayout.SOUTH, Cadastrar);
        painel.add(BorderLayout.SOUTH, Editar);
        painel.add(BorderLayout.SOUTH, Excluir);
        painel.add(BorderLayout.SOUTH, Cancelar);
     
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setSize(700,600);
        
        setVisible(true);
        
    }
    

public void limparCampos(){
    cadastrar_cpf_cliente.setText("");
    cadastro_nome_cliente.setText("");
    cadastro_rua_cliente.setText("");
    cadastro_numero_cliente.setText("");
    cadastro_bairro_cliente.setText("");
    cadastro_cidade_cliente.setText("");
    cadastro_celular_cliente.setText("");
    
}
    

class selecionarSexo implements ItemListener{

        @Override
        public void itemStateChanged(ItemEvent e) {
            Cliente client = new Cliente();
            ClienteDao cd = new ClienteDao();
            
            if(Feminino.isSelected()){
                client.setSexo_cliente("Feminino");
            }
            if(Masculino.isSelected()){
                client.setSexo_cliente("Masculino");
            }
        
        }
}



class botaoCadastrar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            ClienteDao cd = new ClienteDao();
            
            Cliente c = new Cliente();


             c.setCpf_cliente(cadastrar_cpf_cliente.getText());
             c.setNome_cliente(cadastro_nome_cliente.getText());
            if(Feminino.isSelected()){
              c.setSexo_cliente("Feminino");
            }
            if(Masculino.isSelected()){
              c.setSexo_cliente("Masculino");
            }
             c.setRua_cliente(cadastro_rua_cliente.getText());
             c.setNumeracao_casa_cliente(Integer.parseInt(cadastro_numero_cliente.getText()));
             c.setBairro_cliente(cadastro_bairro_cliente.getText());
             c.setCidade_cliente(cadastro_cidade_cliente.getText());
             c.setCelular_cliente(cadastro_celular_cliente.getText());

             cd.create(c);
       
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
            ClienteDao cli = new ClienteDao();
        
            Cliente c = new Cliente();

            c.setCpf_cliente(cadastrar_cpf_cliente.getText());
            c.setNome_cliente(cadastro_nome_cliente.getText());
            c.setSexo_cliente(Cadastro_sexo_cliente.getText());
            c.setRua_cliente(cadastro_rua_cliente.getText());
            c.setNumeracao_casa_cliente(Integer.parseInt(cadastro_numero_cliente.getText()));
            c.setBairro_cliente(cadastro_bairro_cliente.getText());
            c.setCidade_cliente(cadastro_cidade_cliente.getText());
            c.setCelular_cliente(cadastro_celular_cliente.getText());

            cli.update(c);
            
            limparCampos();
                                  
        }
    
}

class botaoExcluir implements ActionListener{
    @Override
        public void actionPerformed(ActionEvent e) {
            ClienteDao clid = new ClienteDao();
       
            Cliente c = new Cliente();

            c.setCpf_cliente(cadastrar_cpf_cliente.getText());


            clid.delete(c);
            limparCampos();

        }
    
}

class botaoBuscar implements ActionListener{
    @Override
     public void actionPerformed(ActionEvent e) {
       List<Cliente> clientes = new ClienteDao().read();
       Cliente c = new Cliente();
        
        ClienteDao clid = new ClienteDao();
       
        
        String cpfDigitado = cadastrar_cpf_cliente.getText();
        
        
        for(int i = 0; i < clientes.size(); i++){
                   
            if(cpfDigitado.equals(clientes.get(i).getCpf_cliente())){
                //JOptionPane.showMessageDialog(null, "Encontrado!");
                
                cadastro_nome_cliente.setText(clientes.get(i).getNome_cliente());
                if((clientes.get(i).getSexo_cliente()).equals("Feminino")){
                    Feminino.isSelected();
                   
                }
                if((clientes.get(i).getSexo_cliente()).equals("Masculino")){

                     Masculino.isSelected();
                }
                cadastro_rua_cliente.setText(clientes.get(i).getRua_cliente());
                cadastro_numero_cliente.setText(Integer.toString(clientes.get(i).getNumeracao_casa_cliente()));
                cadastro_bairro_cliente.setText(clientes.get(i).getBairro_cliente());
                cadastro_cidade_cliente.setText(clientes.get(i).getCidade_cliente());
                cadastro_celular_cliente.setText(clientes.get(i).getCelular_cliente());
               
                }else{
            //if(!codigoDigitado.equals(pd)){
                    
                    //JOptionPane.showMessageDialog(null, "Não encontrado!");
                   
               }
        }
        
            
            
           
        }
    
     }      

public static void main(String[] args) {

        new Client();
    }
        
    
}

