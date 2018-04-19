
package lista10ex11;


public class CameraEx11 {

    private String marca;
    private int resolucao;
    private double preco;
    
    public CameraEx11(String marca_A, int resolucao_A){
        marca = marca_A;
        if (resolucao_A > 10 ){
            resolucao = 10;
        } else {
            resolucao = resolucao_A;
        }
        if(resolucao <= 6){
            preco = 200.00;
        }else{
            preco = 350.00;
        }

    }

    //criar metodo para mostrar os detalhes da camera
    
    public String mostrarDetalhes(){
        String detalhes = "Marca: "+marca+"\nResolução: "+resolucao+"\nPreço: R$"+preco;
        return detalhes;
    }
}