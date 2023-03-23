
package teste;


public class Usuario extends Cliente {
    public class Data{
    
    private String login;
    private String senha;
    private String dataRegistro;
    private String email;
    public Data(String login, String senha, String dataRegistro, String email,int dia, int mes, int ano){
    super(dia, mes, ano); 
}

    
    public String getLogin() {
        return login;
    }

    
    public void setLogin(String login) {
        this.login = login;
    }

   
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

   
    public String getDataRegistro() {
        return dataRegistro;
    }

    
    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

  
    public String getEmail() {
        return email;
    }

   
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    public String imprimirInfo() {
        return String.format("Login: %s\nSenha: %s\nData registro: %s\nEmail: %s\n",
                login, senha, dataRegistro.getData(),email);
}
    }
}

