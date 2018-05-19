
package exemploescola;


public class Pessoa {

    private String nome;
    private int idade;
    private String cpf;
    private String emailInstitucional;
    
    public void fazerAniversario(){
        idade++;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmailInstitucional() {
        return emailInstitucional;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmailInstitucional(String emailInstitucional) {
        this.emailInstitucional = emailInstitucional;
    }
    
}
