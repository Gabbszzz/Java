
package teste;

import java.util.Date;
import teste.Cliente.CadastroCliente;

    public class teste {
    public static void main(String[] args) {
        
        Date data = new Date();
        
       Cliente cliente1 = new Cliente("Gaby");
       Cliente cliente2 = new Cliente("Mateus");
       
        
        CadastroCliente cadastro = new CadastroCliente();
        
        cadastro.cadastraCliente(cliente1);
        cadastro.cadastraCliente(cliente2);
        
        cadastro.imprimeCadastro();
          
} 
    }
