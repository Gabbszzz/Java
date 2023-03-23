package atv9;


public class TestaCadastro {

    public static void main(String[] args) {


        Cliente cliente1 = new Cliente("Gaby",24,8,1995,1);
        Cliente cliente2 = new Cliente("Mateus", 30, 9, 1999, 2);
        Funcionario funcionario1 = new Funcionario("Thamires",7,5,1996,1800);
        Funcionario funcionario2 = new Funcionario("Bia",10,12,1985,2800);
        Gerente gerente1 = new Gerente("Pedro",06,11,1983,3800,"vendas");

      

        CadastroPessoas cadastro = new CadastroPessoas();

        

        cadastro.cadastraPessoa(cliente1);
        cadastro.cadastraPessoa(cliente2);
        cadastro.cadastraPessoa(funcionario1);
        cadastro.cadastraPessoa(funcionario2);
        cadastro.cadastraPessoa(gerente1);

       

        cadastro.imprimeCadastro();
    }
}
