
package lista8exercicio9;


public class Circulo {

    private double raio;
    private static final double PI = 3.14159;
    
    public Circulo(){} //a atividade não pede, mas se não for criado esse construtor, não poderemos criar o objeto sem passar o parâmetro raio e isso tornaria sem utilidade - para o exercicio - o método setRaio.
    public Circulo(double raioA){
        raio = raioA;
    }
    public void setRaio(double raioB){
        raio = raioB;
    }
    public double getRaio(){
        return raio;
    }
    public double calcularArea(){
        double area = PI*raio*raio;
        return area;
    }
    public double calcularDiametro(){
        double diametro = 2*raio;
        return diametro;
    }
    
    public double calcularCircuferencia(){
        double circuferencia = 2*PI*raio;
        return circuferencia;
    }
    
}
