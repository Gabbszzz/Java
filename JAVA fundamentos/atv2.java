/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv1;

import java.util.Scanner;

/**
 *
 * @author senaii05
 */
public class atv2 {
     public static int semestre(int x){
    int resultado = 0;
        
        switch(x){
            case 1:
                resultado = 1;
                break;
                
            case 2:
                resultado = 1;
                break;
            case 3:
                resultado = 1;
                break;
                 
                case 4:
                    resultado = 2;
                break;
                
                case 5:
                    resultado = 2;
                break;
                case 6:
                    resultado = 2;
                 break;
                case 7:
                    resultado = 3;
                break;
                case 8:
                    resultado = 3;
                break;
                case 9:
                    resultado = 3;
                break;
                case 10:
                    resultado = 4;
                break;
                case 11:
                    resultado = 4;
                break;
                case 12:
                    resultado = 4;
                break;       
                
        }
        return resultado;
    }
       public static void main(String[] args) {
        int mes;
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.printf("Informe o mês [1 á 12]: ");
        mes = entrada.nextInt();
        
        System.out.printf("O mês digitado pertence ao %d trimestre",semestre(mes));
        
        entrada.close();
    }
    
}
