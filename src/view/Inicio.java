/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import interfaceSwing.Mostrar_produto;
import interfaceSwing.Mostrar_Cliente;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

/**
 *
 * @author jade
 */
public class Inicio extends JFrame{
  
    JLabel saudacao;
    JButton Vender, CadastrarCliente, CadastrarVendedor, CadastrarProduto,
            ListarCliente, ListarProdutos, Sair;
    JPanel painel, painel2;  
   
    public Inicio(){
      super("Tela Inicial");     
       
        painel = new JPanel();
        painel2 = new JPanel();
        add(BorderLayout.EAST,painel);
        add(BorderLayout.WEST, painel2);
        
        painel.setLayout(new GridLayout(10, 2));
        painel.setSize(400,400);
        //painel2.setSize(400,400);
        
        JLabel simples = new JLabel("Bem-Vindo(a)", JLabel.RIGHT);
        simples.setToolTipText("Meu tootip");
        Font font = new Font("serif", Font.BOLD | Font.ITALIC, 50);
        simples.setFont(font);
        simples.setForeground(Color.blue);
              
        ImageIcon icon = 
        new ImageIcon(getClass().getResource("bag.png"));
        JLabel imagem = new JLabel(icon, JLabel.RIGHT);
            
        //Container c = getContentPane();
        //c.setLayout(new FlowLayout());
        //c.add(simples);
        //c.add(label);
        //c.add(imagem);
        
        painel2.add(simples);
        painel2.add(imagem);
        
        Menubotoes();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setSize(700,600);
        
        setVisible(true);
        
    }
    
    public void Menubotoes(){
        Vender = new JButton("Vender");
        Vender.addActionListener(new botaoVender());
        
        CadastrarCliente = new JButton("Cadastrar Cliente");
        CadastrarCliente.addActionListener(new botaoCadastrarCliente());
        
        CadastrarVendedor = new JButton("Cadastrar Vendedor");
        CadastrarVendedor.addActionListener(new botaoCadastrarVendedor());
        
        CadastrarProduto = new JButton("Cadastrar Produto");
        CadastrarProduto.addActionListener(new botaoCadastrarProduto());
        
        ListarCliente = new JButton("Listar Clientes");
        ListarCliente.addActionListener(new botaoListarCliente());
        
        ListarProdutos = new JButton("Listar Produtos");
        ListarProdutos.addActionListener(new botaoListarProduto());
        
        Sair = new JButton("Sair");
        Sair.addActionListener(new botaoSair());
        
        painel.add(Vender);
        painel.add(CadastrarCliente);
        painel.add(CadastrarVendedor);
        painel.add(CadastrarProduto);
        painel.add(ListarCliente);
        painel.add(ListarProdutos);
        painel.add(Sair);
    }
    
    
     class botaoVender implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Vendas v = new Vendas();
            v.setVisible(true);
      
        }
    
     }
     
     class botaoCadastrarCliente implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Client c = new Client();
            c.setVisible(true);
        }
     }
     
     class botaoCadastrarVendedor implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Vendedorr v = new Vendedorr();
            v.setVisible(true);
        }
     }
     
     class botaoCadastrarProduto implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Product p = new Product();
            p.setVisible(true);
        }
     }
     
     class botaoListarCliente implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Mostrar_Cliente mc = new Mostrar_Cliente();
            mc.setVisible(true);
        }
     }
     
     class botaoListarProduto implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Mostrar_produto mp = new Mostrar_produto();
            mp.setVisible(true);
        }
     }
     
     class botaoSair implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           
          
        }
     }
    public static void main(String[] args) {
            
        new Inicio();
        
    }
    
}
