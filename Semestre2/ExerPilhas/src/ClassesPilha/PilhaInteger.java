package ClassesPilha;

import java.util.ArrayList;
import java.util.List;


public class PilhaInteger {
    private List<Integer> pilha = new ArrayList<Integer>();
    
    public void empilhar(Integer num){
    pilha.add(num);
    }
    
    public Integer desempilhar(){
    if(!pilha.isEmpty()){
    return pilha.remove(pilha.size()-1);
    }
    else return null;
    }
    
    public boolean pilhaVazia(){
    return pilha.isEmpty();
    }
    
    public Integer exibirTopo(){
    if(!pilha.isEmpty()){
    return pilha.get(pilha.size()-1);
    }
    else return null;
    }
    
}
    

