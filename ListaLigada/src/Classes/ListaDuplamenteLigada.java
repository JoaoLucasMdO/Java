package Classes;

import Classes.TipoOrdenacao;

public class ListaDuplamenteLigada {
    private NoDuplo primeiroNo, ultimoNo;
    private int qtdNo;
    
    public ListaDuplamenteLigada(){
        primeiroNo=null;
        ultimoNo=null;
        qtdNo=0;
    }
    public void adicionar(Object info){
       
        NoDuplo novoNo;
        if(primeiroNo==null){
            //Estou iniciando a Lista
            novoNo = new NoDuplo(info, null, null);
            primeiroNo= ultimoNo =novoNo;
            qtdNo++;
        }
        else{
            //Adiciona o No no final da Lista
            novoNo=new NoDuplo(info, null, ultimoNo);
            ultimoNo.setProximo(novoNo);
            ultimoNo=novoNo;
            qtdNo++;
        }  
    }
    
    public void adicionar(Object info, int indice){
        // adiciona um novo Nó na posição definida pelo indice.
        // Se o indice for maior que qtdNo, adiciona o nó na ultima posição
        // Se o indice for menor que zero, não faz nada.
        NoDuplo novoNo;
        
        if(indice>=0){
            if(indice>=qtdNo){
                // Adiciona o No a ultima posição da lista
                adicionar(info);
            }
            else if(indice==0){
                /*Para adicionar o Nó na primeira posição
                O novo No precisa apontar para o primeiro Nó
                e a referencia para o primeiro Nó precisa ser atualizada
                */
                novoNo= new NoDuplo(info, primeiroNo, null);
                primeiroNo=novoNo;
                qtdNo++;
            }
            else{
                // todos os caso onde será adicionado no meio da lista
                //aux recebe ref. para o nó de índice-1
                NoDuplo aux = percorrerLista(indice-1);
                //novoNo é criado com a ref. para proximo Nó, como aux=>proximoNo.
                novoNo=new NoDuplo(info, aux.getProximo(), aux);
                //aux atualiza a ref. para o proximo nó, atribuindo o Novo Nó.
                aux.setProximo(novoNo);
                novoNo.getProximo().setAnterior(novoNo);
                qtdNo++;
            }
            
        }
        
        
        
    }
    
    public void adicionar(int valor, TipoOrdenacao tipo){
       NoDuplo aux = primeiroNo;
       int aux2 = valor;
       int indice = 0;
       boolean adicionado = false;
       
       if(primeiroNo == null){
       adicionar(valor);
       }
       else if(tipo == tipo.CRESCENTE){
          for(int i = 0; i < qtdNo; i++){
               if(aux2 <= (int)aux.getInfo()){
                   indice = i;
                   adicionado = true;
                   break;
               }
               aux = aux.getProximo();
          }
          if(adicionado == false){
          adicionar(valor);
          }else adicionar(valor, indice);
          
       }
       else if(tipo == tipo.DECRESCENTE){
           for(int i = 0; i < qtdNo; i++){
               if(aux2 >= (int)aux.getInfo()){
                   indice = i;
                   adicionado = true;
                   break;
               }
               aux = aux.getProximo();
          }
          if(adicionado == false){
          adicionar(valor);
          }else adicionar(valor, indice);
       }
   }
    public void remover(int indice){
        
        NoDuplo aux;
        if(indice==0){
            //remove da primeira posição da lista
            primeiroNo = primeiroNo.getProximo();
            primeiroNo.setAnterior(null);
            qtdNo--;
        }
        else if(indice== qtdNo-1)
        {//remove da ultima posição da lista
            aux=percorrerLista(indice-1);
            aux.setProximo(null);
            ultimoNo=aux;
            qtdNo--;
        }
        else{//remove de qualquer outra posição da lista
            aux=percorrerLista(indice-1);
            aux.setProximo(aux.getProximo().getProximo());
            aux.getProximo().setAnterior(aux);
            qtdNo--;
        }
        
        
    }
    public String exibirLista(){
        // Percorre toda a lista retornando uma string com o Info de todos os Nós
        String retorno="Lista: ";
        NoDuplo aux = primeiroNo;
        while(aux.getProximo()!=null){
            //Concatena as informações dos Nós
            retorno+= aux.getInfo()+" ";
            // Percorre a Lista
            aux=aux.getProximo();
        }      
        retorno+=aux.getInfo();
        return retorno;
    }
    public String getLista(int indice){
        return percorrerLista(indice).getInfo().toString();
    }
    
    private NoDuplo percorrerLista(int indice){
        /*Modificar futuramente --> Adicionar o recurso para 
        percorrer a lista reversamente caso o indice for maior 
        que a metade da lista*/
        if(indice>=0 && indice < qtdNo){            
            NoDuplo aux=primeiroNo;
            
            for(int i=0;i<indice;i++){
                aux=aux.getProximo();
            }                     
            return aux;
        }
        else{        
            return null;
        }
    }
            
    
}
