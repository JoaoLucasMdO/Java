
package Classes;


public class FormatoIdInvalido extends Exception {
    
    String valor;
    public FormatoIdInvalido(String message, String valor){
        super(message);
        this.valor=valor;
    }
    public String getValor(){
        return  valor;
    }
}
