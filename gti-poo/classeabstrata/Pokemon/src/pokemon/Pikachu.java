
package pokemon;

public class Pikachu extends PokemonPrincipal {

    public Pikachu(String umNome, String umMestre, String umTipo) {
        super(umNome, umMestre, umTipo);
    }

        

    @Override
    public void emitirSom() {
        System.out.println("Pika Pika Pikachu!!!");
    }

    @Override
    public void evoluir() {
        System.out.println("Evoluindo para... Raichu");
    }

    @Override
    public void atacar() {
        System.out.println("Choque do trovão!!!");
    }

    @Override
    public void defender() {
        System.out.println("Esquivando...");
    }
   
}
