
package listaL12;

public class PoupancaExerc5 {
    
    private double quantiaInicial;
    private double taxaMensal;
    private int tempo;
    
    public PoupancaExerc5(double umaQuantia, double umaTaxa, int umTempo){
        quantiaInicial = umaQuantia;
        taxaMensal = umaTaxa;
        tempo = umTempo;                
    }
    public double calcularRendimento(){
        int tempoEmMeses = tempo * 12;
        double rendimento = quantiaInicial * taxaMensal/100.0 * tempoEmMeses;
        double total = quantiaInicial + rendimento;
        return total;
    }
  
}
