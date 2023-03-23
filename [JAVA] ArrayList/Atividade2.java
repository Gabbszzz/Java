

package senaiAtividade_13_10;

import java.util.Scanner;
import java.util.ArrayList;

public class Atividade2 {
	
    public static void main(String[] args) {
		
    Scanner entrada = new Scanner(System.in);
    ArrayList<String> lista1 = new ArrayList<>();
    ArrayList<String> lista2 = new ArrayList<>();
    
    System.out.println("DIGITE 10 PALAVRAS");
   for(int i = 0; i < 10; i ++){
        System.out.printf("%d° PALAVRA: ",i+1);
       String nome = entrada.nextLine();
        lista1.add(nome);
    }
    

    for(String i : lista1){
        int aux;
        aux= i.length();
        if(aux == 3) {
        	lista2.add(i);
        }
            
        }
        lista1.removeAll(lista2);

  
    System.out.println("===============================================");
    
    for(String i : lista1) {
    	System.out.println(i);
    }
    entrada.close();
}

}
