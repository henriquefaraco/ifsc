

package projeto3;

import java.util.Scanner;


public class Projeto3 {

        
    public static void main(String[] args) {
      
            Carro carroA = new Carro();
            
            Scanner teclado = new Scanner(System.in);
            System.out.print("Digite a placa: ");
            String placa = teclado.nextLine();
            System.out.print("Digite a autonomia (km/L): ");
            double autonomia = teclado.nextDouble();
            
            Carro carroB = new Carro(placa, autonomia);
            
            carroA.ligarCarro();
            
            System.out.println("Placa do Carro B: "+carroB.getPlaca());
            System.out.print("Forneça a distância da viagem (km): ");
            double distancia = teclado.nextDouble();
            
            System.out.println("A autonomia do carro é: "+Carro.calcularLitros(distancia)+"L");
            
    }
    
}
