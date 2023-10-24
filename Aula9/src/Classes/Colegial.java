
package Classes;

public final class Colegial extends Aluno implements SalaVirtual{

    public Colegial(String nome, EnumGenero genero, int idade) {
        super(nome, genero, idade);
    }
    public Colegial(String nome, EnumGenero genero, int idade, float nota) {
        super(nome, genero, idade);
        this.nota=nota;
    }
    
    
    @Override
    public String login() {
        return "Aluno se conectou a sala virtual!";
    }

    @Override
    public String logout() {
        return "Aluno se desconectou a sala virtual!";
    }

    @Override
    public String getNota() {
        return  String.valueOf(super.nota);
    }
    @Override
    public void setNota(String nota){
        
        if(Integer.parseInt(nota) >= 0 && Integer.parseInt(nota) <= 10){
            super.nota= Float.parseFloat(nota);
        }
        else super.nota=0;           
    }
    @Override
    public String toString(){
        return super.getNome() + " Aluno do Colegial, Nota: " + getNota();
    }
    
}
