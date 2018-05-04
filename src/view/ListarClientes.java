
package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import model.Cliente;
import model.dao.ClienteDao;

/**
 *
 * @author jade
 */
public class ListarClientes extends JFrame{
   private JTable table;
    private String colunas[]={"CPF:","Nome:","Sexo:", "Rua:","Numero", 
        "Bairro", "Cidade",
    "Telefone:"};
    private String dados[][]={
            {"","","","","","","",""},
           {"","","","","","","",""},
           {"","","","","","","",""},
           };
    
    
    JButton listar;
    
public ListarClientes(){
    super("Listar");
    
    JPanel painel = new JPanel();
    add(BorderLayout.CENTER,painel);
   
    table = new JTable(dados, colunas);
    listar = new JButton("Listar");
    listar.addActionListener(new botaoListar());
    table.setPreferredScrollableViewportSize(new Dimension(500,100));//barra de rolagem
   // table.setFillsViewportHeight(true);
    
    JScrollPane scrollPane=new JScrollPane(table);
    
    
   painel.add(scrollPane);
    painel.add(table);
    painel.add(listar);
      
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    setSize(700,600);
        
    setVisible(true);
}

class botaoListar implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        List<Cliente> clientes = new ClienteDao().read();
       for(int i = 0; i < clientes.size(); i++){
          // int j = 0;
           int k = 0;
                      
            table.setValueAt(clientes.get(i).getCpf_cliente(), i, k);
            table.setValueAt(clientes.get(i).getNome_cliente(), i, k+1);
            table.setValueAt(clientes.get(i).getSexo_cliente(), i, k+2);
            table.setValueAt(clientes.get(i).getRua_cliente(), i, k+3);
            table.setValueAt(clientes.get(i).getNumeracao_casa_cliente(), i, k+4);
            table.setValueAt(clientes.get(i).getBairro_cliente(), i, k+5);
            table.setValueAt(clientes.get(i).getCidade_cliente(), i, k+6);
            table.setValueAt(clientes.get(i).getCelular_cliente(), i, k+7);
            //j++;
            k++;
            
        }
    }
}

    

public static void main(String args[]) {
        new ListarClientes();
}
    
}
