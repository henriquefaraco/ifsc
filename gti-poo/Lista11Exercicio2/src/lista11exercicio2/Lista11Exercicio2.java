
package lista11exercicio2;

import java.util.ArrayList;
import java.util.List;


public class Lista11Exercicio2 {


    public static void main(String[] args) {
        
        //Criando os OBJ 
        Triangulo triangulo1 = new Triangulo();
        Triangulo triangulo2 = new Triangulo(3.5, 4.5, 5);
        Triangulo triangulo3 = new Triangulo(5.5, 6.5, 7);
        
        //criando as LIST
        List<Triangulo> listaTriangulo = new ArrayList();
        
        //Adicionando os OBJ na LIST
        listaTriangulo.add(triangulo1);
        listaTriangulo.add(triangulo2);
        listaTriangulo.add(triangulo3);
        
        //Usar a LIST para acessar os valores do OBJ
        double perimetro;
        int i;
        
        //usando laço for normal
        for(i=0;i<listaTriangulo.size();i++){
            System.out.println("O perímetro do triangulo "+(i+1)+ " é "+listaTriangulo.get(i).calcularPerimetro());
        }
        //usando foreach
        for(Triangulo umTriangulo : listaTriangulo){
            System.out.println("O perímetro é: "+umTriangulo.calcularPerimetro());
        }
        
        //Usando a LIST para acessar todos os elementos do triangulo 3 mais o seu perímetro
        System.out.println("Triangulo 3, cateto 1: "+listaTriangulo.get(2).getCateto1());
        System.out.println("Triangulo 3, cateto 2: "+listaTriangulo.get(2).getCateto2());
        System.out.println("Triangulo 3, hipotenusa: "+listaTriangulo.get(2).getHipotenusa());
        System.out.println("Triangulo 3, Perímetro: "+listaTriangulo.get(2).calcularPerimetro());
        System.out.println("Apresentação: "+listaTriangulo.get(2).visualizarTriangulo());
        
        //modificando os valores do terceiro triangulo através do LIST
        listaTriangulo.get(2).setCateto1(50);
        listaTriangulo.get(2).setCateto2(30);
        listaTriangulo.get(2).setHipotenusa(60);
        
        System.out.println("Triangulo 3 novo: "+listaTriangulo.get(2).calcularPerimetro());
        System.out.println("Apresentação: "+listaTriangulo.get(2).visualizarTriangulo());
        
    }
    
}
