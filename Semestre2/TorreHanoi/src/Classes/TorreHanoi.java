package Classes;


public class TorreHanoi {
    
    public void resolverTorreHanoi(int discos, String origem, String auxiliar, String destino) {
        if (discos == 1) {
            System.out.println("Mover Disco 1 de " + origem + " para " + destino);
            return;
        }
        resolverTorreHanoi(discos - 1, origem, destino, auxiliar);
        System.out.println("Mover Disco " + discos + " de " + origem + " para " + destino);
        resolverTorreHanoi(discos - 1, auxiliar, origem, destino);
    }
}
