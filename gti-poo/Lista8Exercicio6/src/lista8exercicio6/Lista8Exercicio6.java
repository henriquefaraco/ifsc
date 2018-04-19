
package lista8exercicio6;

import java.util.Scanner;


public class Lista8Exercicio6 {


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Forneça uma temperatura em Fahrenheit: ");
        
        Temperatura temp1 = new Temperatura(teclado.nextDouble());
        
        System.out.println("A temperatura em Celsius é: " + temp1.converterParaCelsius());
        System.out.println("A temperatura em Kelvin é: " + temp1.converterParaKelvin());

    }
    
}
