
package projeto1;
//Também referenciada como sendo Lista8

import java.util.Scanner;


public class Projeto1 {

    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno();
        
        //receber os dados do console
        Scanner teclado = new Scanner(System.in);
        System.out.print("Forneça o nome do aluno: ");
        String nome1 = teclado.nextLine();
        
        System.out.println("Forneça a primeira nota: ");
        double nota1 = teclado.nextDouble();
        
        System.out.println("Forneça a segunda nota: ");
        double nota2 = teclado.nextDouble();
        
        //alterando o estado do objeto aluno1
        aluno1.setNome(nome1);
        aluno1.setNota1(nota1);
        aluno1.setNota2(nota2);
        
        double media = aluno1.calculaMedia();
        
        System.out.println("A média do aluno é : "+media);
        
        //Criar outro objeto do tipo Aluno usando o método personalizado
        Aluno aluno2 = new Aluno("João", 6, 7.8);
        
        //Acessar os dados do aluno2 usando get
        
        media = aluno2.calculaMedia();
        
        System.out.println("Nome: "+aluno2.getNome());
        System.out.println("Nota 1: "+aluno2.getNota1());
        System.out.println("Nota 2: "+aluno2.getNota2());
        System.out.println("Média: "+media);
            
        }
    
       
}
