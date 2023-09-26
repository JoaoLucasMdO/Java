package Pessoas;

public abstract class Funcionarios extends Pessoa {
private float salarioBase;
    
public Funcionarios(String nome, String genero, int idade, float salarioBase){
super(nome,genero,idade);
this.salarioBase = salarioBase;
}

public abstract double calculaSalario();

@Override
public String getNome(){
if (super.getGenero().equals("Masculino")){
return "Sr. " + super.nome;
}
else{
return "Sra. " + super.nome;
}
}

public void registrarPonto(){
/*Acessar o BD e registrar o horário*/
}

public float getSalarioBase(){
return salarioBase;    
}
}
