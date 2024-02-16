
package Classes;

import java.io.Serializable;

public enum EnumServicos implements Serializable{
    
    TORNO(100), FRESA(80), FURADEIRA(50), MANDRILHADORA(120), MONTAGEM(80),POLIMENTO(80), PINTURA(60);
    
    private final float valor;    
    EnumServicos(float valor){
       this.valor=valor;
    }
    public float getValor(){
        return valor;
    }
}
