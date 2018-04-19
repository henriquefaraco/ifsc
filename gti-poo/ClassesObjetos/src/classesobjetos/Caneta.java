
package classesobjetos;

public class Caneta {
    //atributos
    String modelo;
    String cor;
    float ponta;
    int carga; //porcentagem de carga
    boolean tampada;
    
    //métodos
    void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro: não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando.");
        }
    }
    void mostrarEstado () {
        System.out.println("Cor da caneta: " + this.cor );
        System.out.println("Ponta da caneta: " + this.ponta );
        System.out.println("Caneta está tampada: " + this.tampada );
    }
    void tampar() {
        this.tampada = true;
    }
    void destampar() {
        this.tampada = false;
    }
}
