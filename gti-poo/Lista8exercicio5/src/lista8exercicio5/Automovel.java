package lista8exercicio5;

public class Automovel {

    private String modelo;
    private String fabricante;
    private double velocidadeAtual;
    
    public Automovel(String modelo_a, String fabricante_a){
        modelo = modelo_a;
        fabricante = fabricante_a;
        velocidadeAtual = 0;
    }
    public void setModelo(String modelo_b){
        modelo = modelo_b;
    }
    public String getModelo(){
        return modelo;
    }
    public void setFabricante(String fabricante_b){
        fabricante = fabricante_b;
    }
    public String getFabricante(){
        return fabricante;
    }
    public void setVelocidadeAtual(double velocidadeAtual_b){
        velocidadeAtual = velocidadeAtual_b;
    }
    public double getVelocidadeAtual(){
        return velocidadeAtual;
    }
    public void acelerarAutomovel(){
        velocidadeAtual = velocidadeAtual + 5;
    }
    public void frearAutomovel(){
        velocidadeAtual = velocidadeAtual - 5;
    }
    
    
}
