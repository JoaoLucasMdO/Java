package ClassesNoBinario;

public class ArvoreBinaria {
    //Atributos
    NoBinario raiz;
    int profundidade = -1;
    
    public ArvoreBinaria(Integer info){
        raiz = new NoBinario(info, null, null);
    }
    //Método para adicionar de forma ordenada valores inteiros na árvore
    
    public void adicionarOrdenado(Integer valor){
    //Se o valor for maior que info, adiciona no Nó na direita
    //Se o valor for menor ou igual que info, adiciona o Nó na esquerda
    adicionarFilhos(raiz, valor);
  }
    private void adicionarFilhos(NoBinario No, Integer valor){
        
    if(valor > No.getInfo()){
        if(No.getDireita() == null){//Adiciona o valor nessa posição
            No.setDireita(new NoBinario(valor, null, null));
        }
        else{
        //Se o Nó filho da raiz não é nula, passamos o Nó filho como referência
        adicionarFilhos(No.getDireita(), valor);
        
        }
    }
    else{
        if(No.getEsquerda()== null){//Adiciona o valor nessa posição
            No.setEsquerda(new NoBinario(valor, null, null));
        }
        else{
        adicionarFilhos(No.getEsquerda(), valor);
        }
    }
  }  
  
  public Integer procuraFilho(Integer valor){
  
      return buscaFilho(raiz, valor);
  }
  
  private Integer buscaFilho(NoBinario no, Integer valor){
    this.profundidade ++;
    
    if(no.getInfo().equals(valor)){
    return this.profundidade;
    }
    else {
        if(no.getDireita() == null && no.getEsquerda() == null){
        return -1;
        }
        else if(no.getInfo() < valor){
        buscaFilho(no.getDireita(), valor);
        }else{
        buscaFilho(no.getEsquerda(), valor);
        }
    return this.profundidade;}
  }
}
