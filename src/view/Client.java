
package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.Venda;

/**
 *
 * @author jade
 */
//txtdata = new JTextField(new Date().toString());


public class Client extends JFrame{
    
    JLabel Cpf, Nome, Sexo, Rua, Numero, Bairro, Cidade, Celular;
    JTextField cadastrar_cpf_cliente, cadastro_nome_cliente, Cadastro_sexo_cliente,
            cadastro_rua_cliente, cadastro_numero_cliente, cadastro_bairro_cliente,
            cadastro_cidade_cliente, cadastro_celular_cliente;
    JButton Cadastrar;
    
    
    public Client(){
        
        super("Cadastrar Cliente");
        
        Container painel = getContentPane();
        painel.setLayout(new GridLayout(20,8));
        Container cont = new JPanel();
        
        Cpf = new JLabel("CPF:", JLabel.LEFT);
        cadastrar_cpf_cliente = new JTextField();
        //cadastrar_cpf_cliente.setSize(50, 30);
        Nome = new JLabel("Nome:", JLabel.LEFT);
        cadastro_nome_cliente = new JTextField();
        
        Sexo = new JLabel("Sexo:", JLabel.LEFT);
        Cadastro_sexo_cliente = new JTextField();
        
        Rua = new JLabel("Rua:", JLabel.LEFT);
        cadastro_rua_cliente = new JTextField();
        
        Numero = new JLabel("Número:", JLabel.LEFT);
        cadastro_numero_cliente = new JTextField();
        
        Bairro = new JLabel("Bairro:", JLabel.LEFT);
        cadastro_bairro_cliente = new JTextField();
        
        Cidade = new JLabel("Cidade:", JLabel.LEFT);
        cadastro_cidade_cliente = new JTextField();
        
        Celular = new JLabel("Celular:", JLabel.LEFT);
        cadastro_celular_cliente = new JTextField();
        
        Cadastrar = new JButton("Cadastrar");
        
        painel.add(Cpf);
        painel.add(cadastrar_cpf_cliente);
        
        painel.add(Nome);
        painel.add(cadastro_nome_cliente);
        
        painel.add(Sexo);
        painel.add(Cadastro_sexo_cliente);
        
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
        
        painel.add(Cadastrar);
     
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setSize(400,300);
        
        setVisible(true);
        
    }
    
public static void main(String[] args) {

    //JFrame.setDefaultLookAndFeelDecorated(true);
    new Client();
}
}
