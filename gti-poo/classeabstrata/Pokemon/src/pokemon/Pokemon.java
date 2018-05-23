
package pokemon;


public class Pokemon {


    public static void main(String[] args) {
        Pikachu pi = new Pikachu("Pikachu", "Jef", "Elétrica");
        pi.emitirSom();
        pi.atacar();
        pi.defender();
        pi.evoluir();
    
        Bubassauro buba = new Bubassauro("Dilma","Fernando","Planta");
        buba.emitirSom();
        buba.atacar();
        buba.defender();
        buba.evoluir();
    }
    
    
    
}
