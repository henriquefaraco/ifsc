
package exemplo1;

import java.util.ArrayList;
import java.util.List;


public class Exemplo1 {

    
    public static void main(String[] args) {
        
        //crie uma lista com um objeto String
        List nomes = new ArrayList();
        
        //adicionar nomes
        nomes.add("Maria");
        nomes.add("José");
        nomes.add("Joana");
        nomes.add("Pedro");
        
        //mostrar todos os elementos da lista
        System.out.println("Elementos da lista nome = "+nomes);
        
        //mostrar apenas um elemento da lista
        System.out.println("Elemento = "+nomes.get(1));
        
        //adicionar mais uma pessoal na posição 3 da lista
        nomes.add(3, "Adicionado agora");
        System.out.println("Elementos da lista nome = "+nomes);
        
        //removendo um objeto da lista
        nomes.remove(3);
        System.out.println("Elementos da lista nome = "+nomes);
        
        //substituindo um objeto da lista
        nomes.set(0, "Nome atualizado");
        System.out.println("Elemento da lista nome = "+nomes);
        
        //verificar o tamanho da lista
        System.out.println("A lista de nomes possui "+nomes.size()+" elementos.");
        
        //criar uma lista com 3 inteiros e mostrar a soma deles:
        //Sem usar o <Integer> a soma não ocorreria, pois se trata de uma lista de objetos e por isso não podem ser somados
        List<Integer> inteiros = new ArrayList();
        inteiros.add(2);
        inteiros.add(3);
        inteiros.add(5);
        
        Integer somaInteiros = inteiros.get(0) + inteiros.get(1) + inteiros.get(2);
                
        System.out.println("Soma dos elementos: "+somaInteiros);
        
        //Criar e manipular uma lista de objetos alunos
        List<Aluno> listaAlunos = new ArrayList(2);
        
        //instanciando os dois objetos Aluno
        Aluno aluno1 = new Aluno("1010-1", 28);
        Aluno aluno2 = new Aluno("1010-2", 36);
        Aluno aluno3 = new Aluno("1010-3", 36);
        
        //inserindo o objeto aluno dentro da lista
        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);
        
        for(Aluno umAluno : listaAlunos){
            System.out.println("A matrícula do aluno é: "+umAluno.getMatricula());
        }
        
        //Perguntar pra nossa aplicacao se o Aluno2 está na lista (pesquisa em lista)
        System.out.println("O objeto Aluno2 está na lista? "+listaAlunos.contains(aluno3));
        
        
        
    }
    
}
