
package model;


public class Cliente {
    
    private String cpf_cliente;
    private String nome_cliente;
    private String sexo_cliente;
    private String rua_cliente;
    private String numeracao_casa_cliente;
    private String bairro_cliente;
    private String cidade_cliente;
    private String celular_cliente;

    public Cliente(String cpf_cliente, String nome_cliente, String sexo_cliente, String rua_cliente, String numeracao_casa_cliente, String bairro_cliente, String cidade_cliente, String celular_cliente) {
        this.cpf_cliente = cpf_cliente;
        this.nome_cliente = nome_cliente;
        this.sexo_cliente = sexo_cliente;
        this.rua_cliente = rua_cliente;
        this.numeracao_casa_cliente = numeracao_casa_cliente;
        this.bairro_cliente = bairro_cliente;
        this.cidade_cliente = cidade_cliente;
        this.celular_cliente = celular_cliente;
    }

    public Cliente() {
    }

    public String getCpf_cliente() {
        return cpf_cliente;
    }

    public void setCpf_cliente(String cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public String getSexo_cliente() {
        return sexo_cliente;
    }

    public void setSexo_cliente(String sexo_cliente) {
        this.sexo_cliente = sexo_cliente;
    }

    public String getRua_cliente() {
        return rua_cliente;
    }

    public void setRua_cliente(String rua_cliente) {
        this.rua_cliente = rua_cliente;
    }

    public String getNumeracao_casa_cliente() {
        return numeracao_casa_cliente;
    }

    public void setNumeracao_casa_cliente(String numeracao_casa_cliente) {
        this.numeracao_casa_cliente = numeracao_casa_cliente;
    }

    public String getBairro_cliente() {
        return bairro_cliente;
    }

    public void setBairro_cliente(String bairro_cliente) {
        this.bairro_cliente = bairro_cliente;
    }

    public String getCidade_cliente() {
        return cidade_cliente;
    }

    public void setCidade_cliente(String cidade_cliente) {
        this.cidade_cliente = cidade_cliente;
    }

    public String getCelular_cliente() {
        return celular_cliente;
    }

    public void setCelular_cliente(String celular_cliente) {
        this.celular_cliente = celular_cliente;
    }
    
    
}
