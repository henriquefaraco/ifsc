
package revisãointerface2;


public class Divisao implements OperacaoMatematica {

    private int resultado;

    @Override
    public void calcular(int valor1, int valor2) {
        resultado = valor1 / valor2;
        System.out.println("O resultado inteiro da divisão é: "+resultado);
    }
    
}
