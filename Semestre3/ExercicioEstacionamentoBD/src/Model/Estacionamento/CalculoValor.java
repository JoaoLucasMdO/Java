
package Model.Estacionamento;

import Model.Classes.Veiculo;

public interface CalculoValor {
    
    public double calcular(long periodo, Veiculo veiculo);
    
}
