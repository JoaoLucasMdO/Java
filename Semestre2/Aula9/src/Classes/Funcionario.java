
package Classes;
public abstract class Funcionario extends Pessoa {
    
    protected float salarioBase;
    
    public Funcionario(String nome, EnumGenero genero, int idade){
        super(nome,genero,idade);
    }
    /*==== Métodos Abstratos =====*/
    public abstract double calculaSalario(); 
    
    /*==== Métodos Getters e Setters =====*/
    @Override
    public String getNome(){
        if(super.getGenero().equals(EnumGenero.MASCULINO)) 
            return "Sr. "+ super.nome;
        else 
            return "Sra. "+ super.nome;            
    }
   
    
    public void setSalarioBase(float salarioBase){
        this.salarioBase=salarioBase;
    }
    
}
