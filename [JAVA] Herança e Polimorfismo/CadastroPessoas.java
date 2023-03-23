package atv9;


import java.util.ArrayList;

public class CadastroPessoas {
    private int qtdAtual;
    private final ArrayList<Pessoa> cadastro = new ArrayList<>();



    public CadastroPessoas () {}

    public CadastroPessoas(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }





    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }



    public void cadastraPessoa(Pessoa pess) {
        cadastro.add(pess);
        qtdAtual++;
    }

    public void imprimeCadastro() {
        for (Pessoa pess : cadastro) {
            System.out.println(pess.imprimeDados());
        }
    }
}

