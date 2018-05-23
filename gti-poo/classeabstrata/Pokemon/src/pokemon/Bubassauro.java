/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

/**
 *
 * @author Aluno
 */
public class Bubassauro extends PokemonPrincipal{

    public Bubassauro(String umNome, String umMestre, String umTipo) {
        super(umNome, umMestre, umTipo);
    }

    @Override
    public void emitirSom() {
        
        System.out.println("Bubassauro...");
    }

    @Override
    public void evoluir() {
        
        System.out.println("Evolui para Ivessauro");        
    }

    @Override
    public void atacar() {
        
        System.out.println("Sei lá como");
    }

    @Override
    public void defender() {
        System.out.println("De outro jeito");
    }
    
}
