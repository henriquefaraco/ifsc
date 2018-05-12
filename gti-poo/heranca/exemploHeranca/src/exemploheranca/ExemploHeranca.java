
package exemploheranca;

public class ExemploHeranca {


    public static void main(String[] args) {
        
        Colaborador trabalhador1 = new Colaborador("Joao", 22, 1.80, 80.6, "xx");
        
        System.out.println(trabalhador1.nome);
        System.out.println(trabalhador1.idade);
        System.out.println(trabalhador1.altura);
        System.out.println(trabalhador1.peso);
        System.out.println(trabalhador1.carteiraTrabalho);
    }
        
 
    
    
}
