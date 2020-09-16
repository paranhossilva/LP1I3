//3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será digitado.

//Bruno Paranhos Silva    CB3005437

import static java.lang.System.out;
import java.util.Scanner;

public class TP01Ex03 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int diagonal;
        
        out.print("Diagonal: ");
        diagonal = scan.nextInt();
        
        out.println("Área do quadrado: " + ((diagonal * diagonal) / 2));
    }
}