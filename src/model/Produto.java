
package model;


public class Produto {
    private int cod_produto;
    private String nome_produto;
    private int quantidade_produto;
    private double preco_produto;
    private String fornecedor_produto;

    public Produto(int cod_produto, String nome_produto, int quantidade_produto, double preco_produto, String fornecedor_produto) {
        this.cod_produto = cod_produto;
        this.nome_produto = nome_produto;
        this.quantidade_produto = quantidade_produto;
        this.preco_produto = preco_produto;
        this.fornecedor_produto = fornecedor_produto;
    }

    public Produto() {
    }
    

    public int getCod_produto() {
        return cod_produto;
    }
       
    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public int getQuantidade_produto() {
        return quantidade_produto;
    }

    public void setQuantidade_produto(int quantidade_produto) {
        this.quantidade_produto = quantidade_produto;
    }

    public double getPreco_produto() {
        return preco_produto;
    }

    public void setCod_produto(int cod_produto) {
        this.cod_produto = cod_produto;
    }

    
    
    public void setPreco_produto(double preco_produto) {
        this.preco_produto = preco_produto;
    }

    public String getFornecedor_produto() {
        return fornecedor_produto;
    }

    public void setFornecedor_produto(String fornecedor_produto) {
        this.fornecedor_produto = fornecedor_produto;
    }
    
    public void calculaquantidade(int valorDigitado){
        setQuantidade_produto(getQuantidade_produto()-valorDigitado);
    }
    
    
}
