
package Classes;


public class Equipamento extends Componente {
    
    
    Float margemLucro;
    Float impostos;
    
    public Equipamento(String nome,String id)throws FormatoIdInvalido {
        this(nome, id, 0.25f);
    }
    public Equipamento(String nome,String id, Float margemLucro) {
        this(nome,id,margemLucro,0.30f);
       
    }
    public Equipamento(String nome,String id, Float margemLucro, Float impostos)  {
        super(nome,id);
        this.margemLucro=margemLucro;
        this.impostos=impostos;
        
    }
    
    public void calcularCusto(){
        //Soma os custos de todos os componentes que compoem o Equipamento
        
    }
}
