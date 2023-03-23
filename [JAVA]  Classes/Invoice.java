
public class Invoice {

    public static void main(String[] args) {
    }   
    private String fatura;
    private String descricao;
    private String numero;
    private int qtdItem;
    private Double preço;
    
        public String getFatura() {
        return fatura;
    }
        public void setfatura(String fatura) {
        this.fatura = fatura;
    }
        public String getNumero() {
        return numero;
    }
        public void setNumero(String numero) {
        this.numero = numero;
    }
        public String getDescricao() {
        return descricao;
    }
        public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
        public int getQtdItem () {
        return qtdItem;
    }
        public void setQtdItem(int qtdItem) {
        this.qtdItem = qtdItem;
    }
        public Double getPreço ( ) {
        return preço;
    }
        public void setPreço(Double preço) {
        this.preço = preço;
    }
        
        public double GetInvoiceAmount(){
        
        double total = this.qtdItem * this.preço;
        
        return total;
    }
}

    
