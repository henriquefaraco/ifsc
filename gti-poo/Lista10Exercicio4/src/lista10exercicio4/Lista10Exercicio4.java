
package lista10exercicio4;

import java.util.Arrays;

public class Lista10Exercicio4 {

    public static void main(String[] args) {
        
    //criar vetor com 8 inteiros
        int[] inteiros = {116, 92, 38, 45, 65, 62, 71, 83};
        
    //mostrar os elementos de um vetor usando o método toString da classe Arrays
        System.out.println("Vetores: "+Arrays.toString(inteiros));
        
    //mostrar os elementos de forma invertida 
        int[] inteiroInvertido = new int[8];
        int i; 
        int somaInteiros = 0;
        double mediaInteiros = 0;
        
        
        for(i=0;i<8;i++){
            inteiroInvertido[i] = inteiros[7-i];
        }
        System.out.println("Vetores invertidos: "+Arrays.toString(inteiroInvertido));
        
    //mostrar a soma dos inteiros
        for(int elementos : inteiros){
            somaInteiros += elementos;
        }
        System.out.println("Soma dos inteiros: "+somaInteiros);
    
        //mostrar todos inteiros menores do que 50
        for(i=0;i<8;i++){
            if(inteiros[i]<50){
                System.out.println("Menor do que 50: "+inteiros[i]);
            }            
        }
        
        //item E e F - mostrar o menor e o maior valor
        
        Arrays.sort(inteiros);
        int menorValor = inteiros[0];
        int maiorValor = inteiros[inteiros.length-1];
        
        System.out.println("O menor valor é: "+menorValor);
        System.out.println("O maior valor é: "+maiorValor);
        
        //mostrar a média
        somaInteiros = 0;
        for(int elementos : inteiros){
            somaInteiros += elementos;
        }
        mediaInteiros = somaInteiros / (inteiros.length);
        System.out.println("media dos elementos do vetor: "+mediaInteiros);
        
        //mostrar valores maiores do que a media
        for(i=0;i<8;i++){
            if(inteiros[i]>mediaInteiros){
                System.out.println("Maiores do que a média: "+inteiros[i]);
            }            
        }
    }
}

