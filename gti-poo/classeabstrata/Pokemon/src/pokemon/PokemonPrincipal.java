
package pokemon;

public abstract class PokemonPrincipal {
    
    private String nome;
    private String mestre;
    private String tipo;
    
    public abstract void emitirSom();
    public abstract void evoluir();
    public abstract void atacar();
    public abstract void defender();
    
    public PokemonPrincipal(String umNome, String umMestre, String umTipo) {
        this.mestre = umMestre;
        this.nome  = umNome;
        this.tipo = umTipo;
    }
    
}
