
package lista4exercicio6;

import javax.swing.JOptionPane;

public class Lista4Exercicio6 {

    public static void main(String[] args) {

        final double PERCENTUAL_CRESCIMENTO = 5;    
    
        //Solicitar estimativa de vendas da loja no ano:
        String venda = JOptionPane.showInputDialog(null, "Forneça o total de vendas estimado para este ano", "Estimativa de vendas", JOptionPane.INFORMATION_MESSAGE);
        // convertendo string em double
        double vendaEsperada = Double.parseDouble(venda);
        
        //calculando a estimativa
        double totalVendas = vendaEsperada + (vendaEsperada) * PERCENTUAL_CRESCIMENTO / 100;
        
        System.out.println("Se esse ano o esperado de vendas é "+vendaEsperada + "\nO esperado de vendas para o próximo ano é " + totalVendas);
    }
    
}
