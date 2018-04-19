package lista8exercicio5;

public class Lista8exercicio5 {

    public static void main(String[] args) {

        Automovel auto1 = new Automovel("corsa", "GM");

        auto1.acelerarAutomovel();
        System.out.println("Velocidade do carro: "+auto1.getVelocidadeAtual()+"km/h");

        auto1.acelerarAutomovel();
        System.out.println("Velocidade do carro: "+auto1.getVelocidadeAtual()+"km/h");

        auto1.acelerarAutomovel();
        System.out.println("Velocidade do carro: "+auto1.getVelocidadeAtual()+"km/h");

        auto1.frearAutomovel();
        System.out.println("Velocidade do carro: "+auto1.getVelocidadeAtual()+"km/h");

        auto1.frearAutomovel();
        System.out.println("Velocidade do carro: "+auto1.getVelocidadeAtual()+"km/h");
   }
    
}
