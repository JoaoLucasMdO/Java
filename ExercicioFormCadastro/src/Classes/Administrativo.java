
package Classes;

import java.io.Serializable;

public final class Administrativo extends Funcionario implements Serializable{
    
    public Administrativo(String nome, EnumGenero genero, int idade){
        super(nome,genero,idade);
    }

    @Override
    public double calculaSalario() {
        return super.salarioBase;
    }

   
}
