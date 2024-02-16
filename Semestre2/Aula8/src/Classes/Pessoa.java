
package Classes;
public abstract class Pessoa {
    
    protected String nome;
    private EnumGenero genero;
    private int idade;
    
    public Pessoa(String nome, EnumGenero genero, int idade){
        this.nome=nome;
        this.genero=genero;
        this.idade=idade;
    }
    
    /* ==== Métodos abstratos ==== */
     public abstract String getNome();
     
    /*===== Getters e Setters =====*/
    public EnumGenero getGenero() {
        return genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(EnumGenero genero) {
        this.genero = genero;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
