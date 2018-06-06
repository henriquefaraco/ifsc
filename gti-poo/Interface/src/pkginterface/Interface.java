/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author Aluno
 */
public class Interface {

    
    public static void main(String[] args) {
    
        Circulo circulo1 = new Circulo();
        circulo1.calcularArea();
        circulo1.calcularComprimento();
        
        Quadrado quadrado1 = new Quadrado();
        quadrado1.calcularArea();
        quadrado1.calcularComprimento();
    }
    
}
