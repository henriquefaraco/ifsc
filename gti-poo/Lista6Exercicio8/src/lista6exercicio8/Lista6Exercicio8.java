

package lista6exercicio8;

import java.util.Scanner;


public class Lista6Exercicio8 {

    
    public static void main(String[] args) {
    
        //invocando o método a()
        a();
        
    }
    
    public static void a(){
        System.out.println("Informe o tamanho da base do triangulo retângulo: ");
        Scanner teclado = new Scanner(System.in);
        double base = teclado.nextDouble();
        System.out.println("Informe o tamanho da base da altura do retângulo: ");
        Scanner teclado2 = new Scanner(System.in);
        double altura = teclado2.nextDouble();
        
        double area = b(base, altura);
        System.out.println("A área do triângulo é: "+area);
    }
    
    public static double b(double umaBase, double umaAltura){
        double area = (umaBase * umaAltura)/2.0;
        
        return area;
    }
}
