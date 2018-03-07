
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;
import model.ConnectionFactory;
import model.Produto;
import model.Venda;


public class ClienteDao {

    
        public void create(Cliente c){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO Cliente (cpf_cliente,nome_cliente, "
                    + "sexo_cliente, rua_cliente,numeracao_casa_cliente, "
                    + "bairro_cliente,cidade_cliente, celular_cliente) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            
            stmt.setString(1,c.getCpf_cliente());
            stmt.setString(2,c.getNome_cliente());
            stmt.setString(3,c.getSexo_cliente());
            stmt.setString(4,c.getRua_cliente());
            stmt.setInt(5,c.getNumeracao_casa_cliente());
            stmt.setString(6,c.getBairro_cliente());
            stmt.setString(7,c.getCidade_cliente());
            stmt.setString(8, c.getCelular_cliente());
            
            
            stmt.executeLargeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!" + ex);
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
        
        
    }
        
    public List<Cliente> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Cliente> clientes = new ArrayList<>();
        
        
        
            try {
                stmt = con.prepareStatement("SELECT * FROM Cliente");
                rs = stmt.executeQuery();
                
                while (rs.next()) {                    
                    Cliente c = new Cliente();
                    c.setCpf_cliente(rs.getString("cpf_cliente"));
                    c.setNome_cliente(rs.getString("nome_cliente"));
                    c.setSexo_cliente(rs.getString("sexo_cliente"));
                    c.setRua_cliente(rs.getString("rua_cliente"));
                    c.setNumeracao_casa_cliente(rs.getInt("numeracao_casa_cliente"));
                    c.setBairro_cliente(rs.getString("bairro_cliente"));
                    c.setCidade_cliente(rs.getString("cidade_cliente"));
                    c.setCelular_cliente(rs.getString("celular_cliente"));
                    
                 
                    clientes.add(c);
                    
                }
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro" + ex);
            }finally{
                ConnectionFactory.closeConnection(con, stmt, rs);
            }
        
            return clientes;
    }
    
    
        
        public void update(Cliente c){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE Cliente SET nome_cliente = ?, sexo_cliente = ?,"
                    + " rua_cliente = ?, numeracao_casa_cliente = ?, bairro_cliente = ?, cidade_cliente = ?, celular_cliente = ?"
                    + " WHERE cpf_cliente = ?");
                        
            stmt.setString(1, c.getNome_cliente());
            stmt.setString(2, c.getSexo_cliente());
            stmt.setString(3, c.getRua_cliente());
            stmt.setInt(4, c.getNumeracao_casa_cliente());
            stmt.setString(5, c.getBairro_cliente());
            stmt.setString(6, c.getCidade_cliente());
            stmt.setString(7, c.getCelular_cliente());
            stmt.setString(8, c.getCpf_cliente());
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!" + ex);
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    
    }
        
    public void delete(Cliente c){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM Cliente WHERE cpf_cliente=?");
            stmt.setString(1, c.getCpf_cliente());
           
            stmt.executeLargeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluído!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!" + ex);
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
            
    }

}


    

