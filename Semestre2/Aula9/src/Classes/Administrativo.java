
package Classes;

public final class Administrativo extends Funcionario{
    
    public Administrativo(String nome, EnumGenero genero, int idade){
        super(nome,genero,idade);
    }

    @Override
    public double calculaSalario() {
        return super.salarioBase;
    }

   
}
