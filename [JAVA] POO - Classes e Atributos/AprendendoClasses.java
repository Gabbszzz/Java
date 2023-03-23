
package aprendendoclasses;
import java.util.Date;
import java.util.Scanner;

public class AprendendoClasses {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Livro livro1 = new Livro();
        Cliente cliente1 = new Cliente();
        Funcionario funcionario1 = new Funcionario();
        
        livro1.autor = "Davi Saldanha";
        livro1.descricao = "Livro para aprendizado na liguagem Java";
        livro1.dtPublicacao = new Date();
        livro1.editora = "Devs Books";
        livro1.isbn = "0112465";
        livro1.titulo = "Java: Como sofrer!";
        
        cliente1.dtCadastro = new Date();
        cliente1.email = "icaro@gmail.com";
        cliente1.idCadastro = 001;
        cliente1.nome = "Icaro";
        cliente1.telefone = "(85)4002-8922";
        
        funcionario1.cargo = "atendente";
        funcionario1.dtAdmissao = new Date();
        funcionario1.matricula = "m001";
        funcionario1.nome = "Mariana";
        funcionario1.salario = 2000; 
        
        
        System.out.println("Nome: "+funcionario1.nome+"\nSalário: "
                                   +funcionario1.salario+"Data Admissao: "
                                   +funcionario1.dtAdmissao);
    }
    
}
