
package lista6exercicio1;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Lista6Exercicio1 {


    public static void main(String[] args) {
        
        //solicita a temperatura em Fº.
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite uma temperatura em Fahrenheit para conversão: ");
        double tempF = teclado.nextDouble();
        
        //invocar o metodo que faz a conversão de F para C
        double tempC = converteC(tempF);
        
        imprimeTemp(tempC);
        
    }
    
    //Criar método converteC
    
    public static double converteC(double tempF){
        double tempC = (tempF - 32) * 5/9.0;
        return tempC;
    }
    public static void imprimeTemp(double tempC){
        DecimalFormat objFormato = new DecimalFormat ("0.##");
        System.out.println("A temperatura em graus celsius é "+ objFormato.format(tempC));
        
    }            

   
            
}
