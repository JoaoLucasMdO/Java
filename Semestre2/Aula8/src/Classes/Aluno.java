
package Classes;
public abstract class Aluno extends Pessoa {

    protected float nota;
    
    public Aluno(String nome, EnumGenero genero, int idade) {
        super(nome, genero, idade);
    }
    public Aluno(String nome, EnumGenero genero, int idade, float nota) {
        super(nome, genero, idade);
        this.nota=nota;
    }
    /*===== Métodos Abstratos =====*/
    public abstract String getNota();
    public abstract void setNota(String nota);
    
    /*==== Getters =====*/
    @Override
    public String getNome() {
        return super.nome;
    }
   
    
}
