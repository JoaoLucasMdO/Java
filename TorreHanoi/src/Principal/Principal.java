package Principal;
import Classes.*;

public class Principal {


    public static void main(String[] args) {
        
        Fatorial f = new Fatorial();
        Fatorial f2 = new Fatorial();
        System.out.println(f.FatorialRecursivo(5));
        System.out.println(f2.FatorialInterativo(5));
        
        TorreHanoi torre1 = new TorreHanoi();
        torre1.resolverTorreHanoi(4, "origem", "auxiliar", "destino");
        
    }
    
}
