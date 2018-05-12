
package polimorfismo;

public class Vendedor extends Funcionario {
    
    @Override
    public void receberSalario(){
        double salarioFinal = salario + salario * 0.1;
        System.out.println("Salario R$"+salarioFinal);

    }
    
}
