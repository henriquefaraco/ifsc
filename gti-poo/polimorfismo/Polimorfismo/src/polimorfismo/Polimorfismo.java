
package polimorfismo;


public class Polimorfismo {


    public static void main(String[] args) {
        
        Gerente joao = new Gerente();
    
        joao.receberSalario();
        
        Vendedor joaog = new Vendedor();
        
        joaog.receberSalario();
    
    }
    
}
