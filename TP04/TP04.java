//Bruno Paranhos Silva  CB3005437
package tp04;

import static java.lang.System.out;


public class TP04 {
    public static void main(String[] args) {
        Data data = new Data();
        
        out.println("Data: " + data.Mostra1());
        out.println("Data: " + data.Mostra2());
        
        if (data.Bissexto(data.getAno()))
            out.println("O ano é bissexto");
        else
            out.println("O ano não é bissexto");
        
        out.println("Dias Transcorridos: " + data.DiasTranscorridos());
        data.ApresentaData();
    }    
}