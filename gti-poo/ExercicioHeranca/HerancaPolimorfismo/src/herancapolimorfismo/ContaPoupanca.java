
package herancapolimorfismo;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String agencia, String conta) {
        super(agencia, conta);
    }

    @Override
    public void sacar(double valor){
        if(valor <= (getSaldo()-100)){
            setSaldo(getSaldo()-valor);
        } else {
            String erro = "Operação não autorizada";
            System.out.println(erro);
        }
    }
    @Override
    public void depositar(double valor){
        if(valor > 100){
            setSaldo(getSaldo() + valor);
        } else {
            String erro = "Valor insificiente para depósito em Popança";
            System.out.println(erro);
        }
    }
}
