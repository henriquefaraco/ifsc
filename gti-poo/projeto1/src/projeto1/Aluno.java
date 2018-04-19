

package projeto1;


public class Aluno {
    private String nome;
    private double nota1, nota2;
    
    //construtores da classe
    public Aluno(){
        nome = "Pedro de Almeida";
        nota1 = 8.5f;
        nota2 = 6.4f;
    }
    public Aluno(String aluno, double n1, double n2){
        nome = aluno;
        nota1 = n1;
        nota2 = n2;
    }
    //definem os métodos getter e setters - Como nome e notas são privates, não poderão ser modificados de fora sem get e set
    public void setNome(String aluno){
        nome = aluno;
    }
    public void setNota1(double n1){
        nota1 = n1;
    }
    public void setNota2 (double n2){
        nota2 = n2;
    }
    public String getNome(){
        return nome;
    }
    public double getNota1(){
        return nota1;
    }
    public double getNota2(){
        return nota2;
    }
    //criando um método para calcular a média 
    public double calculaMedia(){
        return (nota1+nota2)/2.0;
        
    }

   
}
