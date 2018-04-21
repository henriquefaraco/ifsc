
package listaL12;

import java.awt.*;
import javax.swing.*;

public class Exerc1 {

    public static void main(String[] args) {
        
        //Criando a janela pela Classe JFrame
        JFrame janela = new JFrame("Conversão de Escalas de Temperatura");
        //definir o tamanho da janela
        janela.setPreferredSize(new Dimension(800, 640));
        //obrigar o java a encerrar a aplicação após clicar no x da janela (isso não é default)
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //criar um label para a janela - ISSO NÃO FAZ COM Q ELE APAREÇA DENTRO DA JANELA
        JLabel label = new JLabel("Forneça uma temperatura:");
        //Associando a label criada à janela (Agora aparece)
        janela.add(label);
        //criar uma caixa de texto - ISSO NÃO FAZ COM Q ELE APAREÇA DENTRO DA JANELA
        JTextField caixaTexto = new JTextField(20);
        //Associando a TEXTFIELD à janela (A partir do 1º elemento os demais são inseridos na camada mais abaixo, n aparecendo)
        janela.add(caixaTexto);
        
        //criando a janela pelo FlowLayout
        FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
        janela.setLayout(layout);
        //definir um elemento botão
        JButton botao = new JButton("converter temperatura");
        janela.add(botao);
        
        janela.setVisible(true); //Sem isso a janela não fica visivel, pois o default é null - importante criar no final
        janela.pack(); //Evita problemas de layout de componentes adicionais colocados no frame - importante criar no final
        
        
        
        
        
        
        
        
    }
    
}
