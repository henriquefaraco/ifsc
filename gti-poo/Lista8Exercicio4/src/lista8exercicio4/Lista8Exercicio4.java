package lista8exercicio4;


public class Lista8Exercicio4 {


    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        
        funcionario1.setNome("Cristiano");
        funcionario1.setMatricula("A1");
        funcionario1.setDepartamento("Biologia");
        
        System.out.println("Nome: "+funcionario1.getNome());
        System.out.println("Matrícula: "+funcionario1.getMatricula());
        System.out.println("Departamento: "+funcionario1.getDepartamento());
        
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();
                
        System.out.println("Quantidade de funcionarios cadastrados: " + Funcionario.getContaFuncionarios());
    }
}
