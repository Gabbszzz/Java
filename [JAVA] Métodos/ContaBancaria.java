
package atv4;

public class ContaBancaria {
    String nome;
    double saldo;
    
    public String getNome() {
        return this.nome;
    }
    
    public void setSaldo(String nome) {
        this.nome = nome;
    }
    
    ContaBancaria(){
        
    }
    
    ContaBancaria(String nome, double saldo){
        this.nome = nome;
        
        if(saldo < 0) {
            this.saldo = 0.0;
        }else {
            this.saldo = saldo;
        }
        
    }
    
    void depositar(double valor){
        
        this.saldo += valor;
        
    }
    
    void sacar(double valor){
        this.saldo -= valor;
        
    }

}