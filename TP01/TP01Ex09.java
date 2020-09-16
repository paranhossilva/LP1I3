/*9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos valores da resistência e corrente elétrica que serão digitados. 
Utilize a lei de Ohm.*/

//Bruno Paranhos Silva    CB3005437

import static java.lang.System.out;
import java.util.Scanner;

public class TP01Ex09{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        double r, u, i; // r=u/i
        
        out.print("Resistência: ");
        r = scan.nextDouble();
        
        out.print("Corrente: ");
        i = scan.nextDouble();
        
        u = r * i;
                      
        out.printf("Tensão: %sV", u);
    }
}