
package atv11;

import java.util.ArrayList;
import java.util.Collections;

public class ContaTeste {

    public static void main(String[] args) {

        ArrayList<Conta> contas = new ArrayList<>();

        

        Conta conta1 = new Conta (5220, 1);
        Conta conta2 = new Conta (1525, 2);
        Conta conta3 = new Conta (6350, 3);
        Conta conta4 = new Conta (3500, 4);
        Conta conta5 = new Conta (2950, 5);

        Collections.addAll(contas, conta1, conta2, conta3, conta4, conta5);


        Collections.sort(contas);


       for (Conta conta : contas) {
           System.out.print(conta.imprimirInfo());
       }
    }
}
