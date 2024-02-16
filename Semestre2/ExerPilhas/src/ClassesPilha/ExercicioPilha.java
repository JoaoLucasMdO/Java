package ClassesPilha;

import java.util.ArrayList;
import java.util.List;


public class ExercicioPilha {
    
    public static boolean palindromo(String nome){
        PilhaString p = new PilhaString();
        String nome2 = "";
        
        for(int i = 0; i < nome.length(); i++){
        p.empilhar(String.valueOf(nome.charAt(i)));
        }
        
        while(!p.pilhaVazia()){
        nome2 += p.desempilhar();
        }
        if(nome.toUpperCase().equals(nome2.toUpperCase()))
             return true;
        else return false;
    }
    
    public static boolean validaBalanceamento(String expressao){
        PilhaString p = new PilhaString();
        for(int i = 0; i < expressao.length(); i++){
            
        switch(expressao.charAt(i)){
            case ('('):
                p.empilhar(")");
                break;
                
            case ('['):
                p.empilhar("]");
                break;
                
            case ('{'):
                p.empilhar("}");
                break;
                
            case(')'):
                if(p.exibirTopo().equals(String.valueOf(expressao.charAt(i)))){
                p.desempilhar();
                }else return false;
                break;
                
            case(']'):
                if(p.exibirTopo().equals(String.valueOf(expressao.charAt(i)))){
                p.desempilhar();
                }else return false;
                break;
            
            case('}'):
                if(p.exibirTopo().equals(String.valueOf(expressao.charAt(i)))){
                p.desempilhar();
                }else return false;
                break;
        } 
        }
    
        if(p.pilhaVazia()){
        return true;
        }else return false;
    }
    
    public static PilhaInteger ordenaPilha(PilhaInteger pilha){
    
    List<PilhaInteger> auxiliar = new ArrayList<PilhaInteger>();
    
    auxiliar.add(new PilhaInteger());
    boolean empilhado = false;
    PilhaInteger pilhaSaida = new PilhaInteger();
    
    
    int indice = 0;
    while(!pilha.pilhaVazia()){
        int indiceTemp = 0;
        empilhado = false;
        
        
        for(;indiceTemp < auxiliar.size();indiceTemp ++){
            
            if(auxiliar.get(indiceTemp).pilhaVazia()){
                    auxiliar.get(indiceTemp).empilhar(pilha.desempilhar());
                    empilhado = true;
                }
            
            else if(pilha.exibirTopo() >= auxiliar.get(indiceTemp).exibirTopo()){
                    auxiliar.get(indiceTemp).empilhar(pilha.desempilhar());
                    empilhado = true;
            }
        }
        if(empilhado == false){
        auxiliar.add(new PilhaInteger());
        auxiliar.get(auxiliar.size()-1).empilhar(pilha.desempilhar());
        }   
        
    }
   
    while(!auxiliar.isEmpty()){
        int temp = 0;
        int auxiliar2 = 0;
        
        for(;temp < auxiliar.size();temp++){
           if(auxiliar2 <= auxiliar.get(temp).exibirTopo()){
              auxiliar2 = auxiliar.get(temp).exibirTopo();
              indice = temp;
           }
        }
        pilhaSaida.empilhar(auxiliar.get(indice).desempilhar());
        if(auxiliar.get(indice).pilhaVazia()){
        auxiliar.remove(indice);
        }
        
    }
    return pilhaSaida;
    }
    
    public static String listarItensPilha(PilhaInteger pilha){
        
    String resposta = "";
    
    while(!pilha.pilhaVazia()){
        resposta += pilha.desempilhar().toString() + " ";
    }
    
    return resposta;
    }
}
