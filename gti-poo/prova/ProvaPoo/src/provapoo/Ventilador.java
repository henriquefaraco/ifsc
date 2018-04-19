package provapoo;

public class Ventilador {

    //Criando as constantes Static uma vez que pertencem à classe
    private static final int LENTO = 1;
    private static final int MEDIO = 2;
    private static final int RAPIDO = 3;
    
    //Criando os atributos do método
    private int velocidade = LENTO;
    private boolean ligado;
    private double preco;
    
    //Criando o construtor personalizado que instancia o objeto com o atributo ligado true
    public Ventilador(){
        ligado = true;
    }    
    //Criando os getters e setters
    public void setVelocidade(int vel){
        velocidade = vel;
    }
    public int getVelocidade(){
        return velocidade;
    }
    public void setLigado(boolean ligado_a){
        ligado = ligado_a;
    }
    public boolean getLigado(){
        return ligado;
    }
    public void setPreco(double preco_a){
        preco = preco_a;
    }
    public double getPreco(){
        return preco;
    }
    //Criando o método que calcula o valor do desconto, atravez de um valor percentual passado como parâmetro
    public double calcularDesconto(double valorPercentual){
        double valorDesconto = preco*valorPercentual/100.0;
        return valorDesconto;
    }
    //Criando o método que desliga o ventilador
    public void desligarVentilador(){
        ligado = false;
    }
    
    
    
    
}
