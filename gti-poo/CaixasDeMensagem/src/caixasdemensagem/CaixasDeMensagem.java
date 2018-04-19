package caixasdemensagem;

import javax.swing.JOptionPane;

public class CaixasDeMensagem {

    public static void main(String[] args) {

        // Caixa de diálogo
        JOptionPane.showMessageDialog(null, "Olá Mundo", "Bem vindos" , JOptionPane.INFORMATION_MESSAGE);
        
        //receber um dado do usuário
        String nome = JOptionPane.showInputDialog("Por favor, diga seu nome");
        String idade = JOptionPane.showInputDialog("Qual a sua idade?");
        
                
        //Juntando nome e idade em uma mensagem só
        String mensagem = "Caro usuário confira seus dados: \n Nome: " + nome + "\n Sua idade: " + idade + " anos";
        
        JOptionPane.showMessageDialog(null, mensagem);

        //converter a idade string em um número inteiro
        
        int idadeConvertida = Integer.parseInt(idade);

        idadeConvertida = idadeConvertida + 5;
        
        JOptionPane.showMessageDialog(null, "Sua idade aumentada: " + idadeConvertida + " anos", "Bem vindos", JOptionPane.INFORMATION_MESSAGE);
        
        //Conversão de string em double
        
        double idadeEmReal = Double.parseDouble(idade);
        
        idadeEmReal = idadeEmReal * 5.5;
        
        JOptionPane.showMessageDialog(null, "Sua idade em reais x5,5: " + idadeEmReal + " reais", "Bem vindos", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
