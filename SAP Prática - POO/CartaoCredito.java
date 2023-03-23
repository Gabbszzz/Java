
package teste;


public class CartaoCredito extends Cliente {

    public CartaoCredito() {
    
    }
    
    private String numero;
    private String titular;
    private String ccv;

    
    public String getNumero() {
        return numero;
    }

    
    public void setNumero(String numero) {
        this.numero = numero;
    }

   
    public String getTitular() {
        return titular;
    }

   
    public void setTitular(String titular) {
        this.titular = titular;
    }

    
    public String getCcv() {
        return ccv;
    }

    
    public void setCcv(String ccv) {
        this.ccv = ccv;
    }
    
   
    public String imprimirInfo() {
        return String.format("Número: %s\nTitular do Cartão: %s\nccv: %s",
                numero, titular, ccv);
    
}
}
