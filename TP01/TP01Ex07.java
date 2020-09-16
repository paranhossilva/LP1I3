//7. Calcular e exibir a média geométrica de dois valores quaisquer que serão digitados.

//Bruno Paranhos Silva    CB3005437

import static java.lang.System.out;
import java.util.Scanner;

public class TP01Ex07 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        double media = 0;
        
        for (int i = 1; i <= 2; i++) {
            out.printf("Valor %s: ", i);
            media *= scan.nextDouble();
        }
        
        media = Math.sqrt(media);
        
        out.print("Media : " + media);
    }
}