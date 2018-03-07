
package model;

import java.sql.Date;

/**
 *
 * @author jade
 */
public class Venda_produto extends Venda{
    

    private int cod_produtoFk;
    private int cod_vendaFk;
    private int quantidade_produtos;
    private double valor_unitarioproduto;
    private double total_venda;

    public Venda_produto(int cod_produtoFk, int cod_vendaFk, int quantidade_produtos, double valor_unitarioproduto, double total_venda, int cod_venda, Date data_venda, String cpf_cliente, double valorTotal_venda, double valorPago_pelo_cliente) {
        super(cod_venda, data_venda, cpf_cliente, valorTotal_venda, valorPago_pelo_cliente);
        this.cod_produtoFk = cod_produtoFk;
        this.cod_vendaFk = cod_vendaFk;
        this.quantidade_produtos = quantidade_produtos;
        this.valor_unitarioproduto = valor_unitarioproduto;
        this.total_venda = total_venda;
    }

    
    public Venda_produto(){
        
    }

    public int getCod_produtoFk() {
        return cod_produtoFk;
    }

    public void setCod_produtoFk(int cod_produtoFk) {
        this.cod_produtoFk = cod_produtoFk;
    }

    public int getCod_vendaFk() {
        return cod_vendaFk;
    }

    public void setCod_vendaFk(int cod_vendaFk) {
        this.cod_vendaFk = cod_vendaFk;
    }

    public int getQuantidade_produtos() {
        return quantidade_produtos;
    }

    public void setQuantidade_produtos(int quantidade_produtos) {
        this.quantidade_produtos = quantidade_produtos;
    }

    public double getValor_unitarioproduto() {
        return valor_unitarioproduto;
    }

    public void setValor_unitarioproduto(double valor_unitarioproduto) {
        this.valor_unitarioproduto = valor_unitarioproduto;
    }

    public double getTotal_venda() {
        return total_venda;
    }

    public void setTotal_venda(double total_venda) {
        this.total_venda = total_venda;
    }

   
    
    
}
