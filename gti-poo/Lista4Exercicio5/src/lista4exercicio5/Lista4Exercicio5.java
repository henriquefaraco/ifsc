
package lista4exercicio5;

import java.util.Scanner;


public class Lista4Exercicio5 {


    public static void main(String[] args) {
    
    //Declarando uma constante com o uso da palavra reservada 'final'
        final double POLEGADA = 2.54;
        
        //Solicitando a informação ao usuário através de linha de comando - criando o objeto scanner
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Forneça o tamanho do seu monitor (em polegadas): ");
        
        //Fornecendo o tamanho do monitor em polegadas
        double tamanhoMonitor = teclado.nextDouble();
        
        //Descobrindo o tamanho em centímetros:
        double tamanhoCentimetro = tamanhoMonitor * POLEGADA;
        
        //Mostrando o resultado por caixa de diálogo e por mensagem
        System.out.println("O seu monitor tem " + tamanhoCentimetro + " centímetros.");
        
                
    }
    
}
