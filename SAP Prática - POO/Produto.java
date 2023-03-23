
package teste;


public class Produto extends Pedido{
    
    private String nome;
    private double valor;
    private String infoProduto;

   
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public double getValor() {
        return valor;
    }

    
    public void setValor(double valor) {
        this.valor = valor;
    }

    
    public String getInfoProduto() {
        return infoProduto;
    }

    
    public void setInfoProduto(String infoProduto) {
        this.infoProduto = infoProduto;
    }
    
    public String imprimirInfo() {
        return String.format("Nome: %s\nValor: %2.f\n ",
               nome, valor);
}
}
