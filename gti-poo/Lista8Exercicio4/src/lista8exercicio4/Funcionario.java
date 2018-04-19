package lista8exercicio4;

public class Funcionario {

    private String nome;
    private String matricula;
    private String departamento;
    private static int contaFuncionarios = 0;

    public Funcionario(){
        contaFuncionarios = contaFuncionarios+1;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome_a){
        nome = nome_a;
    }
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula_a){
        matricula = matricula_a;
    }
    public String getDepartamento(){
        return departamento;
    }
    public void setDepartamento(String departamento_a){
        departamento = departamento_a;
    }
    public static int getContaFuncionarios(){
        return contaFuncionarios;
    }
    //Como o enunciado pede para criar getter e setters para todos atributos, criei este. Mas não entendo sua utilidade.
    public static void setContaFuncionarios(int contaFuncionarios_a){
        contaFuncionarios = contaFuncionarios_a;
    }
    
}
