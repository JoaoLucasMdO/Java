package Pilha;

public class Pilha {
    Object[] pilha;
    int topo = 0;
    public boolean cheia;
    
    public Pilha(int tamanho){
    pilha = new Object[tamanho];
    }

    public void empilha(Object elemento) {
        pilha[topo] = elemento;
        topo ++;
    }

    public boolean vazia() {
        return(topo == 0);    
    }   

    public Object verificaTopo() {
        return pilha[topo-1];
    }

    public Object desempilha() {
        topo--;
       return pilha[topo]; 
    }

    public boolean cheia() {
      return(topo == 10);
    }
    
   
}
