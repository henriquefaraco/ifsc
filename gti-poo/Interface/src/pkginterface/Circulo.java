
package pkginterface;

public class Circulo implements FormaGeometrica {

    private final double PI = 3.14;
    private double raio = 10;
    private double area = 0;
    private double comprimento = 0;
    
    @Override
    public void calcularArea() {
        area = PI * raio * raio; // PI * Math.pow(2, raio)
        System.out.println(area);
    }

    @Override
    public void calcularComprimento() {
        comprimento = 2* PI * raio;
        System.out.println(comprimento);
    }

    
}
