package ClassesPilha;

import java.util.ArrayList;
import java.util.List;


public class PilhaString {
    private List<String> pilha = new ArrayList<String>();
    
    public void empilhar(String num){
    pilha.add(num);
    }
    
    public String desempilhar(){
    if(!pilha.isEmpty()){
    return pilha.remove(pilha.size()-1);
    }
    else return null;
    }
    
    public boolean pilhaVazia(){
    return pilha.isEmpty();
    }
    
    public String exibirTopo(){
    if(!pilha.isEmpty()){
    return pilha.get(pilha.size()-1);
    }
    else return null;
    } 
   
}
