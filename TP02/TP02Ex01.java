//Bruno Paranhos Silva  CB3005437

//1. Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro. Caso contrário solicitar novamente apenas o segundo valor.

import static java.lang.System.out;
import java.util.Scanner;

public class TP02Ex01 {
    
    public static void main(String[] args)){
        Scanner scan = new Scanner(System.in);
        
        int a, b;
        
        out.print("Informe o 1º número: ");
        a = scan.nextInt();
        
        do {
            out.print("Informe o 2º número: ");
            b = scan.nextInt();
        } while (a >= b);
        
        out.print("O segundo número é maior que o primeiro");              
    }
}
