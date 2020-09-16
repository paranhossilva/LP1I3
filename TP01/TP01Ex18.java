/*18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um valor referente ao pagamento da somatória destes valores. 
Calcular e exibir o troco que deverá ser devolvido.*/

//Bruno Paranhos Silva    CB3005437

import static java.lang.System.out;
import java.util.Scanner;

public class TP01Ex18{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        double total = 0, troco;
        
        for (int i = 1; i <= 5; i++) {
            out.printf("Valor do %sº produto: ", i);
            total += scan.nextInt();
        }
        
        out.println("Total: " + total);
        
        out.print("Valor pago: ");
        troco = scan.nextInt() - total;
        
        out.println("Troco: " + troco);
    }
}