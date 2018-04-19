package projeto2;

public class Retangulo {
    private double altura;
    private double largura;

public Retangulo(double alt, double larg) {
    altura = alt;
    largura = larg;
}
public void setAltura(double h){
    altura = h;
}
public void setLargura(double larg){
    largura = larg;
}
public double getAltura(){
    return altura;
}
public double getLargura(){
    return largura;
}
public double calculaArea(){
    return largura*altura;
}
public static double calcularPerimetro(double largura, double altura){
    return (altura + largura)*2;
}
}