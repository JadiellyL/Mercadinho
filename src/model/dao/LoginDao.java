
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.ConnectionFactory;
import model.Login;
import model.Produto;

/**
 *
 * @author jade
 */
public class LoginDao {
    
public void create(Login l){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO Login "
                    + "(cod_login,senha_login,cod_vendedorFk, data_login) "
                    + "VALUES (?, ?, ?, ?)");
            
            stmt.setInt(1, l.getCod_login());
            stmt.setString(2, l.getSenha_vendedor());
            stmt.setInt(3, l.getCod_vendedorFk());
            stmt.setDate(4, l.getData_login());
                        
            stmt.executeLargeUpdate();
            
            //JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro em usuário ou senha!" + ex);
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
        
        
    }

public List<Login> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Login> login = new ArrayList<>();
        
        
        
            try {
                stmt = con.prepareStatement("SELECT * FROM Login");
                rs = stmt.executeQuery();
                
                while (rs.next()) {   
                    Login log = new Login();
                    log.setCod_login(rs.getInt("cod_login"));
                    log.setSenha_vendedor(rs.getString("senha_login"));
                    log.setCod_vendedorFk(rs.getInt("cod_vendedorFk"));
                    log.setData_login(rs.getDate("data_login"));
                                        
                    login.add(log);
                    
                }
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro" + ex);
            }finally{
                ConnectionFactory.closeConnection(con, stmt, rs);
            }
        
            return login;
    }

    
}
