
package dadosdoconsole;

import java.util.Scanner;


public class DadosDoConsole {

    
    public static void main(String[] args) {
        
        //vamos criar o objeto scanner para a leitura de dados do console
        
        Scanner entrada = new Scanner(System.in);
        
        //Solicitando uma idade
        
        System.out.print("Forneça a sua idade: ");
        int idade = entrada.nextInt();
        
        //Solicitando o nome
        
        System.out.print("Forneça o seu nome completo: ");
        //Limpando o buffer para não dar erro na entrada do nome:
        entrada.nextLine();
        String nomeCompleto = entrada.nextLine();      
        
        System.out.println("Caro usuário, de acordo com os dados fornecidos, temos: \nSeu nome: " + nomeCompleto + "\nSua idade: " +idade);
                
    }
    
}
