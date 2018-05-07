/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceSwing;


import java.util.List;
import javax.swing.JOptionPane;
import model.Produto;
import model.dao.ProdutoDao;

/**
 *
 * @author jade
 */
public class Produto_view extends javax.swing.JFrame {

    /**
     * Creates new form Produto
     */
    public Produto_view() {
        initComponents();
        jButton_excluir_produto.setVisible(false);
        jButton_salvar_produto.setVisible(false);
        jButton_voltar_produto.setVisible(false);
        jButton_pesquisar_produto.setVisible(false);
        pesquisar_codigo_produto.setVisible(false);
        jlabel_codigo_produto_pesq.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Cadastro_Nome_produto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Cadastro_quantidade_produto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cadastro_fornecedor_produto = new javax.swing.JTextField();
        cadastro_preco_produto = new javax.swing.JTextField();
        jlabel_codigo_produto_pesq = new javax.swing.JLabel();
        pesquisar_codigo_produto = new javax.swing.JTextField();
        jButton_pesquisar_produto = new javax.swing.JButton();
        jbutton_cadastrar_produto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton_excluir_produto = new javax.swing.JButton();
        jButton_salvar_produto = new javax.swing.JButton();
        jButton_voltar_produto = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_arquivo_produto = new javax.swing.JMenu();
        jMenuItem_editar_produto = new javax.swing.JMenuItem();
        jMenuItem_excluir_produto = new javax.swing.JMenuItem();
        jMenuItem_listar_produto = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(880, 565));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setFont(new java.awt.Font("Bitstream Vera Serif", 1, 14)); // NOI18N
        jPanel1.setMaximumSize(null);
        jPanel1.setName("Cadastrar Produto"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 200));

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nome:");

        Cadastro_Nome_produto.setBackground(new java.awt.Color(255, 255, 255));
        Cadastro_Nome_produto.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quantidade:");

        Cadastro_quantidade_produto.setBackground(new java.awt.Color(255, 255, 255));
        Cadastro_quantidade_produto.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Preço:");

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fornecedor:");

        cadastro_fornecedor_produto.setBackground(new java.awt.Color(255, 255, 255));
        cadastro_fornecedor_produto.setBorder(null);

        cadastro_preco_produto.setBackground(new java.awt.Color(255, 255, 255));
        cadastro_preco_produto.setBorder(null);

        jlabel_codigo_produto_pesq.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jlabel_codigo_produto_pesq.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_codigo_produto_pesq.setText("Código:");

        pesquisar_codigo_produto.setBackground(new java.awt.Color(255, 255, 255));
        pesquisar_codigo_produto.setBorder(null);
        pesquisar_codigo_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisar_codigo_produtoActionPerformed(evt);
            }
        });

        jButton_pesquisar_produto.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton_pesquisar_produto.setIcon(new javax.swing.ImageIcon("/home/jade/NetBeansProjects/mercadinho_tiuzinho/src/img/pesquisarCli.png")); // NOI18N
        jButton_pesquisar_produto.setText("Pesquisar");
        jButton_pesquisar_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_pesquisar_produtoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Cadastro_quantidade_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cadastro_Nome_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(cadastro_fornecedor_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(260, 260, 260)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pesquisar_codigo_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlabel_codigo_produto_pesq)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(cadastro_preco_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(35, 35, 35)
                        .addComponent(jButton_pesquisar_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cadastro_preco_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cadastro_Nome_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jlabel_codigo_produto_pesq, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pesquisar_codigo_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_pesquisar_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cadastro_fornecedor_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cadastro_quantidade_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );

        jbutton_cadastrar_produto.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jbutton_cadastrar_produto.setText("Cadastrar");
        jbutton_cadastrar_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_cadastrar_produtoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jLabel2.setText("Dados do Produto:");

        jButton_excluir_produto.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton_excluir_produto.setText("Excluir");
        jButton_excluir_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_excluir_produtoActionPerformed(evt);
            }
        });

        jButton_salvar_produto.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton_salvar_produto.setText("Salvar");
        jButton_salvar_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_salvar_produtoActionPerformed(evt);
            }
        });

        jButton_voltar_produto.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jButton_voltar_produto.setText("Voltar");
        jButton_voltar_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_voltar_produtoActionPerformed(evt);
            }
        });

        jMenuBar1.setPreferredSize(new java.awt.Dimension(100, 40));

        jMenu_arquivo_produto.setIcon(new javax.swing.ImageIcon("/home/jade/NetBeansProjects/mercadinho_tiuzinho/src/img/opcoes.png")); // NOI18N
        jMenu_arquivo_produto.setText("Opções");

        jMenuItem_editar_produto.setIcon(new javax.swing.ImageIcon("/home/jade/NetBeansProjects/mercadinho_tiuzinho/src/img/editar_produt.png")); // NOI18N
        jMenuItem_editar_produto.setText("Editar Cadastro de produto");
        jMenuItem_editar_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_editar_produtoActionPerformed(evt);
            }
        });
        jMenu_arquivo_produto.add(jMenuItem_editar_produto);

        jMenuItem_excluir_produto.setIcon(new javax.swing.ImageIcon("/home/jade/NetBeansProjects/mercadinho_tiuzinho/src/img/excluir_produto.png")); // NOI18N
        jMenuItem_excluir_produto.setText("Excluir Cadastro de produto");
        jMenuItem_excluir_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_excluir_produtoActionPerformed(evt);
            }
        });
        jMenu_arquivo_produto.add(jMenuItem_excluir_produto);

        jMenuItem_listar_produto.setBackground(new java.awt.Color(217, 205, 205));
        jMenuItem_listar_produto.setIcon(new javax.swing.ImageIcon("/home/jade/NetBeansProjects/mercadinho_tiuzinho/src/img/listar_clientes.png")); // NOI18N
        jMenuItem_listar_produto.setText("Listar Produto");
        jMenuItem_listar_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_listar_produtoActionPerformed(evt);
            }
        });
        jMenu_arquivo_produto.add(jMenuItem_listar_produto);

        jMenuBar1.add(jMenu_arquivo_produto);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(jButton_excluir_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbutton_cadastrar_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_salvar_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_voltar_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)))
                .addContainerGap(98, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 882, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_excluir_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbutton_cadastrar_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_salvar_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_voltar_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbutton_cadastrar_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_cadastrar_produtoActionPerformed
        // TODO add your handling code here:
        Produto p = new Produto();
             
        ProdutoDao pd = new ProdutoDao();
        
        p.setNome_produto(Cadastro_Nome_produto.getText());
        p.setQuantidade_produto(Integer.parseInt(Cadastro_quantidade_produto.getText()));
        p.setPreco_produto(Double.parseDouble(cadastro_preco_produto.getText()));
        p.setFornecedor_produto(cadastro_fornecedor_produto.getText());
                        
        pd.create(p);
        
        Cadastro_Nome_produto.setText("");
        Cadastro_quantidade_produto.setText("");
        cadastro_preco_produto.setText("");
        cadastro_fornecedor_produto.setText("");
        
     
       
    }//GEN-LAST:event_jbutton_cadastrar_produtoActionPerformed

    private void jMenuItem_listar_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_listar_produtoActionPerformed
        Mostrar_produto mp = new Mostrar_produto();
        mp.setVisible(true);
    }//GEN-LAST:event_jMenuItem_listar_produtoActionPerformed

    private void jMenuItem_editar_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_editar_produtoActionPerformed
        jbutton_cadastrar_produto.setVisible(false);
        jButton_salvar_produto.setVisible(true);
        jButton_voltar_produto.setVisible(true);
        jButton_pesquisar_produto.setVisible(true);
        jlabel_codigo_produto_pesq.setVisible(true);
        pesquisar_codigo_produto.setVisible(true);
    }//GEN-LAST:event_jMenuItem_editar_produtoActionPerformed

    private void jMenuItem_excluir_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_excluir_produtoActionPerformed
        jbutton_cadastrar_produto.setVisible(false);
        jButton_excluir_produto.setVisible(true);
        jButton_voltar_produto.setVisible(true);
        jButton_pesquisar_produto.setVisible(true);
        jlabel_codigo_produto_pesq.setVisible(true);
        pesquisar_codigo_produto.setVisible(true);
    }//GEN-LAST:event_jMenuItem_excluir_produtoActionPerformed

    private void pesquisar_codigo_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisar_codigo_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisar_codigo_produtoActionPerformed

    private void jButton_voltar_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_voltar_produtoActionPerformed
       jbutton_cadastrar_produto.setVisible(true);
        jButton_pesquisar_produto.setVisible(false);
        jButton_salvar_produto.setVisible(false);
        jButton_voltar_produto.setVisible(false);
        jButton_excluir_produto.setVisible(false);
        jlabel_codigo_produto_pesq.setVisible(false);
        pesquisar_codigo_produto.setVisible(false);
    }//GEN-LAST:event_jButton_voltar_produtoActionPerformed

    private void jButton_salvar_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_salvar_produtoActionPerformed
        ProdutoDao pd = new ProdutoDao();
        
        Produto p = new Produto();
        
        p.setCod_produto(Integer.parseInt(pesquisar_codigo_produto.getText()));
        p.setNome_produto(Cadastro_Nome_produto.getText());
        p.setQuantidade_produto(Integer.parseInt(Cadastro_quantidade_produto.getText()));
        p.setPreco_produto(Double.parseDouble(cadastro_preco_produto.getText()));
        p.setFornecedor_produto(cadastro_fornecedor_produto.getText());
          
        
        pd.update(p);
        
       limparCampos();
    }//GEN-LAST:event_jButton_salvar_produtoActionPerformed

    private void jButton_excluir_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_excluir_produtoActionPerformed
       ProdutoDao prodd = new ProdutoDao();
       
       Produto p = new Produto();
       
       p.setCod_produto(Integer.parseInt(pesquisar_codigo_produto.getText()));
       //p.setNome_produto(editar_nome_produto.getText());
       // p.setQuantidade_produto(Integer.parseInt(editar_quantidade_produto.getText()));
        //p.setPreco_produto(Double.parseDouble(editar_preco_produto.getText()));
        //p.setFornecedor_produto(editar_fornecedor_produto.getText());
        
       prodd.delete(p);
            
       limparCampos();
    }//GEN-LAST:event_jButton_excluir_produtoActionPerformed

    private void jButton_pesquisar_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_pesquisar_produtoActionPerformed
         List<Produto> produtos = new ProdutoDao().read();
        
        ProdutoDao ptd = new ProdutoDao();
        boolean achou = false;
        
        String codigoDigitado = pesquisar_codigo_produto.getText();
        
        for(int i = 0; i < produtos.size(); i++){
           
            String pd = Integer.toString(produtos.get(i).getCod_produto());
                       
            if(codigoDigitado.equals(pd)){
                 achou = true;
                Cadastro_Nome_produto.setText(produtos.get(i).getNome_produto());
                Cadastro_quantidade_produto.setText(Integer.toString(produtos.get(i).getQuantidade_produto()));
                cadastro_preco_produto.setText(Double.toString(produtos.get(i).getPreco_produto()));
                cadastro_fornecedor_produto.setText(produtos.get(i).getFornecedor_produto());
               
                }
        }
        
           JOptionPane.showMessageDialog(null, achou);
    }//GEN-LAST:event_jButton_pesquisar_produtoActionPerformed
    
    public void limparCampos(){
        pesquisar_codigo_produto.setText("");
        Cadastro_Nome_produto.setText("");
        Cadastro_quantidade_produto.setText("");
        cadastro_preco_produto.setText("");
        cadastro_fornecedor_produto.setText("");
    }
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
            java.util.logging.Logger.getLogger(Produto_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produto_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produto_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produto_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produto_view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cadastro_Nome_produto;
    private javax.swing.JTextField Cadastro_quantidade_produto;
    private javax.swing.JTextField cadastro_fornecedor_produto;
    private javax.swing.JTextField cadastro_preco_produto;
    private javax.swing.JButton jButton_excluir_produto;
    private javax.swing.JButton jButton_pesquisar_produto;
    private javax.swing.JButton jButton_salvar_produto;
    private javax.swing.JButton jButton_voltar_produto;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_editar_produto;
    private javax.swing.JMenuItem jMenuItem_excluir_produto;
    private javax.swing.JMenuItem jMenuItem_listar_produto;
    private javax.swing.JMenu jMenu_arquivo_produto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbutton_cadastrar_produto;
    private javax.swing.JLabel jlabel_codigo_produto_pesq;
    private javax.swing.JTextField pesquisar_codigo_produto;
    // End of variables declaration//GEN-END:variables

    
}
