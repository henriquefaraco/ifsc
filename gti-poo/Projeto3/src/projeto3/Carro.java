

package projeto3;



public class Carro {
    private String placa;
    private static double autonomia;
    private boolean ligado;
    
    //construtor personalizado com dados default
    public Carro(){
        //inicializar os atributos da classe com valores defaul - poderiamos deixar vazio tal como {}
        placa = null;
        autonomia = 0;
        ligado = false;
    }
    //construtor que fornece o numero da placa e autonomia
    public Carro(String valorPlaca, double valorAutonomia){
        placa = valorPlaca;
        autonomia = valorAutonomia;
    }
    public void setPlaca(String valorPlaca){
        placa = valorPlaca;
    }
    public String getPlaca(){
        return placa;
    }
    public void ligarCarro(){
        ligado = true;
    }
    public static double calcularLitros(double distancia){
        double litros = distancia/autonomia;
        return litros;
    }
    
            
    
    
}
