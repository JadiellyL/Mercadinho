
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.ConnectionFactory;
import model.Venda;
import model.Vendedor;

/**
 *
 * @author jade
 */
public class VendedorDao {
    
    public void create(Vendedor v){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO Vendedor(cod_vendedor, nome_vendedor, sexo_vendedor, senha_vendedor)"
                    + " VALUES (?, ?, ?, ?)");
            
            stmt.setInt(1,v.getCod_vendedor());
            stmt.setString(2, v.getNome_vendedor());
            stmt.setString(3,v.getSexo_vendedor());
            stmt.setString(4, v.getSenha_vendedor());
                                    
            stmt.executeLargeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!" + ex);
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
        
        
    }
    
    public List<Vendedor> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Vendedor> vendedores = new ArrayList<>();
        
            try {
                stmt = con.prepareStatement("SELECT * FROM Vendedor");
                rs = stmt.executeQuery();
                
                while (rs.next()) {                    
                    Vendedor v = new Vendedor();
                    v.setCod_vendedor(rs.getInt("cod_vendedor"));
                    v.setNome_vendedor(rs.getString("nome_vendedor"));
                    v.setSexo_vendedor(rs.getString("sexo_vendedor"));
                    v.setSenha_vendedor(rs.getString("senha_vendedor"));
                                        
                    vendedores.add(v);
                    
                    
                }
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro" + ex);
            }finally{
                ConnectionFactory.closeConnection(con, stmt, rs);
            }
        
            return vendedores;
    }
    
    
    public void update(Vendedor v){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE Vendedor SET nome_vendedor = ?, sexo_vendedor = ?, "
                    + "senha_vendedor = ? WHERE cod_vendedor = ?");
                        
            stmt.setString(1, v.getNome_vendedor());
            stmt.setString(2, v.getSexo_vendedor());
            stmt.setString(3, v.getSenha_vendedor());
            stmt.setInt(4, v.getCod_vendedor());
            
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!" + ex);
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    
    }
        
    public void delete(Vendedor v){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM Vendedor WHERE cod_vendedor = ?");
            stmt.setInt(1, v.getCod_vendedor());
           
            stmt.executeLargeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluído!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!" + ex);
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
            
    }
    
}
