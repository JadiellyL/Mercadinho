
package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author jade
 */
public class Venda extends JFrame{
    
    public Venda(){
        super("Realizar Vendas");
        
        JPanel painel1 = new JPanel();
        JPanel painel2 = new JPanel();
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setSize(700,600);

        setVisible(true);
    }
    
public static void main(String args[]) {
    new Venda();
}
    
}
