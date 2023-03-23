package atv9;


public class Gerente extends Funcionario{
    private String area;



    public Gerente () {}

    public Gerente(String nome, int dia, int mes, int ano, float salario, String area) {
        super(nome, dia, mes, ano, salario);
        this.area = area;
    }


    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }




    @Override
    public float calcularImposto () {
        return (float) (this.getSalario() * 0.05);
    }



    @Override
    public String imprimeDados() {
        return String.format("Nome do gerente: %s\nData de Nascimento: %s\nÁrea: %s\nSalário: %.2f\nImposto: %.2f\n",
                nome, nascimento.getData(), this.area, this.getSalario(), this.calcularImposto());
    }
}
