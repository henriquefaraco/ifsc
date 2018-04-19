
package lista10exercicio678;

import javax.swing.JOptionPane;


public class Lista10Exercicio678 {


    public static void String[] args) {
        
        //Criar cinco objetos do tipo VendedorEx6 sem usar vetores
        //VendedorEx6 vendedor1 = new VendedorEx6(9999, 0.0);
        //VendedorEx6 vendedor2 = new VendedorEx6(9999, 0.0);
        //VendedorEx6 vendedor3 = new VendedorEx6(9999, 0.0);
        //VendedorEx6 vendedor4 = new VendedorEx6(9999, 0.0);
        //VendedorEx6 vendedor5 = new VendedorEx6(9999, 0.0);
    
        //Criar cinco objetos do tipo VendedorEx6 usando vetores
        
        //primeiro define e declara o vetor de objetos
        VendedorEx6[] vetorVendedores = new VendedorEx6[5];
        
        //Criando os objetos da classe e armazenando-os no vetor criado
        //vetorVendedores[0] = new VendedorEx6(9999, 0.0);
        //vetorVendedores[1] = new VendedorEx6(9999, 0.0);
        //vetorVendedores[2] = new VendedorEx6(9999, 0.0);
        //vetorVendedores[3] = new VendedorEx6(9999, 0.0);
        //vetorVendedores[4] = new VendedorEx6(9999, 0.0);
        
        for(int j = 0; j<vetorVendedores.length; j++){
            vetorVendedores[j] = new VendedorEx6(9999, 0.0);
        }
        //mostrar os dados de cada vendedor
        String mensagem = "Vendedor     Matricula     Venda Anual(R$) \n--------------------------------------------------\n";
        
        //montar um laço para mostrar todos elementos do vetorVendedores
        
        int i = 0;
        for(VendedorEx6 vendedor: vetorVendedores){
            mensagem = mensagem + String.format("%8d %20d %15.2f \n", i , vendedor.getMatricula() , vendedor.getVendaAnual());
            i++;
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
