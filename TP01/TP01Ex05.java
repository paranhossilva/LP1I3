//5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado.

//Bruno Paranhos Silva    CB3005437

import static java.lang.System.out;
import java.util.Scanner;

public class TP01Ex05 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int diametro;
        double volume;
        
        out.print("Diâmetro: ");
        diametro = scan.nextInt();
        
        volume = 4 * 3.14 * Math.pow((diametro / 2), 3);
        
        out.println("Volume da esfera: " + volume);
    }
}