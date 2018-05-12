
package ListaRevisao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class ListaRevisao {


    public static void main(String[] args) {
    
        ArrayList agenda = new ArrayList();
        agenda.add("Rodrigo/99999-9999");
        agenda.add("Jonas/91999-9999");
        agenda.add("Cadu/99499-9999");
        agenda.add("Cesar/93999-9999");
        agenda.add("Thais/92999-9999");
        System.out.println("Exercício 1:");
        for(int i=0; i<agenda.size(); i++){
            System.out.println(agenda.get(i));
        }    
        agenda.remove(0);
        System.out.println("Após remoção:");
        for(int i=0; i<agenda.size(); i++){
            System.out.println(agenda.get(i));
        }    
        System.out.println("--------------------------------");
        System.out.println("Exercício 2:");
        agenda.set(1, "Gustavo/999979999");
        for(int i=0; i<agenda.size(); i++){
            System.out.println(agenda.get(i));
        }
        System.out.println("--------------------------------");
        System.out.println("Exercício 3");
        
        ArrayList filmes = new ArrayList();
        filmes.add("Se beber não case");
        filmes.add("O predador");
        filmes.add("Senhor dos Aneis");
        
        if(filmes.contains("O predador")){
            System.out.println("A lista contem o filme especificado");
        } else {
            System.out.println("A lista nao contém o filme especificado");
        }
        
        System.out.println("--------------------------------");
        System.out.println("Exercício 4:");
        
        HashSet filme = new HashSet();
        filme.add("filme 4");
        filme.add("filme 1");
        filme.add("filme 2");
        filme.add("filme 3");
        filme.add("filme 3");
        
        System.out.println(filme);
        
        System.out.println("--------------------------------");
        System.out.println("Exercício 5:");
        
        
        Carro carro1 = new Carro("Gm", 2002, "Branco", "MMM1212");
        Carro carro2 = new Carro("VW", 2011, "Prata", "QQQ1212");
        Carro carro3 = new Carro("BMW", 2012, "Preto", "HHH1212");
        
        System.out.println("Não há saída prevista. Código implementado com sucesso");
        
        System.out.println("--------------------------------");
        System.out.println("Exercício 6:");
        
        ArrayList<Carro> carros = new ArrayList();
        carros.add(carro1);
        carros.add(carro2);
        carros.add(carro3);
        
        System.out.println("Não há saída prevista. Código implementado com sucesso");
                
        System.out.println("--------------------------------");
        System.out.println("Exercício 7:");
     
        for (int i = 0; i< 3;i++){
            System.out.println(carros.get(i).getMarca());
            System.out.println(carros.get(i).getAno());
            System.out.println(carros.get(i).getCor());
            System.out.println(carros.get(i).getPlaca());
        }
        
        System.out.println("--------------------------------");
        System.out.println("Exercício 8:");
        
        System.out.println(carros.size());
        System.out.println(carros.get(2).getMarca());
        System.out.println(carros.get(2).getAno());
        System.out.println(carros.get(2).getCor());
        System.out.println(carros.get(2).getPlaca());
    }
    
    
}
