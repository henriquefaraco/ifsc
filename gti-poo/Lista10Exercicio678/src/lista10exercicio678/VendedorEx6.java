
package lista10exercicio678;


public class VendedorEx6 {

    private int matricula;
    private double vendaAnual;
    
    //construtor personalizado
    public VendedorEx6(int matr_A, double venda_A){
        matricula = matr_A;
        vendaAnual = venda_A;
    }
    public int getMatricula(){
        return matricula;
    }
    public double getVendaAnual(){
        return vendaAnual;
    }
    public void setMatricula(int matr_B){
        matricula = matr_B;
    }
    public void setVendaAnual(double venda_B){
        vendaAnual = venda_B;
    }
}
