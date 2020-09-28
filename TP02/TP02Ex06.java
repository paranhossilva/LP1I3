//Bruno Paranhos Silva  CB3005437

//6. Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.

import static java.lang.System.out;
import java.util.Scanner;

public class TP02Ex06 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String[][] nome = new String[2][3];
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                out.print("Informe [" + i + "][" + j + "]: ");
                nome[i][j] = scan.next();
            }
        }
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                out.print("[" + nome[i][j] + "] ");                
            }
            out.println();
        }           
    }
}