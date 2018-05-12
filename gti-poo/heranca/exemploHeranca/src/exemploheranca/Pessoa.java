/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploheranca;

/**
 *
 * @author Aluno
 */
public class Pessoa {

    String nome;
    int idade;
    double altura;
    double peso;
    
    public Pessoa(){
        
    }
    public Pessoa(String umNome, int umaIdade, double umaAltura, double umPeso){
        this.nome = umNome;
        this.idade = umaIdade;
        this.altura  = umaAltura;
        this.peso = umPeso;
    }
}
