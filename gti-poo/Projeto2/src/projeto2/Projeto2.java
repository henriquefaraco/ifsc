
package projeto2;

import java.util.Scanner;

public class Projeto2 {

    public static void main(String[] args) {

        Retangulo ret1 = new Retangulo(10,20);
        
        double largura = ret1.getLargura();
        double altura = ret1.getAltura();
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Forneça a nova altura: ");
        double alturaB = teclado.nextDouble();
        ret1.setAltura(alturaB);
        System.out.print("Forneça a nova largura: ");
        double larguraB = teclado.nextDouble();
        ret1.setLargura(larguraB);
        
        
        System.out.println("Altura: "+ret1.getAltura());
        System.out.println("Largura: "+ret1.getLargura());
        System.out.println("Area: "+ret1.calculaArea());
        System.out.println("Perímetro: "+Retangulo.calcularPerimetro(ret1.getAltura(), ret1.getLargura()));

        
    }
    
}
