//12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da base que serão digitados.

//Bruno Paranhos Silva    CB3005437

import static java.lang.System.out;
import java.util.Scanner;

public class TP01Ex12{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        double raio, altura, volume;
        
        out.print("Raio: ");        
        raio = scan.nextDouble();
        
        out.print("Altura: ");        
        altura = scan.nextDouble();
                
        volume = (3.14 * raio * raio * altura) / 3;
        
        out.println("Volume: " + volume);
    }
}