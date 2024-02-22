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
        if(topo == 0)
            return true;
        else 
            return false;   
    }   

    public Object verificaTopo() {
        return pilha[topo-1];
    }

    public Object desempilha() {
        topo--;
       return pilha[topo]; 
    }

    public boolean cheia() {
      if(topo == 10)
          return true;
      else
          return false;
    }
    
   
}
