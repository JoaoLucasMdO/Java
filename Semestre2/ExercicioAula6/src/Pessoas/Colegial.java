
package Pessoas;

public final class Colegial extends Alunos implements SalaVirtual {
    
    public Colegial(String nome, String genero, int idade){
    super(nome, genero, idade);
    }
   
    @Override
    public void setNota(String nota){
    super.nota = Float.parseFloat(nota);    
    }
    
    @Override
    public String exibirNotas(){
    return "Nota:" + String.valueOf(super.nota);
    }
    
    @Override
    public String login(){
    
        
        return "Conectado na Sala Virtual!";
    }
    @Override
    public String logout(){
    
        return "Desconectado da Sala Virtual!";
    }
}
