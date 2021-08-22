//teste

package locadorasenninha.Model;

public class Admin {
    
    private String usuario;
    private String senha;

    //Método Construtor:
    public Admin(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    
    //Métodos Getters e Setters:
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
