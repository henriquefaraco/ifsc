
package lista6exercicio2;

import javax.swing.JOptionPane;

public class Lista6Exercicio2 {

    public static void main(String[] args) {

        String distanciaKm = JOptionPane.showInputDialog(null, "Digite a distância em km: ");
        float distancia = Float.parseFloat(distanciaKm);
        
        //invoca o metodo que converte em metros
        converteMetro(distancia);
        //invoca o método que converte em centímetros
        converteCm(distancia);
    }
    
    public static void converteMetro(float dist){
        int metros = (int) dist * 1000;
        JOptionPane.showMessageDialog(null, "A conversão de km em metros é: "+metros);
    }
    public static void converteCm(float dist){
        int centimetros = (int) (dist * 100000);
        JOptionPane.showMessageDialog(null, "A conversão de km em centímetros é: "+centimetros);
        
    }
}
