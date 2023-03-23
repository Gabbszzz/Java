
package teste;

public class Data {
    protected int dia, mes, ano;



    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getData () {
        return dia+"/"+mes+"/"+ano;
    }
}
