

package lista4exercicio10;

import java.util.Scanner;


public class Lista4Exercicio10 {

   
    
    public static void main(String[] args) {
        
        final int DUZIA = 12;
        final double VALOR_DUZIA = 7.25;
        final double PRECO_INDIVIDUAL = 0.85;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantos ovos você deseja comprar: ");
        int quantidadeOvos = teclado.nextInt();
        
        int quantidadeDuzias = quantidadeOvos / DUZIA;
        double restoOvos = quantidadeOvos % DUZIA;
        
        double valorDasDuzias = quantidadeDuzias * VALOR_DUZIA;
        double valorIndividual = (restoOvos * PRECO_INDIVIDUAL);
        double totalCompra = valorDasDuzias + valorIndividual;
        
        System.out.println("Você comprou " + quantidadeOvos + " ovos.");
        System.out.println("Isso perfaz " +quantidadeDuzias+ " duzias, com um total de R$" +valorDasDuzias + " e um adicional de " + restoOvos + " ovos individuais, com custo de R$" + valorIndividual );
        System.out.println("Sua despeza total é de R$" +totalCompra+ ". Volte Sempre");
        
        
        
        
        
    }
    
}
