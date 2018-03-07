package model;





public class Vendedor {
    
    private int cod_vendedor;
    private String nome_vendedor;
    private String sexo_vendedor;
    private String senha_vendedor;

    public Vendedor(int cod_vendedor,String nome_vendedor, String sexo_vendedor, String senha_vendedor) {
        this.cod_vendedor = cod_vendedor;
        this.nome_vendedor = nome_vendedor;
        this.sexo_vendedor = sexo_vendedor;
        this.senha_vendedor = senha_vendedor;
    }

    public Vendedor() {
    }

    public int getCod_vendedor() {
        return cod_vendedor;
    }

    public void setCod_vendedor(int cod_vendedor) {
        this.cod_vendedor = cod_vendedor;
    }
    
    

    public String getNome_vendedor() {
        return nome_vendedor;
    }

    public void setNome_vendedor(String nome_vendedor) {
        this.nome_vendedor = nome_vendedor;
    }

    public String getSexo_vendedor() {
        return sexo_vendedor;
    }

    public void setSexo_vendedor(String sexo_vendedor) {
        this.sexo_vendedor = sexo_vendedor;
    }

    public String getSenha_vendedor() {
        return senha_vendedor;
    }

    public void setSenha_vendedor(String senha_vendedor) {
        this.senha_vendedor = senha_vendedor;
    }
    
    
    
    
}
