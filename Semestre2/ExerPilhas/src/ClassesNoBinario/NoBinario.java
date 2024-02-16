package ClassesNoBinario;


public class NoBinario {
    //Classse Nó para a árvore binária
    private Integer info;
    private NoBinario esquerda, direita;
    
    
    public NoBinario(Integer info, NoBinario esquerda, NoBinario direita){
    this.info = info;
    this.esquerda = esquerda;
    this.direita = direita;
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
