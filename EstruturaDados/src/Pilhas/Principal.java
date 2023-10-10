package Pilhas;

public class Principal {

    public static void main(String[] args) {
        PilhaArray pilha1 = new PilhaArray(4);
        pilha1.empilhar("A");
        pilha1.empilhar("B");
        pilha1.empilhar("C");
        pilha1.empilhar("D");
        System.out.println(pilha1.empilhar("E"));
        System.out.println(pilha1.desempilhar());
        pilha1.empilhar("X");
    }
    
}
