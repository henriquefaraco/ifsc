
package exercicio3;


public class Reptil extends Animal {

    public String corEscamas;
    
    public void porOvos(){
        
    }
    @Override
    public void locomover(){
        System.out.println("Rastejando...");
        
    }

    @Override
    public void emitirSom() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void comer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
