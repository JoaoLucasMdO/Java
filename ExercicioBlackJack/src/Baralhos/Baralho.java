package Baralhos;


//package Classes_Jogo;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;



public class Baralho {
    /* Classe composta por 52 cartas distintas formadas por 4 naipes e 13 numeros*/
    
    private List<Cartas> baralho=new ArrayList<>();
    
    public String nome;
    //Atributo estático que irá armazenar a instância
    private static Baralho instance;
   
    private Baralho(){
                             
        for (Naipes naipe: Naipes.values())
        {
            for(NumerosCartas numero: NumerosCartas.values())
            {
                baralho.add(new Cartas(naipe,numero,numero.getValor())) ;
            }
        }
        Collections.shuffle(baralho);//Embaralha o baralho
    }
    
   
    public static Baralho getInstance(){
        if(instance == null)
            instance = new Baralho();
        
        return instance;
    }     

    public int getQuantidadeCartas(){
        return baralho.size();
    }
    
    public synchronized Cartas pegarCarta(){
        if(!baralho.isEmpty())
            return baralho.remove(0);
        else return null;
    }
    
    
    
}
