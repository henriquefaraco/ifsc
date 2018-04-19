


package projeto8;


public class AnimalDeEstimacao {

    private String nome;
    private String tipo;
    private int idade;
    private static int maiorIdade=0;
    
    public AnimalDeEstimacao(){
        nome = null;
        tipo = null;
        idade = 0;
        maiorIdade=0;
    }
    public void setNome (String nomeA){
        nome = nomeA;
    }
    public void setTipo (String tipoA){
        tipo = tipoA;
    }
    public void setIdade (int idade){
        this.idade=idade;
        if(this.idade > maiorIdade){
            maiorIdade = this.idade;
        }
    }
    public String getNome(){
        return nome;
    }
    public String getTipo(){
        return tipo;
    }
    public int getIdade(){
        return idade;
    }

    public static int calcularMaiorIdade(){
        return maiorIdade;
    }
}


        
    

