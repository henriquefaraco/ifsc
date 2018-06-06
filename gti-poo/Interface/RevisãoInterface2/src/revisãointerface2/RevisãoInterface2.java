
package revisãointerface2;


public class RevisãoInterface2 {

    public static void main(String[] args) {
        
        Soma soma1 = new Soma();
        Subtracao subtracao1 = new Subtracao();
        Divisao divisao1 = new Divisao();
        Multiplicacao multiplicacao1 = new Multiplicacao();
        
        soma1.calcular(10, 5);
        divisao1.calcular(10, 5);
        subtracao1.calcular(10, 5);
        multiplicacao1.calcular(10, 5);
    
    }
    
}
