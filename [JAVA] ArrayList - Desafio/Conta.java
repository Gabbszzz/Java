package atv11;

public class Conta implements Comparable<Conta> {
    protected double saldo;
    protected int id;

    

    public Conta(double saldo, int id) {
        this.saldo = saldo;
        this.id = id;
    }

    
    @Override
    public int compareTo(Conta c) {
        return Double.compare(c.saldo, this.saldo);
    } 

    public String imprimirInfo () {
        return String.format("\nId: %d\tSaldo: %.2f", this.id, this.saldo);
    } 
}
