/*13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos valores da velocidade inicial (em m/s), da aceleração (m/s2) e do 
tempo de percurso (em s) que serão digitados.*/

//Bruno Paranhos Silva    CB3005437

import static java.lang.System.out;
import java.util.Scanner;

public class TP01Ex13{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        double v, v0, a, t;
        
        out.print("Velocidade Inicial: ");
        v0 = scan.nextDouble();
        
        out.print("Aceleração: ");
        a = scan.nextDouble();
        
        out.print("Tempo: ");
        t = scan.nextDouble();
        
        v = v0 + (a * t);
        
        v *= 3.6;
        
        out.printf("Velocidade Final: %sKm/h", v);
    }
}