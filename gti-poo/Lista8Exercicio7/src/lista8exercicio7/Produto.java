
package lista8exercicio7;

public class Produto {
    
    private String descricao;
    private int quantidade;
    private double preco;
    
    public String getDescricao(){
        return descricao;
    }
    public void setDescricao(String desc){
        descricao = desc;
    }        
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quant){
        quantidade = quant;
    }        
    public double getPreco(){
        return preco;
    }
    public void setPreco(double precoA){
        preco = precoA;
    }
    public double venderEstoque(){
        double saldo = preco*quantidade;
        return saldo;
    }
}
