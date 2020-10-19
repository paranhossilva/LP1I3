//Bruno Paranhos Silva   CB3005437

package trabalhopratico;

import static java.lang.System.out;
import java.util.Scanner;

public class TrabalhoPratico {

    public static void main(String[] args) {
        int dia, mes, ano, h, min, s;
        float valor;
        Scanner scan = new Scanner(System.in);
                
        out.println("----- Hora -----");
        
        out.print("Informe a hora: ");
        h = scan.nextInt();
        
        out.print("Informe os minutos: ");
        min = scan.nextInt();
        
        out.print("Informe os segundos: ");
        s = scan.nextInt();
        
        
        out.println("-------------------------------");
        
        
        out.println("----- Data -----");
        
        out.print("Informe o dia: ");
        dia = scan.nextInt();
        
        out.print("Informe o mes: ");
        mes = scan.nextInt();
        
        out.print("Informe o ano: ");
        ano = scan.nextInt();
        
        
        out.println("-------------------------------");
        
        out.print("Informe o valor: ");
        valor = scan.nextFloat();
        
        out.println("\n-------------- T1 --------------\n");
        
        AmostraTemperatura t1 = new AmostraTemperatura(h, min, s, dia, mes, ano, valor);
        
        out.println("Data: " + t1.getData());
        out.println("Hora: " + t1.getHora());
        out.println("Valor: " +  + t1.getValor());
        out.println("Sequência: " + t1.getNumseq() + "\n");       
        
        
        AmostraTemperatura t2 = new AmostraTemperatura();
        
        out.println("\n-------------- T2 --------------\n");
        
        out.println("Data: " + t2.getData());
        out.println("Hora: " + t2.getHora());
        out.println("Valor: " +  + t2.getValor());
        out.println("Sequência: " + t2.getNumseq());
        
        out.println("\n-------------- T1 --------------\n");
        
        out.println("Data: " + t1.getData());
        out.println("Hora: " + t1.getHora());
        out.println("Valor: " +  + t1.getValor());
        out.println("Sequência: " + t1.getNumseq());
    }    
}