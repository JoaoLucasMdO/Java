package Pilhas;


public class Pilhas implements InterfacePilhas {
    @Override
    public void empilhar(Object item){
    pilha.add(item);
    }
    
    @Override
    public Object desempilhar(){
    if(!pilha.isEmpty()){
        return pilha.remove(pilha.size()-1);
    }
    else
        return null;
    }
    
    public boolean pilhaVazia(){
    return pilha.isEmpty();
    }
    
    
}
