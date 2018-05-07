/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceSwing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import model.Venda;

/**
 *
 * @author jade
 */
public class Pagina_inicial_view extends javax.swing.JFrame {

    /**
     * Creates new form Pagina_inicial
     */
    
   
    public Pagina_inicial_view() {
        initComponents();
       cadastrarCliente.setToolTipText("Cadastrar Cliente");
       cadastrar_Vendedor.setToolTipText("Cadastrar Vendedor");
       cadastrar_produto.setToolTipText("Cadastrar Produto");
       efetuar_venda.setToolTipText("Efetuar Venda");
       relatorio.setToolTipText("Relatórios");
       verPreco.setToolTipText("Ver preço de produto");
       sair.setToolTipText("Sair");
      
       Venda v = new Venda ();
        
       
        Date dat;
        dat = new Date();
        SimpleDateFormat formato;
        formato = new SimpleDateFormat("dd-MM-YYYY");
        dataAtual.setText(formato.format(dat));
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jPanel3 = new javax.swing.JPanel();
        icone = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dataAtual = new javax.swing.JLabel();
        cadastrarCliente = new javax.swing.JLabel();
        cadastrar_Vendedor = new javax.swing.JLabel();
        cadastrar_produto = new javax.swing.JLabel();
        efetuar_venda = new javax.swing.JLabel();
        relatorio = new javax.swing.JLabel();
        verPreco = new javax.swing.JLabel();
        sair = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));

        icone.setIcon(new javax.swing.ImageIcon("/home/jade/NetBeansProjects/mercadinho_tiuzinho/src/img/shopping_22120.png")); // NOI18N
        icone.setBorder(null);
        icone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconeMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Schoolbook L", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bem-Vindo ");

        dataAtual.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        dataAtual.setForeground(new java.awt.Color(255, 255, 255));
        dataAtual.setText("-/-/-");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dataAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(icone, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(dataAtual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 232, Short.MAX_VALUE)
                .addComponent(icone, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cadastrarCliente.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        cadastrarCliente.setForeground(new java.awt.Color(0, 0, 0));
        cadastrarCliente.setIcon(new javax.swing.ImageIcon("/home/jade/NetBeansProjects/mercadinho_tiuzinho/src/img/usuario.png")); // NOI18N
        cadastrarCliente.setText("Cliente");
        cadastrarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));
        cadastrarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarClienteMouseClicked(evt);
            }
        });

        cadastrar_Vendedor.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        cadastrar_Vendedor.setForeground(new java.awt.Color(0, 0, 0));
        cadastrar_Vendedor.setIcon(new javax.swing.ImageIcon("/home/jade/NetBeansProjects/mercadinho_tiuzinho/src/img/adicionarVendedor.png")); // NOI18N
        cadastrar_Vendedor.setText("Vendedor");
        cadastrar_Vendedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));
        cadastrar_Vendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrar_VendedorMouseClicked(evt);
            }
        });

        cadastrar_produto.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        cadastrar_produto.setForeground(new java.awt.Color(0, 0, 0));
        cadastrar_produto.setIcon(new javax.swing.ImageIcon("/home/jade/NetBeansProjects/mercadinho_tiuzinho/src/img/adicionar_produto.png")); // NOI18N
        cadastrar_produto.setText("Produto");
        cadastrar_produto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));
        cadastrar_produto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrar_produtoMouseClicked(evt);
            }
        });

        efetuar_venda.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        efetuar_venda.setForeground(new java.awt.Color(0, 0, 0));
        efetuar_venda.setIcon(new javax.swing.ImageIcon("/home/jade/NetBeansProjects/mercadinho_tiuzinho/src/img/cesta_de_compra.png")); // NOI18N
        efetuar_venda.setText("Vender");
        efetuar_venda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));
        efetuar_venda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                efetuar_vendaMouseClicked(evt);
            }
        });

        relatorio.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        relatorio.setForeground(new java.awt.Color(0, 0, 0));
        relatorio.setIcon(new javax.swing.ImageIcon("/home/jade/NetBeansProjects/mercadinho_tiuzinho/src/img/saldo.png")); // NOI18N
        relatorio.setText("Financeiro");
        relatorio.setToolTipText("");
        relatorio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));
        relatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                relatorioMouseClicked(evt);
            }
        });

        verPreco.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        verPreco.setIcon(new javax.swing.ImageIcon("/home/jade/NetBeansProjects/mercadinho_tiuzinho/src/img/pesquisar_vendedor.png")); // NOI18N
        verPreco.setText("Ver Preço");
        verPreco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));
        verPreco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verPrecoMouseClicked(evt);
            }
        });

        sair.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        sair.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sair.setIcon(new javax.swing.ImageIcon("/home/jade/NetBeansProjects/mercadinho_tiuzinho/src/img/sair.png")); // NOI18N
        sair.setText("Sair");
        sair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cadastrarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastrar_Vendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastrar_produto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(efetuar_venda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(relatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verPreco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sair)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastrar_Vendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cadastrar_produto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(efetuar_venda, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(verPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(relatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrar_VendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrar_VendedorMouseClicked
       Vendedor_view vd = new Vendedor_view();
        vd.setVisible(true);
    }//GEN-LAST:event_cadastrar_VendedorMouseClicked

    private void efetuar_vendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_efetuar_vendaMouseClicked
        Vendas_view vv = new Vendas_view();
        vv.setVisible(true);
    }//GEN-LAST:event_efetuar_vendaMouseClicked

    private void cadastrar_produtoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrar_produtoMouseClicked
        Produto_view pv = new Produto_view();
        pv.setVisible(true);
        
    }//GEN-LAST:event_cadastrar_produtoMouseClicked

    private void iconeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_iconeMouseClicked

    private void cadastrarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarClienteMouseClicked
       Cliente_view cv = new Cliente_view();
        cv.setVisible(true);
    }//GEN-LAST:event_cadastrarClienteMouseClicked

    private void relatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_relatorioMouseClicked
        Relatorios_view rv = new Relatorios_view();
        rv.setVisible(true);
    }//GEN-LAST:event_relatorioMouseClicked

    private void verPrecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verPrecoMouseClicked
        Mostrar_produto mp = new Mostrar_produto();
        mp.setVisible(true);
    }//GEN-LAST:event_verPrecoMouseClicked

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
        Pagina_inicial_view pi = new Pagina_inicial_view();
        pi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
                
    }//GEN-LAST:event_sairMouseClicked

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
            java.util.logging.Logger.getLogger(Pagina_inicial_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagina_inicial_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagina_inicial_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagina_inicial_view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagina_inicial_view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadastrarCliente;
    private javax.swing.JLabel cadastrar_Vendedor;
    private javax.swing.JLabel cadastrar_produto;
    private javax.swing.JLabel dataAtual;
    private javax.swing.JLabel efetuar_venda;
    private javax.swing.JLabel icone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JLabel relatorio;
    private javax.swing.JLabel sair;
    private javax.swing.JLabel verPreco;
    // End of variables declaration//GEN-END:variables
}
