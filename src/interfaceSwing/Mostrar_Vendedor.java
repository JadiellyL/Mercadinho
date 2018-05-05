
package interfaceSwing;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.naming.spi.DirStateFactory;
import javax.swing.DropMode;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.ConnectionFactory;
import model.Produto;
import model.Vendedor;
import model.dao.ClienteDao;
import model.dao.ProdutoDao;
import model.dao.VendedorDao;

/**
 *
 * @author jade
 */
public class Mostrar_Vendedor extends javax.swing.JFrame {

   
    public Mostrar_Vendedor() {
        initComponents();
       
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1_editar_cliente = new javax.swing.JMenuItem();
        jMenuItem2_excluir_cliente = new javax.swing.JMenuItem();
        jMenuItem3_listar_cliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jPanel_mostrar = new javax.swing.JPanel();
        jButton_listar_vendedor = new javax.swing.JButton();
        jButton_pesquisar_vendedor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_vendedor = new javax.swing.JTable();
        jButton_limpar = new javax.swing.JButton();
        codigo_pesquisar = new javax.swing.JTextField();

        jMenuBar1.setPreferredSize(new java.awt.Dimension(60, 25));

        jMenu1.setText("Arquivo");

        jMenuItem1_editar_cliente.setText("Editar Cadastro de Cliente");
        jMenuItem1_editar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1_editar_clienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1_editar_cliente);

        jMenuItem2_excluir_cliente.setText("Excluir Cadastro de Cliente");
        jMenuItem2_excluir_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2_excluir_clienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2_excluir_cliente);

        jMenuItem3_listar_cliente.setText("Listar Clientes");
        jMenu1.add(jMenuItem3_listar_cliente);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sair");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel_mostrar.setBackground(new java.awt.Color(141, 170, 188));
        jPanel_mostrar.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_mostrar.setPreferredSize(new java.awt.Dimension(880, 565));
        jPanel_mostrar.setRequestFocusEnabled(false);

        jButton_listar_vendedor.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton_listar_vendedor.setText("Listar");
        jButton_listar_vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_listar_vendedorActionPerformed(evt);
            }
        });

        jButton_pesquisar_vendedor.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton_pesquisar_vendedor.setText("Pesquisar");
        jButton_pesquisar_vendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_pesquisar_vendedorActionPerformed(evt);
            }
        });

        jTable_vendedor.setAutoCreateRowSorter(true);
        jTable_vendedor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTable_vendedor.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        jTable_vendedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable_vendedor.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(jTable_vendedor);

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
                .addContainerGap(175, Short.MAX_VALUE)
                .addGroup(jPanel_mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_mostrarLayout.createSequentialGroup()
                        .addComponent(codigo_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_pesquisar_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_listar_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_mostrarLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186))))
        );
        jPanel_mostrarLayout.setVerticalGroup(
            jPanel_mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_mostrarLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel_mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_pesquisar_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_listar_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigo_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
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
            .addComponent(jPanel_mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_listar_vendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_listar_vendedorActionPerformed
        
        //List<ProdutoDao> pd = (List<ProdutoDao>) new ProdutoDao();
       
        List<Vendedor> vendedores = new VendedorDao().read();
       for(int i = 0; i < vendedores.size(); i++){
          // int j = 0;
           int k = 0;
                   
            jTable_vendedor.setValueAt(vendedores.get(i).getCod_vendedor(), i, k);
            jTable_vendedor.setValueAt(vendedores.get(i).getNome_vendedor(), i, k+1);
            
            //j++;
            //jTable_clientes.setAutoCreateRowSorter(rootPaneCheckingEnabled);
            k++;
            
        }
      
      
    }//GEN-LAST:event_jButton_listar_vendedorActionPerformed

    private void jButton_pesquisar_vendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_pesquisar_vendedorActionPerformed
        List<Vendedor> vendedores = new VendedorDao().read();
        Vendedor v = new Vendedor();
        
        String codDigitado = codigo_pesquisar.getText();
        boolean achou = false;
    
       for(int i = 0; i < vendedores.size(); i++){
          
            String Codvend = Integer.toString(vendedores.get(i).getCod_vendedor());
                        
            if(codDigitado.equals(Codvend)){
             achou = true;
            
            jTable_vendedor.setValueAt(vendedores.get(i).getNome_vendedor(), 0, 0);
                          
            }           
             
        
        }
        
        
     JOptionPane.showMessageDialog(null, achou);

    }//GEN-LAST:event_jButton_pesquisar_vendedorActionPerformed

    
    private void jButton_limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_limparActionPerformed
      
        //jTable_clientes.setVisible(false);
        List<Vendedor> vendedores = new VendedorDao().read();
       for(int i = 0; i < vendedores.size(); i++){
          // int j = 0;
           int k = 0;
                   
            jTable_vendedor.setValueAt(" ", i, k);
            jTable_vendedor.setValueAt(" ", i, k+1);
            
            //j++;
            //jTable_clientes.setAutoCreateRowSorter(rootPaneCheckingEnabled);
            k++;
            
        }
		
        
    }//GEN-LAST:event_jButton_limparActionPerformed

    private void jMenuItem1_editar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1_editar_clienteActionPerformed
        /*cadastro_nome_cliente.setVisible(false);
        cadastro_rua_cliente.setVisible(false);
        cadastro_numero_cliente.setVisible(false);
        cadastro_bairro_cliente.setVisible(false);
        cadastro_cidade_cliente.setVisible(false);
        cadastro_celular_cliente.setVisible(false);
        jButton_cadastrar_cliente.setVisible(false);
        jButton_pesquisar_cpf_cliente.setVisible(true);
        jButton_salvar_alterações.setVisible(true);
        jButton_voltar_ao_cadastro.setVisible(true);*/
        /*jLabel_nome_cliente.setVisible(false);
        jLabel_rua_cliente.setVisible(false);
        jLabel_numero_cliente.setVisible(false);
        jLabel_bairro_cliente.setVisible(false);
        jLabel_cidade_cliente.setVisible(false);
        jLabel_celular_cliente.setVisible(false);
        jLabel_sexo_cliente.setVisible(false);
        sexo_feminino.setVisible(false);
        sexo_masculino.setVisible(false);
        jLabel_dados_pessoais.setVisible(false);
        jLabel_endereco.setVisible(false);
        jPanel2.setVisible(false);*/

    }//GEN-LAST:event_jMenuItem1_editar_clienteActionPerformed

    private void jMenuItem2_excluir_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2_excluir_clienteActionPerformed
       /* jButton_cadastrar_cliente.setVisible(false);
        jButton_pesquisar_cpf_cliente.setVisible(true);
        jButton_voltar_ao_cadastro.setVisible(true);
        jButton_excluir_cliente.setVisible(true);*/
    }//GEN-LAST:event_jMenuItem2_excluir_clienteActionPerformed

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
            java.util.logging.Logger.getLogger(Mostrar_Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mostrar_Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mostrar_Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mostrar_Vendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mostrar_Vendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigo_pesquisar;
    private javax.swing.JButton jButton_limpar;
    private javax.swing.JButton jButton_listar_vendedor;
    private javax.swing.JButton jButton_pesquisar_vendedor;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1_editar_cliente;
    private javax.swing.JMenuItem jMenuItem2_excluir_cliente;
    private javax.swing.JMenuItem jMenuItem3_listar_cliente;
    private javax.swing.JPanel jPanel_mostrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_vendedor;
    // End of variables declaration//GEN-END:variables
}
