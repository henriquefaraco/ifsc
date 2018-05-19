

package exemploescola;



public class ExemploEscola {

    
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        
        aluno.setIdade(19);
        System.out.println(aluno.getIdade());
        
        aluno.matricula = "gagaga";
        System.out.println(aluno.matricula);
    }
    
}
