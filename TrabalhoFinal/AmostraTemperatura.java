//Bruno Paranhos Silva   CB3005437

package trabalhopratico;

import static java.lang.System.out;
import java.util.Scanner;

public class AmostraTemperatura {
    private static int numseq;
    private static Data data;
    private static Hora hora;
    private static float valor;
    private Scanner scan = new Scanner(System.in);
    
    public int getNumseq() {
        return numseq;
    }

    public void setNumseq(int numseq) {
        this.numseq = numseq;
    }

    public String getData() {
        return data.getData();
    }

    public void setData(int a, int b, int c) {
        data = new Data(a, b, c);
    }
    
    public void setData() {
        int dia, mes, ano;
        
        out.println("----- Data -----");
        
        out.print("Informe o dia: ");
        dia = scan.nextInt();
        
        out.print("Informe o mes: ");
        mes = scan.nextInt();
        
        out.print("Informe o ano: ");
        ano = scan.nextInt();
        
        data = new Data(dia, mes, ano);
    }

    public String getHora() {
        return hora.getHora();
    }

    public void setHora(int a, int b, int c) {
        hora = new Hora(a, b, c);
    }
    
    public void setHora() {
        int h, min, s;
        
        out.println("----- Hora -----");
        
        out.print("Informe a hora: ");
        h = scan.nextInt();
        
        out.print("Informe os minutos: ");
        min = scan.nextInt();
        
        out.print("Informe os segundos: ");
        s = scan.nextInt();
        
        data = new Data(h, min, s);
    }   

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        setNumseq(getNumseq() + 1);
        this.valor = valor;
    }
    
    AmostraTemperatura(){
        int dia, mes, ano, h, min, s;
        float valor;
        
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
        
        
        new AmostraTemperatura(h, min, s, dia, mes, ano, valor);
    }
    
    AmostraTemperatura(int a, int b, int c, int d, int e, int f, float v){
        setData(a, b, c);
        setHora(d, e, f);
        setValor(v);
    }
    
    AmostraTemperatura(Data d, Hora h, float v){
        
    }

    private static class Data {
        private int dia, mes, ano;
        
        public Data(int a, int b, int c){
            dia = a;
            mes = b;
            ano = c;
        }
        
        public String getData(){
            return dia + "/" + mes + "/" + ano;
        }
    }

    private static class Hora {

        private int h, min, s;
        
        public Hora(int a, int b, int c){
            h = a;
            min = b;
            s = c;
        }
        
        public String getHora(){
            return h + "/" + min + "/" + s;
        }
    }
}