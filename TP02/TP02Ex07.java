//Bruno Paranhos Silva  CB3005437

/*7. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a digitação dos valores solicitar uma constante multiplicativa, 
que deverá multiplicar cada valor matriz e armazenar o resultado na própria matriz, nas posições correspondentes.*/

import static java.lang.System.out;
import java.util.Scanner;

public class TP02Ex07 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int[][] v = new int[3][4];
        int mult;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                out.print("Informe [" + i + "][" + j + "]: ");
                v[i][j] = scan.nextInt();
            }
        }
        
        out.print("Informe a constante multiplicativa: ");
        mult = scan.nextInt();
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                v[i][j] *= mult;
                out.print("[" + v[i][j] + "] ");                
            }
            out.println();
        }           
    }
}