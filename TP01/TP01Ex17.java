//17. Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.

//Bruno Paranhos Silva    CB3005437

import static java.lang.System.out;
import java.util.Scanner;

public class TP01Ex17{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int x, y;
        
        out.print("X: ");
        x = scan.nextInt();
        
        out.print("Y: ");
        y = scan.nextInt();
        
        out.println("X^Y = " + Math.pow(x, y));
    }
}