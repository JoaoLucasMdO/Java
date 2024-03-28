package Classes;


public class CalculoDiaria implements CalculoValor{
    private double valorDiaria;
    
    public CalculoDiaria(double valorDiaria){
    this.valorDiaria = valorDiaria;
    }
    
    @Override
    public double calcular(double periodo, Veiculo veiculo){
    
    return valorDiaria * Math.ceil(periodo / hora);
    }
}
