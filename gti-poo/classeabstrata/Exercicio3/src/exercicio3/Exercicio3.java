
package exercicio3;

public class Exercicio3 {

    public static void main(String[] args) {
    
        //Animal animal1 = new Animal(); Não é possivel instanciar um objeto de uma classe abstrata.
        
        //Instanciando objetos de cada classe para mostrar que funcionam
        Cachorro bob = new Cachorro();
        bob.emitirSom();
        
        Tartaruga ninja = new Tartaruga();
        ninja.locomover();
        
        Peixe nemo = new Peixe();
        nemo.locomover();
    }
    
}
