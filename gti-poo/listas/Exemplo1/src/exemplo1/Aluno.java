package exemplo1;

public class Aluno {
    private String matricula = "0000";
    private int idade = 20;
    public Aluno(String umaMatricula, int umaIdade){
        matricula = umaMatricula;
        idade = umaIdade;
    }

    public int getIdade() {
        return idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
}
