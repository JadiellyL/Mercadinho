
package interfaceSwing;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.naming.spi.DirStateFactory;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import model.Cliente;
import model.ConnectionFactory;
import model.Produto;
import model.dao.ClienteDao;
import model.dao.ProdutoDao;

/**
 *
 * @author jade
 */
public class Mostrar_Cliente extends javax.swing.JFrame {

   
    public Mostrar_Cliente() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_mostrar = new javax.swing.JPanel();
        jButton_listar_clientes = new javax.swing.JButton();
        jButton_pesquisar_cliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_clientes = new javax.swing.JTable();
        jTextField_cpf_cliente_listar = new javax.swing.JFormattedTextField();
        jButton_limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_mostrar.setBackground(new java.awt.Color(141, 170, 188));
        jPanel_mostrar.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_mostrar.setPreferredSize(new java.awt.Dimension(880, 565));
        jPanel_mostrar.setRequestFocusEnabled(false);

        jButton_listar_clientes.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton_listar_clientes.setText("Listar");
        jButton_listar_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_listar_clientesActionPerformed(evt);
            }
        });

        jButton_pesquisar_cliente.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton_pesquisar_cliente.setText("Pesquisar");
        jButton_pesquisar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_pesquisar_clienteActionPerformed(evt);
            }
        });

        jTable_clientes.setAutoCreateRowSorter(true);
        jTable_clientes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTable_clientes.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        jTable_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CPF", "Nome", "Sexo", "Rua", "Número Res.", "Bairro", "Cidade", "Celular"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_clientes);

        try {
            jTextField_cpf_cliente_listar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jButton_limpar.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton_limpar.setText("Limpar");
        jButton_limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_limparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_mostrarLayout = new javax.swing.GroupLayout(jPanel_mostrar);
        jPanel_mostrar.setLayout(jPanel_mostrarLayout);
        jPanel_mostrarLayout.setHorizontalGroup(
            jPanel_mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_mostrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_mostrarLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel_mostrarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField_cpf_cliente_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_pesquisar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_listar_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))))
        );
        jPanel_mostrarLayout.setVerticalGroup(
            jPanel_mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_mostrarLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel_mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_pesquisar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_listar_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_cpf_cliente_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_listar_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_listar_clientesActionPerformed
        
        //List<ProdutoDao> pd = (List<ProdutoDao>) new ProdutoDao();
        
        List<Cliente> clientes = new ClienteDao().read();
       for(int i = 0; i < clientes.size(); i++){
          // int j = 0;
           int k = 0;
                   
            jTable_clientes.setValueAt(clientes.get(i).getCpf_cliente(), i, k);
            jTable_clientes.setValueAt(clientes.get(i).getNome_cliente(), i, k+1);
            jTable_clientes.setValueAt(clientes.get(i).getSexo_cliente(), i, k+2);
            jTable_clientes.setValueAt(clientes.get(i).getRua_cliente(), i, k+3);
            jTable_clientes.setValueAt(clientes.get(i).getNumeracao_casa_cliente(), i, k+4);
            jTable_clientes.setValueAt(clientes.get(i).getBairro_cliente(), i, k+5);
            jTable_clientes.setValueAt(clientes.get(i).getCidade_cliente(), i, k+6);
            jTable_clientes.setValueAt(clientes.get(i).getCelular_cliente(), i, k+7);
            //j++;
            k++;
            
        }
      
      
    }//GEN-LAST:event_jButton_listar_clientesActionPerformed

    private void jButton_pesquisar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_pesquisar_clienteActionPerformed
        List<Cliente> clientes = new ClienteDao().read();
        
        String cpfDigitado = jTextField_cpf_cliente_listar.getText();
        boolean achou = false;
     
        for(Cliente c : clientes){
          
            String cli = c.getCpf_cliente();
                        
            if(cpfDigitado.equals(cli)){
             achou = true;
               
            jTable_clientes.setValueAt(c.getCpf_cliente(), 0, 0);
            jTable_clientes.setValueAt(c.getNome_cliente(),0, 1);
            jTable_clientes.setValueAt(c.getSexo_cliente(),0, 2);
            jTable_clientes.setValueAt(c.getRua_cliente(), 0, 3);
            jTable_clientes.setValueAt(c.getNumeracao_casa_cliente(), 0, 4);
            jTable_clientes.setValueAt(c.getBairro_cliente(), 0, 5);
            jTable_clientes.setValueAt(c.getCidade_cliente(), 0, 6);
            jTable_clientes.setValueAt(c.getCelular_cliente(),0, 7);
               
         
                                
            } else
            if(!(cpfDigitado.equals(cli))){
                achou = false;
                JOptionPane.showMessageDialog(null, "Não encontrado!");
               
            }
            
             
        
        }
        
        
     

    }//GEN-LAST:event_jButton_pesquisar_clienteActionPerformed

    private void jButton_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_limparActionPerformed
       
        List<Cliente> clientes = new ClienteDao().read();
       for(int i = 0; i < clientes.size(); i++){
          // int j = 0;
           int k = 0;
            jTable_clientes.removeAll();
            
            //j++;
            k++;
            
        }
    }//GEN-LAST:event_jButton_limparActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mostrar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mostrar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mostrar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mostrar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mostrar_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_limpar;
    private javax.swing.JButton jButton_listar_clientes;
    private javax.swing.JButton jButton_pesquisar_cliente;
    private javax.swing.JPanel jPanel_mostrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_clientes;
    private javax.swing.JFormattedTextField jTextField_cpf_cliente_listar;
    // End of variables declaration//GEN-END:variables
}