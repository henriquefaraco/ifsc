
package classesobjetos;

public class ClassesObjetos {

    public static void main(String[] args) {
        //instanciando um objeto caneta
        Caneta caneta1 = new Caneta();
        //caneta1.tampada = false;
        
        //invocar o método
        //caneta1.rabiscar();
        //caneta1.mostrarEstado();
        
        Caneta caneta2 = new Caneta ();
        
        caneta1.cor = "verde";
        caneta1.ponta = 0.5f;
        caneta1.carga = 80;
        
        caneta2.cor = "Preta";
        caneta2.modelo = "Bic Cristal";
        caneta2.ponta = 0.7f;
        
        caneta2.rabiscar();
        caneta2.tampar();
        caneta1.destampar();
        caneta1.mostrarEstado();
        caneta2.mostrarEstado();
        
    }
    
}
