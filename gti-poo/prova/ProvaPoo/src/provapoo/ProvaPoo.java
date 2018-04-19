
package provapoo;


public class ProvaPoo {


    public static void main(String[] args) {
    
        //instanciando o objeto Ventilador1
        Ventilador ventilador1 = new Ventilador();
        
        //Mudando o status ligado, velocidade e preço passando valores literais ao mesmo
        ventilador1.setLigado(false);
        ventilador1.setVelocidade(3);
        ventilador1.setPreco(75.00);
        
        //invocando o metodo desligarVentilador para desligá-lo
        ventilador1.desligarVentilador();
        
        //invocando o método que calcula o desconto ofertado
        ventilador1.calcularDesconto(10);
        
        //Mostrando ao usuário a velocidade, o Status, o preço de venda e o valor do desconto
        System.out.println("Velocidade do ventilador: "+ventilador1.getVelocidade());
        System.out.println("O ventilador está ligado?: "+ventilador1.getLigado());
        System.out.println("Preço de venda do ventilador: R$"+ventilador1.getPreco());
        System.out.println("Valor de desconto dado no ventilador: R$"+ventilador1.calcularDesconto(10));
        
    }
    
}
