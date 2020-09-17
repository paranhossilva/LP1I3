/*16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as seguintes funções trigonométricas: seno, cosseno, tangente e secante 
deste ângulo. Lembre-se que uma função trigonométrica trabalha em radianos.*/

//Bruno Paranhos Silva    CB3005437

import static java.lang.System.out;
import java.util.Scanner;

public class TP01Ex16{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        double ang, rad;
        
        out.print("Informe o valor do ângulo: ");
        ang = scan.nextDouble();
        
        rad = (Math.PI / 180) * ang;
        
        out.printf("sen %.0f° = %.2f\n", ang, Math.sin(rad));
        out.printf("cos %.0f° = %.2f\n", ang, Math.cos(rad));
        
        if (String.format("%.6f",Math.cos(rad)).equals("0,000000") || String.format("%.6f",Math.cos(rad)).equals("-0,000000")) {
            out.printf("tg %.0f° ∉ R\n", ang);
            out.printf("sec %.0f° ∉ R\n", ang);
        }
        else{
            out.printf("tg %.0f° = %.2f\n", ang, Math.tan(rad));
            out.printf("sec %.0f° = %.2f\n", ang, Math.pow(Math.cos(rad), -1));
        }
        
    }
}
