
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
import model.ConnectionFactory;
import model.Produto;
import model.dao.ProdutoDao;

/**
 *
 * @author jade
 */
public class Mostrar_produto extends javax.swing.JFrame {

   
    public Mostrar_produto() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_mostrar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton_listar_produtos = new javax.swing.JButton();
        jTextField_codigo_prod_listar = new javax.swing.JTextField();
        jButton_pesquisar_produto_Listar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_produtos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_mostrar.setBackground(new java.awt.Color(101, 116, 203));
        jPanel_mostrar.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_mostrar.setPreferredSize(new java.awt.Dimension(1370, 700));
        jPanel_mostrar.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Listar Produtos");

        jButton_listar_produtos.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton_listar_produtos.setText("Listar");
        jButton_listar_produtos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_listar_produtosActionPerformed(evt);
            }
        });

        jTextField_codigo_prod_listar.setText("Digite o código");

        jButton_pesquisar_produto_Listar1.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton_pesquisar_produto_Listar1.setText("Pesquisar");
        jButton_pesquisar_produto_Listar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_pesquisar_produto_Listar1ActionPerformed(evt);
            }
        });

        jTable_produtos.setAutoCreateRowSorter(true);
        jTable_produtos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTable_produtos.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        jTable_produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Quantidade", "Preço", "Fornecedor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_produtos);

        javax.swing.GroupLayout jPanel_mostrarLayout = new javax.swing.GroupLayout(jPanel_mostrar);
        jPanel_mostrar.setLayout(jPanel_mostrarLayout);
        jPanel_mostrarLayout.setHorizontalGroup(
            jPanel_mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_mostrarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(555, 555, 555))
            .addGroup(jPanel_mostrarLayout.createSequentialGroup()
                .addGroup(jPanel_mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_mostrarLayout.createSequentialGroup()
                        .addGap(463, 463, 463)
                        .addComponent(jButton_listar_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_codigo_prod_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_pesquisar_produto_Listar1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_mostrarLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel_mostrarLayout.setVerticalGroup(
            jPanel_mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_mostrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel_mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_mostrarLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel_mostrarLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel_mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_pesquisar_produto_Listar1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_codigo_prod_listar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_listar_produtos, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_listar_produtosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_listar_produtosActionPerformed
        
        //List<ProdutoDao> pd = (List<ProdutoDao>) new ProdutoDao();
        
        List<Produto> produtos = new ProdutoDao().read();
       for(int i = 0; i < produtos.size(); i++){
          // int j = 0;
           int k = 0;
                   
            jTable_produtos.setValueAt(produtos.get(i).getCod_produto(), i, k);
            jTable_produtos.setValueAt(produtos.get(i).getNome_produto(), i, k+1);
            jTable_produtos.setValueAt(produtos.get(i).getQuantidade_produto(), i, k+2);
            jTable_produtos.setValueAt(produtos.get(i).getPreco_produto(), i, k+3);
            jTable_produtos.setValueAt(produtos.get(i).getFornecedor_produto(), i, k+4);
            
            //j++;
            k++;
            
        }
       
        /*
         for(Produto p : produtos){
             int i = -1;
             
            jTable_produtos.setValueAt(p.getCod_produto(), i+1, i+1);
            jTable_produtos.setValueAt(p.getNome_produto(), i+1, i+2);
            jTable_produtos.setValueAt(p.getQuantidade_produto(), i+1, i+3);
            jTable_produtos.setValueAt(p.getPreco_produto(), i+1, i+4);
            jTable_produtos.setValueAt(p.getFornecedor_produto(), i+1, i+5);
            
           
             
           
        }
       
                */
      
    }//GEN-LAST:event_jButton_listar_produtosActionPerformed

    private void jButton_pesquisar_produto_Listar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_pesquisar_produto_Listar1ActionPerformed
        List<Produto> produtos = new ProdutoDao().read();
        
        String codigoDigitado = jTextField_codigo_prod_listar.getText();
     
        for(Produto p : produtos){
           
            String pd = Integer.toString(p.getCod_produto());
                        
            if(codigoDigitado.equals(pd)){
                jTable_produtos.setValueAt(p.getCod_produto(), 0, 0);
                jTable_produtos.setValueAt(p.getNome_produto(), 0, 1);
                jTable_produtos.setValueAt(p.getQuantidade_produto(), 0, 2);
                jTable_produtos.setValueAt(p.getPreco_produto(), 0, 3);
                jTable_produtos.setValueAt(p.getFornecedor_produto(), 0, 4);
                                
            } else{
                
                JOptionPane.showMessageDialog(null, "Não encontrado!");
                   
            } 
            
        }
        
        /*Produto_view pv = new Produto_view();
        pv.setVisible(true);
        */
        

    }//GEN-LAST:event_jButton_pesquisar_produto_Listar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Mostrar_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mostrar_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mostrar_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mostrar_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mostrar_produto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_listar_produtos;
    private javax.swing.JButton jButton_pesquisar_produto_Listar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel_mostrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_produtos;
    private javax.swing.JTextField jTextField_codigo_prod_listar;
    // End of variables declaration//GEN-END:variables
}
