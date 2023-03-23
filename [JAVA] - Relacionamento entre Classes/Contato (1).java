package Atv7;


public class Contato {
   private String nome; 
   private String telefone;
   private String email;
   private Teste agenda;

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("NOME: %s\n"+
                             "EMAIL %s\n" +
                             "TELEFONE %s",this.nome, this.email, this.telefone);
    }
  
}
