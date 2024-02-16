package ClassesNoLista;

import java.util.ArrayList;
import java.util.List;


public class NoLista {
    private Integer info;
    private List<NoLista> esquerda, direita;
    
    
    public NoLista(Integer info){
    this.info = info;
    esquerda = new ArrayList<NoLista>();
    direita = new ArrayList<NoLista>();
    }
    
    //Métodos Getters e Setters

    public void setInfo(Integer info) {
        this.info = info;
    }

    public void setEsquerda(NoBinario esquerda) {
        this.esquerda = esquerda;
    }

    public void setDireita(NoBinario direita) {
        this.direita = direita;
    }
    
    public Integer getInfo() {
        return info;
    }

    public NoBinario getEsquerda() {
        return esquerda;
    }

    public NoBinario getDireita() {
        return direita;
    }
    
}
