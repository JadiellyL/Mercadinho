
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import model.Login;
import model.Vendedor;
import model.dao.VendedorDao;
import interfaceSwing.Login_view;
import view.Vendedorr;
import view.Vendedorr;

 public class botaoCadastrar implements ActionListener{
      
   
        @Override
        public void actionPerformed(ActionEvent e) {
            Vendedor v = new Vendedor();
            VendedorDao vd = new VendedorDao();
            Vendedorr vn = new Vendedorr();
            
            
                v.setNome_vendedor(vn.cadastro_nome_vendedor.getText());
                v.setSexo_vendedor(vn.cadastro_sexo_vendedor.getText());
                v.setSenha_vendedor(vn.cadastro_senha_vendedor.getText());

                vd.create(v);
                //limparCampos();
            
            
        }
}