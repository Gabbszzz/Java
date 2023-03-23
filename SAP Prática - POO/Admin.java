
package teste;

import java.util.Date;

public class Admin extends Usuario{
    
    public Admin () {};
    
    private String nomeAdmin;

    
    public Admin(String login, String senha, String dataRegistro, String email) {
    super(dia, mes ,ano);
    }
  
    public String getNomeAdmin() {
        return nomeAdmin;
    }

    public Data getDataRegistro(){
       this.setDataRegistro(new Date(dia, mes, ano));
        return getDataRegistro();
        
    }
    
    public void setNomeAdmin(String nomeAdmin) {
        this.nomeAdmin = nomeAdmin;
    }
    
    public String imprimirInfo() {
        return String.format("Login: %s\nSenha: %s\nData registro: %s\nEmail: %s\n", getLogin(), getSenha(), getDataRegistro().getData(), getEmail());
    
}
}
