
package lista10exercicio3;

import javax.swing.JOptionPane;

public class Lista10Exercicio3 {

    public static void main(String[] args) {
        
        //criando vetores paralelos
        String[] produtos = {"Celular", "Pendrive", "Caneta"};
        double[] precos = {250, 25, 3.50};
        
        //Pedindo o nome de um produto
        String produto = JOptionPane.showInputDialog(null, "Forneça um nome de produto para pesquisarmos o preço", "Pesquisa em vetores", JOptionPane.PLAIN_MESSAGE);
        
        boolean achou = false;
        int indice = 0, i;
        
        for(i=0; i<3; i++){
            if(produto.equalsIgnoreCase(produtos[i])){ //equals é um método do objeto produto (String é sempre objeto) 
                achou = true;
                System.out.println("O preço do produto é: R$"+precos[i]);
            }
        }
        if(achou == false){
                System.out.println("O produto digitado não existe em nosso estoque");
        }        
    }
}
