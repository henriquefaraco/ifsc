
package lista11exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Lista11Exercicio1 {


    public static void main(String[] args) {
        
        //criar a lista de inteiros
        List<Integer> inteiros = new ArrayList();
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite quantos inteiros quiser. Digite zero para encerrar a aplicação: ");
        
        int valor;
        
        do{
            valor = teclado.nextInt();
            //antes de inserir o n digitado na lista devemos verificar se ele já foi incluído
            if(!inteiros.contains(valor) && valor !=0){
                inteiros.add(valor);
            }
        }while (valor != 0);
           
        System.out.println("Valores da lista antes da remoção do ultimo elemento: "+inteiros);
        
        //Fazendo a remoção do último elemento da lista
        inteiros.remove(inteiros.size()-1);
        System.out.println("Valores após remover o último objeto: "+inteiros);
        }
    
        
        
    }
    

