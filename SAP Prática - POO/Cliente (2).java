
package teste;

import java.util.ArrayList;


public class Cliente {
 

    private boolean imprimirInfo() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

public class CadastroCliente {
    private int qtdAtual;
    private final ArrayList<Cliente> cadastro = new ArrayList<>();



    public CadastroCliente () {}

    public CadastroCliente(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public void cadastraPessoa(Cliente cliente) {
        cadastro.add(cliente);
        qtdAtual++;
    }

    public void imprimeInfo() {
        for (Cliente cliente : cadastro) {
            System.out.println(cliente.imprimirInfo());
        }
        
    }

        void imprimeCadastro() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }
    }
}

