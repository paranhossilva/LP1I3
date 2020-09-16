//11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.

//Bruno Paranhos Silva    CB3005437

import static java.lang.System.out;
import java.util.Scanner;

public class TP01Ex11{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        double diametro, area;
        
        out.print("Diâmetro: ");
        diametro = scan.nextDouble();
        
         area = 3.14 * Math.pow((diametro / 2), 2);
        
        out.print("Área: " + area);
    }
}