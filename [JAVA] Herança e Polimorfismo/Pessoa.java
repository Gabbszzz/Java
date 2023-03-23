package atv9;


public abstract class Pessoa {
    protected String nome;
    protected Data nascimento;

    public Pessoa () {}

    public Pessoa(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        this.nascimento = new Data(dia, mes, ano);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    public abstract String imprimeDados ();
    
}
