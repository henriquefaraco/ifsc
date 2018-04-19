/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista10ex11;

/**
 *
 * @author Aluno
 */
public class Lista10Ex11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CameraEx11[] camera = new CameraEx11[4];
        
        camera[0] = new CameraEx11("Nikon", 5);
        camera[1] = new CameraEx11("Canon", 15);
        camera[2] = new CameraEx11("Sony", 8);
        camera[3] = new CameraEx11("Panasonic", 2);
        
        //mostrar informações das 4 cameras:
        System.out.println("Detalhes das 4 cameras digitais: \n");
        String detalhes;
        for(CameraEx11 objCamera : camera){
            detalhes = objCamera.mostrarDetalhes();
            System.out.println(detalhes +"\n");
        }
    }
    
}
