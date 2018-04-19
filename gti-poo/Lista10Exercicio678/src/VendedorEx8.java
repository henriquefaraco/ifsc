
import javax.swing.JOptionPane;
import lista10exercicio678.VendedorEx6;


public class VendedorEx8 {


    public static void main(String[] args) {
        
        //declarando vetor de objetos com 5 posicoes
        VendedorEx6[] vetorVendedores = new VendedorEx6[5];
        
        //laço de repetição para atribuir valores ao objeto vetorVendedores
        double vendas = 25000;
        int i;
        String mensagem = "Vendedor     Matricula     Venda Anual(R$) \n--------------------------------------------------\n";
        
        for(i=111; i<=115;i++){
            vetorVendedores[i-111] = new VendedorEx6(i, vendas+(5000*(i-111))); 
        }
        int j = 0;
        for(VendedorEx6 vendedor: vetorVendedores){
            mensagem = mensagem + String.format("%8d %20d %15.2f \n", j , vendedor.getMatricula() , vendedor.getVendaAnual());
            j++;
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
