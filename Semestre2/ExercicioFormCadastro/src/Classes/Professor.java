
package Classes;

import java.io.Serializable;

public final class Professor extends Funcionario implements SalaVirtual, Serializable{
    
    
    private float salarioHora, qtdHoras;
    
    public Professor(String nome, EnumGenero genero, int idade){
        super(nome,genero,idade);
    }
        
    public void setSalarioHora(float salario){
        this.salarioHora=salario;
    }
    public void setQtdHora(float horas){
        this.qtdHoras=horas;
    }
    
    
    @Override
    public String getNome(){
        if(super.getGenero().equals(EnumGenero.MASCULINO)) 
            return "Professor "+ super.nome;
        else 
            return "Professora "+ super.nome; 
    }

    @Override
    public String login() {
        return "Logado na Sala Virtual!";
    }

    @Override
    public String logout() {
        return "Deslogado da Sala Virtual!";
    }

    @Override
    public double calculaSalario() {
        return super.salarioBase + salarioHora*qtdHoras;
    }
    
    @Override
    public String toString(){
        return super.getNome() ;
    }
    
}
