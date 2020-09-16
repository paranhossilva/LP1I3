//15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares. Calcular e exibir o valor correspondente em Reais (R$).

//Bruno Paranhos Silva    CB3005437

import static java.lang.System.out;
import java.util.Scanner;

public class TP01Ex15{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        double dolar;
        
        out.print("Valor em Dólar: ");
        dolar = scan.nextDouble();
        
        out.print("Cotação: ");
        dolar *= scan.nextDouble();
        
        out.printf("Valor em Real: R$ %.2f", dolar);
    }
}