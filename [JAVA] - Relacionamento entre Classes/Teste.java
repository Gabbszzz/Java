package Atv7;

import java.util.Scanner;


public class Teste {
     

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        Teste agenda = new Teste();
        Contato[] contatos = new Contato[3];
        
        System.out.print("Digite o nome da agenda: ");
        String nome = entrada.nextLine();
        
        
            for(int i = 0; i < contatos.length; i++){
                Contato contato = new Contato();

                System.out.printf("Digite o nome do %d contato: ",i+1);
                String nome1 = entrada.nextLine();
                contato.setNome(nome1);

                System.out.print("Digite seu email: ");
                String email = entrada.nextLine();
                contato.setEmail(email);

                System.out.println("Digite o número: ");
                String numero = entrada.nextLine();
                contato.setTelefone(numero);
                contatos[i] = contato;

            }
            agenda.setContato(contatos);
            
            agenda.getMostrarContatos();
            
       
        
        entrada.close();
    }

    private void setContato(Contato[] contatos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void getMostrarContatos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}