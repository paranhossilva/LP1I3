//Bruno Paranhos Silva  CB3005437

/*Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de números) será digitado, deverá ser positivo, 
porém menor que vinte. Caso a quantidade não satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. 
Após a digitação dos “N” valores, exibir:
a. O maior valor;
b. O menor valor;
c. A soma dos valores;
d. A média aritmética dos valores;
e. A porcentagem de valores que são positivos;
f. A porcentagem de valores negativos;
Após exibir os dados, perguntar ao usuário de deseja ou não uma nova execução do programa. 
Consistir a resposta no sentido de aceitar somente “S” ou “N” e encerrar o programa em função dessa resposta.*/

import static java.lang.System.out;
import java.util.Scanner;

public class TP02Ex03 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int maior, menor, soma = 0, n, x;
        double media, neg = 0, pos = 0;
        char resp = 'S';
        
        do {
            do {
                out.print("Informe N: ");
                n = scan.nextInt();
            } while (n < 1 || n > 20);
            
            out.print("Informe o 1º número: ");
            x = scan.nextInt();
            
            maior = x;
            menor = x;
            
            if(x < 0)
                neg++;
            if(x > 0)
                pos++;
                    
            
            for (int i = 2; i <= n; i++) {
                out.print("Informe o " + i + "º número: ");
                x = scan.nextInt();
                
                soma += x;
                
                if(x > maior)
                    maior = x;
                if(x < menor)
                    menor = x;
                if(x < 0)
                    neg++;
                if(x > 0)
                    pos++;                
            }
            
            media = soma / n;
            
            neg = (neg/n)*100;
            pos = (pos/n)*100;
            
            out.println("Maior: " + maior +
                    "\nMenor: " + menor +
                    "\nSoma: " + soma + 
                    "\nMédia: " + media +
                    "\nPositivos: " + pos + "%" +
                    "\nNegativos: " + neg + "%");
            
            do {
                out.print("Você deseja continuar? (S/N) ");
                resp = scan.next().charAt(0);
            } while (Character.toUpperCase(resp) != 'S' && Character.toUpperCase(resp) != 'N');            
        } while (Character.toUpperCase(resp) == 'S');
        
    }
}