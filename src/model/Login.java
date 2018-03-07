
package model;

/**
 *
 * @author jade
 */
public class Login {
    
    private int cod_login;
    private int cod_vendedorFk;
    private String senha_vendedor;

    public Login(int cod_login, int cod_vendedorFk, String senha_vendedor) {
        this.cod_login = cod_login;
        this.cod_vendedorFk = cod_vendedorFk;
        this.senha_vendedor = senha_vendedor;
    }

    public Login() {
    }

    public int getCod_login() {
        return cod_login;
    }

    public void setCod_login(int cod_login) {
        this.cod_login = cod_login;
    }

    public int getCod_vendedorFk() {
        return cod_vendedorFk;
    }

    public void setCod_vendedorFk(int cod_vendedorFk) {
        this.cod_vendedorFk = cod_vendedorFk;
    }

    public String getSenha_vendedor() {
        return senha_vendedor;
    }

    public void setSenha_vendedor(String senha_vendedor) {
        this.senha_vendedor = senha_vendedor;
    }
    
    
    
}
