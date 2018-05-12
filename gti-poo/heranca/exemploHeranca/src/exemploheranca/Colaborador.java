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
public class Colaborador extends Pessoa {
    
    String carteiraTrabalho;
    
    public Colaborador(){
        
    }
    
    public Colaborador(String nome, int idade, double altura, double peso, String umaCarteiraTrabalho){
        super(nome, idade, altura, peso);
        this.carteiraTrabalho = umaCarteiraTrabalho;
    }
    
    
    
}
