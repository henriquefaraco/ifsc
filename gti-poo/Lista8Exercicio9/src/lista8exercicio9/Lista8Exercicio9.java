package lista8exercicio9;

import java.util.Scanner;

public class Lista8Exercicio9 {


    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Forneça o raio de um círculo: ");
        double raio = teclado.nextDouble();
        
        Circulo circulo1 = new Circulo();
        
        circulo1.setRaio(raio);
        
        System.out.println("Área do círculo: "+circulo1.calcularArea());
        System.out.println("Diâmetro do círculo: "+circulo1.calcularDiametro());
        System.out.println("Circuferência do círculo: "+circulo1.calcularCircuferencia());
        
    }
    
}
