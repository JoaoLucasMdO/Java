
package Classes;

import java.io.Serializable;

public abstract class Pessoa implements Serializable{
    
    protected String nome;
    private EnumGenero genero;
    private int idade;
    private String id;
    
    public Pessoa(String nome, EnumGenero genero, int idade) throws Exception{
        this.nome=nome;
        this.genero=genero;
        setIdade(idade);
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

    public void setIdade(int idade) throws Exception {
        if(idade <= 0){
        throw new Exception("Idade deverá ser maior que zero");
        }
        this.idade = idade;
    }
    
}
