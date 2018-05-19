
package herancapolimorfismo;

public class Conta {

    private String agencia;
    private String conta;
    private double saldo = 400;

    public Conta(String agencia, String conta) {
        this.conta = conta;
        this.agencia = agencia;
    }
    
    public void sacar(double valor){
    }
    public void depositar(double valor){
    }

    public String getAgencia() {
        return agencia;
    }

    public String getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
