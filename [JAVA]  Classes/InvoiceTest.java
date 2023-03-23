

import java.util.Scanner;


public class InvoiceTest {
   
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
                   
     System.out.println("Informe nome da fatura:");
     String fatura = scan.next();
     
     System.out.println("Informe a descrição da Fatura:");
     String descricao = scan.next();
     
     System.out.println("Informe o número da Fatura:");
     String numero = scan.next();
     
     System.out.println("Informe a quantidade de itens:");
     int qtdItem = scan.nextInt();
     
     System.out.println("Informe o preço:");
     Double preço = scan.nextDouble();
     
     Invoice invoice = new Invoice();
        
        invoice.setNumero(numero);
        invoice.setDescricao(descricao);
        invoice.setQtdItem(qtdItem);
        invoice.setPreço(preço);
        
       
        
     System.out.println("Número: "+invoice.getNumero()+
                            "\nDescrição: "+invoice.getDescricao()+
                            "\nQuantidade: "+invoice.getQtdItem()+
                            "\nValor: "+invoice.getPreço());
     System.out.println();
      System.out.println("O Valor total é "+invoice.GetInvoiceAmount());
        
     scan.close();
     
     }
}


