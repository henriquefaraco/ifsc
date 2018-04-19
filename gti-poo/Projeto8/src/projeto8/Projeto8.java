package projeto8;

import java.util.Scanner;


public class Projeto8 {


    public static void main(String[] args) {
        
        AnimalDeEstimacao animal1 = new AnimalDeEstimacao();
        
        animal1.setNome("Totó");
        animal1.setIdade(8);
        animal1.setTipo("Cachorro");
        
        AnimalDeEstimacao animal2 = new AnimalDeEstimacao();
        
        animal2.setNome("Buçica");
        animal2.setTipo("Cachorro");
        animal2.setIdade(115);
        
        AnimalDeEstimacao animal3 = new AnimalDeEstimacao();
        
        animal2.setNome("Rex");
        animal2.setTipo("Cachorro");
        animal2.setIdade(45);
        
        System.out.println("A idade do animal mais velho é: "+AnimalDeEstimacao.calcularMaiorIdade());
        
    }
    
}
