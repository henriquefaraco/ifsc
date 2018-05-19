
package herancapolimorfismo;

public class ContaCorrente extends Conta{

    public ContaCorrente(String agencia, String conta) {
        super(agencia, conta);
    }

    @Override
    public void sacar(double valor){
        if(getSaldo()>= valor){
            setSaldo(getSaldo() - valor);
        } else {
            String erro = "Saldo insuficiente";
            System.out.println(erro);
        }
    }
    @Override
    public void depositar(double valor){
        if(valor > 0){
            setSaldo(getSaldo() + valor);
        } else {
            String erro = "Nenhum valor a depositar";
            System.out.println(erro);
        }
    }
}
