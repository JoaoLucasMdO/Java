
package Classes;

public final class Fundamental extends Aluno {
    
    public Fundamental(String nome, EnumGenero genero, int idade) {
        super(nome, genero, idade);
    }
    public Fundamental(String nome, EnumGenero genero, int idade, float nota) {
        super(nome, genero, idade,nota);
        
    }
    @Override
    public String getNota() {
        if(super.nota >=9) return "A";
        else if(super.nota >=7) return "B";
        else if(super.nota >=5) return "C";
        else return "D";
    }
    @Override 
    public void setNota(String nota){
        if(null== nota) super.nota=0;
        else switch (nota) {
            case "A":
                super.nota=10;
                break;
            case "B":
                super.nota=8;
                break;
            case "C":
                super.nota=6;
                break;
            case "D":
                super.nota=4;
                break;
            default:
                super.nota=0;
                break;
        }
    }
    @Override
    public String toString(){
        return super.getNome() + " Aluno do Fundamental, Nota: " + getNota();
    }
}
