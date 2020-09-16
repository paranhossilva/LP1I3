//2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.

//Bruno Paranhos Silva    CB3005437

import static java.lang.System.out;
import java.util.Scanner;

public class TP01Ex02 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int aresta;
        
        out.print("Aresta: ");
        aresta = scan.nextInt();
        
        out.println("Área do quadrado: " + (aresta * aresta));
    }
}