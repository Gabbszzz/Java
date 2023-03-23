
package atv12;
import java.util.Scanner;
public class Text {

    public static void main(String[] args) {
    
    
        Scanner scan = new Scanner(System.in);
         soma soma = new soma();
         subtracao subtracao = new subtracao();
         divisao divisao = new divisao();
         multiplicacao multiplicacao = new multiplicacao();
     
       int opcao, numero1,numero2;
      
        System.out.println("1-soma\n2-subtração\n3-divisao\n4-multiplicação\nV");
        opcao =scan.nextInt();
        
        switch(opcao){
            case 1:
                 
                System.out.println("qual o 1° numero?");
                numero1= scan.nextInt();
                 System.out.println("qual o 2° numero?");
                numero2= scan.nextInt();

                System.out.println("soma");
                System.out.println( soma.calcula(numero1,numero2));
            
      break;
            case 2:
                 System.out.println("qual o 1° numero?");
                numero1= scan.nextInt();
                 System.out.println("qual o 2° numero?");
                numero2= scan.nextInt();

                System.out.println("subtação");
                System.out.println( subtracao.calcula(numero1,numero2));
     break;
            case 3:
                 System.out.println("qual o 1° numero?");
                numero1= scan.nextInt();
                 System.out.println("qual o 2° numero?");
                numero2= scan.nextInt();

                System.out.println("divisão");
                System.out.println( divisao.calcula(numero1,numero2));
                
       break;
            case 4:
                 System.out.println("qual o 1° numero?");
                numero1= scan.nextInt();
                 System.out.println("qual o 2° numero?");
                numero2= scan.nextInt();

                System.out.println("multiplicação");
                System.out.println( multiplicacao.calcula(numero1,numero2));
        }
    }
    
}
