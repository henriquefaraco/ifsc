
package lista10exercicio16;

import javax.swing.JOptionPane;

public class Lista10Exercicio16 {


    public static void main(String[] args) {
        // Criar vetor com os animais do zodiago chinês
        
        String[] signo = {"Macaco", "Galo", "Cachorro", "Porco", "Rato", "Touro", "Tigre", "Coelho", "Dragão", "Cobra", "Cavalo", "Cabra"};
        
        //Pede ao usuário o ano. Classe JOptionPane sempre retorna uma string
        String strAno = JOptionPane.showInputDialog(null, "Forneça o ano de seu nascimento");
        
        //Conver em inteiro para poder fazer calculos
        int ano = Integer.parseInt(strAno);
        
        //Calcula o resto da divisão do ano por 12
        int resto = ano%12;
        
        //mostrando o signo do usuário            
        System.out.println("Seu ano de nascimento é " + ano + " e o seu signo no zodiaco chinês é "+ signo[resto]);
        }
    }
    

