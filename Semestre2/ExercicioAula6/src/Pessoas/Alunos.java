package Pessoas;

public abstract class Alunos extends Pessoa {
protected float nota;
    
public Alunos(String nome, String genero, int idade){
super(nome, genero, idade);
}

public abstract String exibirNotas();
public abstract void setNota(String nota);

@Override
public String getNome(){
if (super.getGenero().equals("Masculino")){
return "Aluno " + super.nome;
}
else{
return "Aluna " + super.nome;
}
}

}
