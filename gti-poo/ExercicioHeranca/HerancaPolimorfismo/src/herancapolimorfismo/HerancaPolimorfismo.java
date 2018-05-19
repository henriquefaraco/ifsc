
package herancapolimorfismo;


public class HerancaPolimorfismo {


    public static void main(String[] args) {
        
        ContaCorrente conta1 = new ContaCorrente("2000-1", "1234-5");
        
        conta1.depositar(150);
        System.out.println(conta1.getSaldo());
        
        conta1.sacar(500);
        System.out.println(conta1.getSaldo());
        System.out.println("-------------------");
        
        ContaPoupanca conta2 = new ContaPoupanca("1000-2", "1234-5");
        
        System.out.println(conta2.getSaldo());
        conta2.depositar(150);
        System.out.println(conta2.getSaldo());
        
        conta2.sacar(99);
        System.out.println(conta2.getSaldo());
        System.out.println("-------------------");
        
    
    }
    
}
