//10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua temperatura equivalente em Fahrenheit.

//Bruno Paranhos Silva    CB3005437

import static java.lang.System.out;
import java.util.Scanner;

public class TP01Ex10{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        double c, f;
        
        out.print("Celsius: ");
        c = scan.nextDouble();
        
        f = ((c * 9) / 5) + 32;
                      
        out.printf("%s°C = %s°F", c, f);
    }
}