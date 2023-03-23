package Atv7;

public class Atv7 {
    public String nome;
    public Contato[] contato;
    
    
    public String getNome() {
        return nome;
    }

    public Contato[] getContato() {
        return contato;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContato(Contato[] contato) {
        this.contato = contato;
    }
    
    
    public void getMostrarContatos(){
        
        for(int i = 0; i <contato.length; i++ ){
            contato[i].toString();
        }
    }
}
