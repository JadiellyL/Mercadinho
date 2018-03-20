/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceSwing;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ConnectionFactory;
import model.Produto;
import model.dao.ProdutoDao;

/**
 *
 * @author jade
 */
public class Editar_produto extends javax.swing.JFrame {

    /**
     * Creates new form Editar_produto
     */
    public Editar_produto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_codigo_edit_prod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        editar_nome_produto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        editar_quantidade_produto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        editar_preco_produto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        editar_fornecedor_produto = new javax.swing.JTextField();
        jButton_alterar_produto = new javax.swing.JButton();
        jButton_buscar_editarProd = new javax.swing.JButton();
        jButton_excluir_produto = new javax.swing.JButton();
        botao_limpar_campos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(101, 116, 203));
        jPanel1.setPreferredSize(new java.awt.Dimension(1370, 700));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Digite o código do Produto");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Código:");

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quantidade:");

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Preço:");

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fornecedor:");

        jButton_alterar_produto.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton_alterar_produto.setText("Salvar");
        jButton_alterar_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_alterar_produtoActionPerformed(evt);
            }
        });

        jButton_buscar_editarProd.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton_buscar_editarProd.setForeground(new java.awt.Color(0, 0, 0));
        jButton_buscar_editarProd.setText("Buscar");
        jButton_buscar_editarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscar_editarProdActionPerformed(evt);
            }
        });

        jButton_excluir_produto.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton_excluir_produto.setText("Excluir");
        jButton_excluir_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_excluir_produtoActionPerformed(evt);
            }
        });

        botao_limpar_campos.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        botao_limpar_campos.setForeground(new java.awt.Color(0, 0, 0));
        botao_limpar_campos.setText("Limpar");
        botao_limpar_campos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_limpar_camposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(427, 427, 427)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(9, 9, 9))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editar_quantidade_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editar_fornecedor_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editar_preco_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_codigo_edit_prod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editar_nome_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_buscar_editarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(531, 531, 531))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(460, 460, 460))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_alterar_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botao_limpar_campos, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_excluir_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(562, 562, 562))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_codigo_edit_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_buscar_editarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editar_nome_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editar_quantidade_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editar_preco_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editar_fornecedor_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_alterar_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_excluir_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_limpar_campos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, 1444, 1444, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, 744, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_buscar_editarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscar_editarProdActionPerformed
                     
        List<Produto> produtos = new ProdutoDao().read();
        
        ProdutoDao ptd = new ProdutoDao();
       
        
        String codigoDigitado = jTextField_codigo_edit_prod.getText();
        
        for(Produto p : produtos){
           
            String pd = Integer.toString(p.getCod_produto());
             
                        
            if(codigoDigitado.equals(pd)){
                //JOptionPane.showMessageDialog(null, "Encontrado!");
                
                editar_nome_produto.setText(p.getNome_produto());
                editar_quantidade_produto.setText(Integer.toString(p.getQuantidade_produto()));
                editar_preco_produto.setText(Double.toString(p.getPreco_produto()));
                editar_fornecedor_produto.setText(p.getFornecedor_produto());
               
                }else{
            //if(!codigoDigitado.equals(pd)){
                    
                    //JOptionPane.showMessageDialog(null, "Não encontrado!");
                   
               }
        }
        
            
            
   
    }//GEN-LAST:event_jButton_buscar_editarProdActionPerformed

    public void limparCampos(){
        
        jTextField_codigo_edit_prod.setText("");
        editar_nome_produto.setText("");
        editar_quantidade_produto.setText("");
        editar_preco_produto.setText("");
        editar_fornecedor_produto.setText("");
    }
    
    private void jButton_alterar_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_alterar_produtoActionPerformed
        // TODO add your handling code here:
        
        ProdutoDao pd = new ProdutoDao();
        
        Produto p = new Produto();
        
        p.setCod_produto(Integer.parseInt(jTextField_codigo_edit_prod.getText()));
        p.setNome_produto(editar_nome_produto.getText());
        p.setQuantidade_produto(Integer.parseInt(editar_quantidade_produto.getText()));
        p.setPreco_produto(Double.parseDouble(editar_preco_produto.getText()));
        p.setFornecedor_produto(editar_fornecedor_produto.getText());
          
        
        pd.update(p);
        
       limparCampos();
    }//GEN-LAST:event_jButton_alterar_produtoActionPerformed

    private void jButton_excluir_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_excluir_produtoActionPerformed
       ProdutoDao prodd = new ProdutoDao();
       
       Produto p = new Produto();
       
         p.setCod_produto(Integer.parseInt(jTextField_codigo_edit_prod.getText()));
        //p.setNome_produto(editar_nome_produto.getText());
       // p.setQuantidade_produto(Integer.parseInt(editar_quantidade_produto.getText()));
        //p.setPreco_produto(Double.parseDouble(editar_preco_produto.getText()));
        //p.setFornecedor_produto(editar_fornecedor_produto.getText());
          
       
       prodd.delete(p);
            
        limparCampos();
    }//GEN-LAST:event_jButton_excluir_produtoActionPerformed

    private void botao_limpar_camposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_limpar_camposActionPerformed
        
        limparCampos();
        
    }//GEN-LAST:event_botao_limpar_camposActionPerformed

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
            java.util.logging.Logger.getLogger(Editar_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar_produto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar_produto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_limpar_campos;
    private javax.swing.JTextField editar_fornecedor_produto;
    private javax.swing.JTextField editar_nome_produto;
    private javax.swing.JTextField editar_preco_produto;
    private javax.swing.JTextField editar_quantidade_produto;
    private javax.swing.JButton jButton_alterar_produto;
    private javax.swing.JButton jButton_buscar_editarProd;
    private javax.swing.JButton jButton_excluir_produto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_codigo_edit_prod;
    // End of variables declaration//GEN-END:variables
}