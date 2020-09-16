//1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.

//Bruno Paranhos Silva    CB3005437

import static java.lang.System.out;
import java.util.Scanner;

public class TP01Ex01 {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int base, altura;
        
        out.print("Altura: ");
        altura = scan.nextInt();
        
        out.print("Base: ");
        base = scan.nextInt();
        
        out.println("Área do retângulo: " + (base * altura));
    }
}
