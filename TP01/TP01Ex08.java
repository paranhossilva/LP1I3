/*8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e dois metros e que um quilômetro possui mil metros, 
fazer um programa para converter milhas marítimas em quilômetros.*/

//Bruno Paranhos Silva    CB3005437

import static java.lang.System.out;
import java.util.Scanner;

public class TP01Ex08{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        double mm, km;
        
        out.print("Milhas Marítimas: ");
        mm = scan.nextDouble();
        
        km = mm * 1852 / 1000;
        
        out.printf("%s Milhas Marítimas = %s Km", mm, km);
    }
}