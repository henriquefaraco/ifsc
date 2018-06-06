
package revisãointerface2;


public class Subtracao implements OperacaoMatematica{
    private int resultado;
    
    @Override
    public void calcular(int valor1, int valor2) {
        resultado = valor1 - valor2;
        System.out.println("O resultado da subtração é "+resultado);
    }
    
    
    
}
