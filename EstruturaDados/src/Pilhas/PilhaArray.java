package Pilhas;


public class PilhaArray {
    private Object[] pilha;
    private int topo = 0;
    
    public PilhaArray(int tamanho){
    pilha = new Object[tamanho];
    }
    
    public boolean empilhar(Object item){
    if(topo < pilha.length){
    this.pilha[topo] = item;
    topo ++;
    return true;
    }
    else{
    return false;
    }
    
    }
    
    public Object desempilhar(){
    if(topo > 0){
    topo--;    
    return pilha[topo];
    }
    else{
    return null;
    }
    }
    
    public boolean pilhaVazia(){
    if(topo == 0) return true;
    else return false;
    }
    
    public boolean pilhaCheia(){
    if(topo == pilha.length-1) return true;
    else return false;
    }
    
}
