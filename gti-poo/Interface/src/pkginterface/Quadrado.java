
package pkginterface;


public class Quadrado implements FormaGeometrica {
    
    private double area;
    private double lado = 10;
    private double comprimento;
    
    @Override
    public void calcularArea() {
        area = lado * lado;
        System.out.println(area);
    }

    @Override
    public void calcularComprimento() {
        comprimento = 4*lado;
        System.out.println(comprimento);
    }
    
}
