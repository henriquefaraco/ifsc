

package lista11exercicio2;


public class Triangulo {
    
    private double hipotenusa = 1.0;
    private double cateto1 = 1.0;
    private double cateto2 = 1.0;
    
    public Triangulo(){}
    public Triangulo(double catA, double catB, double hipA){
        cateto1 = catA;
        cateto2 = catB;
        hipotenusa = hipA;
    }

    public double getHipotenusa() {
        return hipotenusa;
    }

    public double getCateto1() {
        return cateto1;
    }

    public double getCateto2() {
        return cateto2;
    }

    public void setHipotenusa(double hipotenusa) {
        this.hipotenusa = hipotenusa;
    }

    public void setCateto1(double cateto1) {
        this.cateto1 = cateto1;
    }

    public void setCateto2(double cateto2) {
        this.cateto2 = cateto2;
    }
    public double calcularPerimetro(){
        double perimetro = hipotenusa+cateto1+cateto2;
        return perimetro;
    }
    public String visualizarTriangulo(){
        return "\nO triângulo tem três lados, sendo dois catetos com "+cateto1+"cm e "+cateto2+"cm e uma hipotenusa com "+hipotenusa+"cm.";
    }
}
