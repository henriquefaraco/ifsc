
package polimorfismo;


public class Gerente extends Funcionario {
    
    
@Override
public void receberSalario(){
        double salarioFinal = salario + salario * 0.2;
        System.out.println("Salario R$"+salarioFinal);

    }
}
