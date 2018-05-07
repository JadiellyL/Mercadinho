
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
                    + "(cod_produto,nome_produto,quatidade_produto, "
                    + "preco_produto, fornecedor_produto) "
                    + "VALUES (?, ?, ?, ?, ?)");
            
            stmt.setInt(1, p.getCod_produto());
            stmt.setString(2, p.getNome_produto());
            stmt.setInt(3, p.getQuantidade_produto());
            stmt.setDouble(4, p.getPreco_produto());
            stmt.setString(5, p.getFornecedor_produto());
            
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
                    produto.setCod_produto(rs.getInt("cod_produto"));
                    produto.setNome_produto(rs.getString("nome_produto"));
                    produto.setQuantidade_produto(rs.getInt("quatidade_produto"));
                    produto.setPreco_produto(rs.getDouble("preco_produto"));
                    produto.setFornecedor_produto(rs.getString("fornecedor_produto"));
                    
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
            stmt = con.prepareStatement("UPDATE Produto SET nome_produto = ?, quatidade_produto = ?, preco_produto = ?, fornecedor_produto = ? WHERE cod_produto = ?");
                        
            stmt.setString(1, p.getNome_produto());
            stmt.setInt(2, p.getQuantidade_produto());
            stmt.setDouble(3, p.getPreco_produto());
            stmt.setString(4, p.getFornecedor_produto());
            stmt.setInt(5, p.getCod_produto());
            
            
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
            stmt.setInt(1, p.getCod_produto());
           
            stmt.executeLargeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluído!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!" + ex);
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
            
    }
    
 public List<Produto> join(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produto> produtos = new ArrayList<>();
        
        
        
            try {
                stmt = con.prepareStatement("SELECT nome_produto"
                        + " FROM Produto INNER JOIN Venda_produto ON "
                        + "Produto.cod_produto = Venda_produto.cod_produtoFk");
                rs = stmt.executeQuery();
                
                while (rs.next()) {                    
                    Produto produto = new Produto();
                    
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
       
}
