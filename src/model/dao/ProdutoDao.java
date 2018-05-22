
package model.dao;

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
import interfaceSwing.Produto_view;


public class ProdutoDao {
    
        public void create(Produto p){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            
            stmt = con.prepareStatement("INSERT INTO Produto "
                    + "(cod_produto,quantidade_produto, "
                    + "preco_produto, fornecedor_produto,nome_produto) "
                    + "VALUES (?, ?, ?, ?, ?)");
            
            stmt.setLong(1, p.getCod_produto());
            stmt.setInt(2, p.getQuantidade_produto());
            stmt.setDouble(3, p.getPreco_produto());
            stmt.setString(4, p.getFornecedor_produto());
            stmt.setString(5, p.getNome_produto());
            
            stmt.executeLargeUpdate();
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!" + ex);
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
        
        
    }
        
    public List<Produto> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        
        
            try {
                stmt = con.prepareStatement("SELECT * FROM Produto");
                rs = stmt.executeQuery();
                
                while (rs.next()) {                    
                    Produto produto = new Produto();
                    produto.setCod_produto(rs.getLong("cod_produto"));
                    produto.setQuantidade_produto(rs.getInt("quantidade_produto"));
                    produto.setPreco_produto(rs.getDouble("preco_produto"));
                    produto.setFornecedor_produto(rs.getString("fornecedor_produto"));
                    produto.setNome_produto(rs.getString("nome_produto"));
                    
                    
                    produtos.add(produto);
                    
                }
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro" + ex);
            }finally{
                ConnectionFactory.closeConnection(con, stmt, rs);
            }
        
            return produtos;
    }
    
    
        
        public void update(Produto p){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE Produto SET quantidade_produto = ?, preco_produto = ?, fornecedor_produto = ?, nome_produto = ? WHERE cod_produto = ?");
                        
            
            stmt.setInt(1, p.getQuantidade_produto());
            stmt.setDouble(2, p.getPreco_produto());
            stmt.setString(3, p.getFornecedor_produto());
            stmt.setString(4, p.getNome_produto());
            stmt.setLong(5, p.getCod_produto());
            
            stmt.executeUpdate();
            
            //JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar!" + ex);
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
    
    }
        
    public void delete(Produto p){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM Produto WHERE cod_produto=?");
            stmt.setLong(1, p.getCod_produto());
           
            stmt.executeLargeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluído!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!" + ex);
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
            
    }
    
 
}
