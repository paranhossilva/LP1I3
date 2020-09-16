//4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.

//Bruno Paranhos Silva    CB3005437

import static java.lang.System.out;
import java.util.Scanner;

public class TP01Ex04 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int base, altura;
        
        out.print("Base: ");
        base = scan.nextInt();
        
        out.print("Altura: ");
        altura = scan.nextInt();
        
        out.println("Área do triângulo: " + ((base * altura) / 2));
    }
}