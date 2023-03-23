
package atv1;
import java.util.Scanner;
public class Atv1 {
    
      public static void contador(int x, int y){
        int numero[] = new int[y];
        
        for(int i = 0; i < numero.length; i ++){
            numero[i] = x *(i+1);
               
        }
        for(int i = 0; i < numero.length; i ++){
            System.out.printf("[%2d]",numero[i]);
        }
        
    }
        
    public static void main(String[] args) {
           int inicio,fim;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um valor para trazer sua multiplicidade: ");
        inicio = entrada.nextInt();
        
        System.out.println("Informe a quantidade de vezes: ");
        fim = entrada.nextInt();
        
        int vetor[] = new int[fim];
        
        contador(inicio, fim);
        
        
        entrada.close();
	}
}
    
    

