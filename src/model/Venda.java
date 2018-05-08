
package model;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Venda {
    private int cod_venda;
    private Date data_venda;
    private String cpf_cliente;
    private double valorTotal_venda;
    private String venda_aprazo_avista;

    public Venda(int cod_venda, Date data_venda, String cpf_cliente, double valorTotal_venda, String venda_aprazo_avista) {
        this.cod_venda = cod_venda;
        this.data_venda = data_venda;
        this.cpf_cliente = cpf_cliente;
        this.valorTotal_venda = valorTotal_venda;
        this.venda_aprazo_avista = venda_aprazo_avista;
    }
    
    
    
   

    public Venda() {
    }

    public int getCod_venda() {
        return cod_venda;
    }
    
    
    
    public String getCpf_cliente() {
        return cpf_cliente;
    }

    public void setCpf_cliente(String cpf_cliente) {
        this.cpf_cliente = cpf_cliente;
    }

    public Date getData_venda() {
        return data_venda;
    }

    public void setData_venda(Date data_venda) {
        this.data_venda = data_venda;
    }

   

    public void setCod_venda(int cod_venda) {
        this.cod_venda = cod_venda;
    }

    public double getValorTotal_venda() {
        return valorTotal_venda;
    }

    public void setValorTotal_venda(double valorTotal_venda) {
        this.valorTotal_venda = valorTotal_venda;
    }

    public String getVenda_aprazo_avista() {
        return venda_aprazo_avista;
    }

    public void setVenda_aprazo_avista(String venda_aprazo_avista) {
        this.venda_aprazo_avista = venda_aprazo_avista;
    }

   

   
 
   
}
