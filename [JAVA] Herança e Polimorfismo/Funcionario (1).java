package atv9;



public class Funcionario extends Pessoa {
    private float salario;


    public Funcionario () {}

    public Funcionario(String nome, int dia, int mes, int ano, float salario) {
        super(nome, dia, mes, ano);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }


    public float calcularImposto () {
        return (float) (this.salario * 0.03);
    } 
    @Override
    public String imprimeDados() {
        return String.format("Nome do funcionário: %s\nData de Nascimento: %s\nSalário: %.2f\nImposto: %.2f\n",
                nome, nascimento.getData(), salario, this.calcularImposto());
    } 
}
