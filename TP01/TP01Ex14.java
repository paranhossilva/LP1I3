/*14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio “r” inscrita em um cubo perfeito de aresta “a”. 
Os valores de “r “ e “a” serão digitados.*/

//Bruno Paranhos Silva    CB3005437

import static java.lang.System.out;
import java.util.Scanner;

public class TP01Ex14{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int aresta, raio;
        double volCubo, volEsfera;
        
        out.print("Aresta: ");
        aresta = scan.nextInt();
        
        out.print("Raio: ");
        raio = scan.nextInt();
        
        volCubo = aresta * aresta;
        
        volEsfera = (4 * 3.14 * Math.pow(raio, 3)) / 3;
        
        volCubo -= volEsfera;
        
        out.printf("Volume livre: %.2f", volCubo);
    }
}