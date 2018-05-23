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
public class Chamander extends PokemonPrincipal {

    public Chamander(String umNome, String umMestre, String umTipo) {
        super(umNome, umMestre, umTipo);
    }

    @Override
    public void emitirSom() {
      
        System.out.println("Chamander!");
    }

    @Override
    public void evoluir() {
       
        System.out.println("Evoluindo para Charmaleon");
    }

    @Override
    public void atacar() {

        System.out.println("Lança chamas!!!");
    }

    @Override
    public void defender() {
        
        System.out.println("Esquivando...");
    }
    
}
