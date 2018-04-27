
package lista12;

public class ImpostoRendaExerc7 {

    private double rendimentoBruto;
    private int faixaSalarial;
    
    public ImpostoRendaExerc7(double umRendimento, int umaFaixa){
        rendimentoBruto = umRendimento;
        faixaSalarial = umaFaixa;                
    }
    public String calcularIR(){
        double faixa = this.faixaSalarial;
        double desconto;
        double rendaFinal;
        String resultado;
        if (faixa == 0){
            rendaFinal = this.rendimentoBruto *0.95;
            desconto = this.rendimentoBruto *0.05;
        } else if(faixa == 1){
            rendaFinal = this.rendimentoBruto *0.9;
            desconto = this.rendimentoBruto *0.1;
        } else {
            rendaFinal = this.rendimentoBruto *0.85;
            desconto = this.rendimentoBruto *0.15;
        }
        resultado = "A quantidade de dinheiro que fica com o governo é R$" + desconto + 
                "\nA quantidade de dinheiro que fica com quem trabalhou é R$" + rendaFinal;
                
        return resultado;
    }
    
}
