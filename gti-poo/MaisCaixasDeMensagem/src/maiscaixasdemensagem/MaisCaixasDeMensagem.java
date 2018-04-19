
package maiscaixasdemensagem;

import javax.swing.JOptionPane;

public class MaisCaixasDeMensagem {

    public static void main(String[] args) {

        //Caixa de mensagem com diálogo de confirmação
        
        int resposta = JOptionPane.showConfirmDialog(null, "Quer realmente excuir sua conta bancária? ", "Consulta Bancária", JOptionPane.YES_NO_CANCEL_OPTION);
    
        //Descobrindo a resposta
        
        if(resposta == 0){
            System.out.println("Conta cancelada com sucesso");
        } else if (resposta == 1){
            System.out.println("A operação de encerramento da conta não foi efetivada");
        } else {
            System.out.println("Operação cancelada");
        }
        
        //Caixa de diálogo com multiplas opções
        
        String[] tcc = {"Gerência de Redes", "Desenvolvimento de Sistemas", "Gestão de Tecnologiada Informação"};
        
        //Oferecer as opções para o usuário escolher
        
        String retorno = (String)JOptionPane.showInputDialog(null, "Escolha uma área para o seu TCC", "Escolha de TCC", JOptionPane.QUESTION_MESSAGE, null, tcc, null);
    
        System.out.println(retorno);
    }
    
}
