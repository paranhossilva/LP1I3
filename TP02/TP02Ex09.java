//Bruno Paranhos Silva  CB3005437

/*9. Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário, sendo que no máximo 10x10. A matriz não precisa ser quadrática. 
Após a digitação dos elementos, calcular e exibir a matriz transposta.*/

import static java.lang.System.out;
import java.util.Scanner;

public class TP02Ex09 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int m, n;
        
        do {
            out.print("Informe M <= 10: ");
            m = scan.nextInt();
        } while (m > 10 || m < 1);
        
        do {
            out.print("Informe N <= 10: ");
            n = scan.nextInt();
        } while (n > 10 || n < 1);        
        
        int[][] v = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                out.print("Informe [" + i + "][" + j + "]: ");
                v[i][j] = scan.nextInt();
            }
        }
        
        out.print("\n-------------- V --------------\n");
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                out.print("[" + v[i][j] + "] ");                
            }
            out.println();
        } 
        
        out.print("\n-------------- Vt --------------\n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {                
                out.print("[" + v[j][i] + "] ");
            }
            out.println();
        }
    }
}