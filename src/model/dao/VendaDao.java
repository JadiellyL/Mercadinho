
package model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import model.ConnectionFactory;
import model.Produto;
import model.Venda;


public class VendaDao {

    public VendaDao() {
    }

    
        public void create(Venda v){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO Venda(cod_venda,data_venda, "
                    + "cpf_clienteFk, valorTotal_venda, venda_aprazo_avista) VALUES (?, ?, ?, ?, ?)");
            
            stmt.setInt(1,v.getCod_venda());
            stmt.setDate(2, v.getData_venda());
            stmt.setString(3,v.getCpf_cliente());
            stmt.setDouble(4, v.getValorTotal_venda());
            stmt.setString(5, v.getVenda_aprazo_avista());
                        
            stmt.executeLargeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!" + ex);
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
        
        
    }
        
    public List<Venda> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Venda> vendas = new ArrayList<>();
        
            try {
                stmt = con.prepareStatement("SELECT * FROM Venda");
                rs = stmt.executeQuery();
                
                while (rs.next()) {                    
                    Venda v = new Venda();
                    v.setCod_venda(rs.getInt("cod_venda"));
                    v.setData_venda(rs.getDate("data_venda"));
                    v.setCpf_cliente(rs.getString("cpf_clienteFk"));
                    v.setValorTotal_venda(rs.getDouble("valorTotal_venda"));
                    v.setVenda_aprazo_avista(rs.getString("venda_aprazo_avista"));
                                       
                    
                    vendas.add(v);
                    
                    
                }
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro" + ex);
            }finally{
                ConnectionFactory.closeConnection(con, stmt, rs);
            }
        
            return vendas;
    }
    
    
    public void update(Venda v){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE Venda SET data_venda = ?, cpf_clienteFk = ?, valorTotal_venda = ?,"
                    + "venda_aprazo_avista = ?  WHERE cod_venda = ?");
                        
            stmt.setDate(1, v.getData_venda());
            stmt.setString(2, v.getCpf_cliente());
            stmt.setDouble(3, v.getValorTotal_venda());
            stmt.setString(4, v.getVenda_aprazo_avista());
            stmt.setInt(5, v.getCod_venda());
            
            
            stmt.executeUpdate();
            
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!" + ex);
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    
    }
        
    public void delete(Venda v){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM Venda WHERE cod_venda=?");
            stmt.setInt(1, v.getCod_venda());
           
            stmt.executeLargeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluído!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!" + ex);
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
            
    }
    /*
    public List<Venda> Join(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Venda> vendas = new ArrayList<>();
        
        
        
            try {
                stmt = con.prepareStatement("SELECT v.cod_venda FROM Venda v" + 
                        "INNER JOIN Venda_produto vp ON v.cod_venda = vp.cod_vendaFk ORDER BY cod_venda");
                rs = stmt.executeQuery();
                
                while (rs.next()) {                    
                    Venda v = new Venda();
                    v.setCod_venda(rs.getInt("cod_venda"));
                    
                                       
                    
                    vendas.add(v);
                    
                    
                }
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro" + ex);
            }finally{
                ConnectionFactory.closeConnection(con, stmt, rs);
            }
        
            return vendas;
    }
*/

}

