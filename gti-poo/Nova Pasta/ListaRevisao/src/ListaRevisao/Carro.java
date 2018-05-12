
package ListaRevisao;


public class Carro {

    private String marca;
    private int ano;
    private String cor;
    private String placa;
    
    public String acelerar(){
        String velocidade = "O carro está andando mais rápido agora";
        return velocidade;
    }
    public String frear(){
        String velocidade = "O carro está andando mais devagar agora";
        return velocidade;
    }
    public Carro(String marcaA, int anoA, String corA, String placaA){
        this.marca = marcaA;
        this.ano = anoA;
        this.cor = corA;
        this.placa = placaA;
        
    }
    
    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

   
    
         

}
