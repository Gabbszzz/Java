
package teste;

import java.util.Date;

public class Pedido extends Cliente {
public class Data{
    
    
    private String numPedido;
    private Data dataCriacao;
    private String imprimirInfo;
    private double calcularPreco;
    
    public Data (int dia, int mes, int ano){
    super(dia, mes, ano);
    }
    
    public String getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(String numPedido) {
        this.numPedido = numPedido;
    }

   
    public Data getDataCriacao() {
       this.dataCriacao = new Data(dia, mes, ano);
        return dataCriacao;
        
    }

   
    public void setDataCriacao(Data dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    
    public String getImprimirInfo() {
        return imprimirInfo;
    }

    
    public void setImprimirInfo(String imprimirInfo) {
        this.imprimirInfo = imprimirInfo;
    }

    
    public double getCalcularPreco() {
        return calcularPreco;
    }

    
    public void setCalcularPreco(double calcularPreco) {
        this.calcularPreco = calcularPreco;
    }
    
     
    public String imprimirInfo() {
        return String.format("Número do pedido: %s\n Data do Pedido: %s\n: %.2f\nPreço: %.2f\n",numPedido,
            calcularPreco, dataCriacao.getData());
    
}
}
}



