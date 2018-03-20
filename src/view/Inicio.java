/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.LayoutManager;
import javax.swing.ImageIcon;
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
   
    public Inicio(){
      super("Tela Inicial");     
       

        /*JPanel painel = new JPanel();
        painel.setLayout(new FlowLayout());
        add(BorderLayout.CENTER,painel);
        
        saudacao = new JLabel("Bem-Vindo(a)");
        ImageIcon icon = new ImageIcon(getClass().getResource("img/bag.png"));
        JLabel image = new JLabel(icon);
       
        painel.add(saudacao);
        */
        JLabel simples = new JLabel("Bem-Vindo(a)", JLabel.LEFT);
        simples.setToolTipText("Meu tootip");
        Font font = new Font("serif", Font.BOLD | Font.ITALIC, 50);
        simples.setFont(font);
        simples.setForeground(Color.blue);
        
        /*
        Font font = new Font("serif", Font.BOLD | Font.ITALIC, 28);
        JLabel label = new JLabel();
        label.setFont(font);
        label.setForeground(Color.blue);
        */
        ImageIcon icon = 
        new ImageIcon(getClass().getResource("bag.png"));
        JLabel imagem = new JLabel(icon);
        
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(simples);
        //c.add(label);
        c.add(imagem);
        
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setSize(700,600);
        
        setVisible(true);
        
    }
    public static void main(String[] args) {
            
        new Inicio();
        
    }
}
