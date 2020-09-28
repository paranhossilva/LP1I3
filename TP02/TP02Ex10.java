//Bruno Paranhos Silva  CB3005437

/*10. Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário, sendo que no máximo será de ordem 10 e quadrática. 
Após a digitação dos elementos, calcular e exibir a matriz inversa. Exibir as matrizes na tela, sob a forma matricial (linhas x colunas).*/

import static java.lang.System.out;
import java.util.Scanner;

public class TP02Ex10 {
    
    private int Determinante(int m, int[][] v){
        int det = 0;
        
        switch(m){
            case 1:
            det = v[0][0];
            
            break;
        
            case 2:
                det = v[0][0] * v[1][1] - v[0][1] * v[1][0];
                
            break;
                
            default:
                det = (v[0][0] * v[1][1] * v[2][2] + v[0][1] * v[1][2] * v[2][0] + v[0][2] * v[1][0] * v[2][1] - (v[0][2] * v[1][1] * v[2][0] + v[0][0] * v[1][2] * v[2][1] + v[0][1] * v[1][0] * v[2][2]));
                
            break;
        }
        
        return det;
    }
    
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int m;
        
        do {
            out.print("Informe M <= 10: ");
            m = scan.nextInt();
        } while (m > 10 || m < 1);        
        
        int[][] v = new int[m][m];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                out.print("Informe [" + i + "][" + j + "]: ");
                v[i][j] = scan.nextInt();
            }
        }
        
        out.println();
        
        if(m < 4){        
            int det = Determinante(m, v);

            out.println("Determinante: " + det);

            if (det != 0)
                out.println("A matriz é inversível");
            else
                out.println("A matriz não é inversível");
        }
        else
            out.println("Use o Teorema de Laplace");
        
        out.print("\n-------------- V --------------\n");
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                out.print("[" + v[i][j] + "] ");                
            }
            out.println();
        }
    }
}