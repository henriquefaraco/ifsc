

package lisla.l4;

import javax.swing.JOptionPane;


public class LislaL4 {


    public static void main(String[] args) {
        
        //Declarando uma constante com o uso da palavra reservada 'final'
        final double POLEGADA = 2.54;
        
        //Solicitando o usuário por caixa de mensagem
        String tamanho = JOptionPane.showInputDialog("Forneça o tamanho do seu monitor (em polegadas)");
        
        //Convertendo a String em double
        double tamanhoMonitor = Double.parseDouble(tamanho);
        
        //Descobrindo o tamanho em centímetros:
        double tamanhoCentimetro = tamanhoMonitor * POLEGADA;
        
        //Mostrando o resultado por caixa de diálogo e por mensagem
        JOptionPane.showMessageDialog(null, "O seu monitor mede: " + tamanhoCentimetro + "centímetros");
        System.out.println("O seu monitor tem " + tamanhoCentimetro + " centímetros.");
        
                
    
    }

    
    
}
