

package exemploescola;


public class Aluno extends Pessoa {

    public String matricula;
    
    @Override
    public void fazerAniversario(){
        setIdade(getIdade()+2);
    }
}
