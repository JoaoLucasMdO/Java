package ClassesNoBinario;

public class ArvoreBinaria {
    //Atributos
    NoBinario raiz;
    
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
    
}
