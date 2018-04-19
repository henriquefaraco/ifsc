
package lista8exercicio7;


public class Lista8Exercicio7 {


    public static void main(String[] args) {

        Produto produto1 = new Produto();
        
        produto1.setDescricao("Shampoo para cavalo");
        produto1.setQuantidade(10);
        produto1.setPreco(15.99);
        
        double saldo = produto1.venderEstoque();
        
        System.out.println("Descrião do produto: "+produto1.getDescricao());
        System.out.println("Quantidade em estoque do produto: R$"+produto1.getQuantidade());
        System.out.println("Preço do produto: R$"+produto1.getPreco());
        System.out.println("saldo da venda de todo o estoque do produto: R$"+saldo);
    }
    
}
