
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.ConnectionFactory;
import model.Produto;
import model.Venda_produto;

/**
 *
 * @author jade
 */
public class Venda_produtoDao{
    
        
        public void create(Venda_produto v){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO Venda_produto(cod_produtoFk, cod_vendaFk,quantidade_produtos, "
                    + "valor_unitarioproduto, total_venda) VALUES (?, ?, ?, ?, ?)");
            
            stmt.setInt(1,v.getCod_produtoFk());
            stmt.setInt(2,v.getCod_vendaFk());
            stmt.setInt(3, v.getQuantidade_produtos());
            stmt.setDouble(4, v.getValor_unitarioproduto());
            stmt.setDouble(5, v.getTotal_venda());
            
         
            stmt.executeLargeUpdate();
            
            //JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar!" + ex);
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
        
        
    }
        
    public List<Venda_produto> read(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Venda_produto> vendasProd = new ArrayList<>();
        
        
        
            try {
                stmt = con.prepareStatement("SELECT * FROM Venda_produto");
                rs = stmt.executeQuery();
                
                while (rs.next()) {                    
                    Venda_produto vp = new Venda_produto();
                   
                    vp.setCod_produtoFk(rs.getInt("cod_produtoFk"));
                    vp.setCod_vendaFk(rs.getInt("cod_vendaFk"));
                    vp.setQuantidade_produtos(rs.getInt("quantidade_produtos"));
                    vp.setValor_unitarioproduto(rs.getDouble("valor_unitarioproduto"));
                    vp.setTotal_venda(rs.getDouble("total_venda"));
                    
                    
                    vendasProd.add(vp);
                    
                    
                }
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro" + ex);
            }finally{
                ConnectionFactory.closeConnection(con, stmt, rs);
            }
        
            return vendasProd;
    
    
    }
    
    public void delete(Venda_produto v){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM Venda_produto WHERE cod_vendaFk = ?");
            stmt.setInt(1, v.getCod_vendaFk());
            //stmt.setInt(2, v.getCod_produtoFk());
           
            stmt.executeLargeUpdate();
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir!" + ex);
        }finally{
            
            ConnectionFactory.closeConnection(con, stmt);
            
        }
            
    }
    
public List<Venda_produto> joinVendaProduto(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Venda_produto> vendasProd = new ArrayList<>();
        //List<Venda_produto>
        
        
            try {
                stmt = con.prepareStatement("SELECT Produto.nome_produto from Produto inner"
                        + " join Venda_produto on Produto.cod_produto = Venda_produto.cod_produtoFk;");
                rs = stmt.executeQuery();
                
                while (rs.next()) {                    
                    Venda_produto vp = new Venda_produto();
                    Produto p = new Produto();
                    
                    p.setNome_produto(rs.getString("nome_produto"));
                                     
                }
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro" + ex);
            }finally{
                ConnectionFactory.closeConnection(con, stmt, rs);
            }
        
            return vendasProd;
    
    
    }

public List<Venda_produto> mostrarNaTabela(){
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Venda_produto> vendasProd = new ArrayList<>();
        //List<Venda_produto>
        
        
            try {
                stmt = con.prepareStatement("select * from Venda_produto where cod_vendaFK = ?");
                rs = stmt.executeQuery();
                
                while (rs.next()) {                    
                    Venda_produto vp = new Venda_produto();
                    
                    vp.setCod_produtoFk(rs.getInt("cod_produtoFK"));
                    vp.setQuantidade_produtos(rs.getInt("quantidade_produtos"));
                    vp.setValor_unitarioproduto(rs.getDouble("valor_unitarioproduto"));
                    vp.setTotal_venda(rs.getDouble("total_venda"));
                 
                }
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro" + ex);
            }finally{
                ConnectionFactory.closeConnection(con, stmt, rs);
            }
        
            return vendasProd;
    
    
    }


  
}
