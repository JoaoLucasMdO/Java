
package Pessoas;

public final class Colegial extends Alunos {
    
    public Colegial(String nome, String genero, int idade){
    super(nome, genero, idade);
    }
   
    @Override
    public void setNota(String nota){
    super.nota = Float.parseFloat(nota);    
    }
    
    @Override
    public String exibirNotas(){
    return String.valueOf(super.nota);
    }       
}
