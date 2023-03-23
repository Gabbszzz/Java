package senaiAtividade_13_10;

import java.util.ArrayList;
import java.util.Scanner;



public class Atividade1 {
	 public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
       
         ArrayList<Integer> lista = new ArrayList<>();
         int cont = 0;
         
         System.out.println("DIGITE 10 NÚMEROS");
         for( int i = 0; i < 10; i ++){
           
                  System.out.printf("%dº NÚMERO: ",i+1);
                   int numero = entrada.nextInt();
                   lista.add(numero);
       }
       
       for(Integer i : lista){
           if(i == 10 || i ==100 | i ==1000){
               cont++;
           }
       }
       if(cont > 0){
           System.out.println("PARABÉNS VOCÊ GANHOU UM BONUS DE R$50,00");
       }else{
           System.out.println("NÃO FOI DESSA VEZ");
       }
       System.out.println("VOLTE SEMPRE!");
       entrada.close();
   }
	

}
