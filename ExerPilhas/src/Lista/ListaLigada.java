/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista;

/**
 *
 * @author Alunos
 */
public class ListaLigada {
    private No primeiroNo, ultimoNo;
    private int qtdNo;
    
    public enum TipoOrdenacao {
    CRESCENTE,DECRESCENTE;
    }
    
    public ListaLigada(){
    primeiroNo = null;
    ultimoNo = null;
    qtdNo = 0;
    }
    
    public void adicionar(Object info){
        No novoNo; 
        if(primeiroNo == null){
        //Estou iniciando a Lista
        novoNo = new No(info, null);
        primeiroNo = ultimoNo = novoNo;
        qtdNo++;}else {
            //Adiciona o No no final da lista
            novoNo = new No(info, null);
            ultimoNo.setProximoNo(novoNo);
            ultimoNo = novoNo;     
            qtdNo++;
            }
    }
    
   void adicionar(Object info, int indice){
    // adiciona um novo Nó na posição definida pelo indice.
    // Se o indice for maior qtdNo, adiciona o nó na ultima posição.
    // Se o indice for menor que zero, não faz nada.
    No novoNo;
    if(indice>=0){
        if(indice >= qtdNo){
        //Adiciona o No na ultima posição da lista
        adicionar(info);
        
        }else if(indice == 0){
        /*Para adicionar o Nó na primeira posição
          O novo Nó precisa apontar para o primeiro Nó e
          a referência para o primeiro precisa ser atualizada
        */ 
        novoNo = new No(info, primeiroNo);
        primeiroNo = novoNo;
        qtdNo++;
        }else{
        // Todos os casos onde será adicionado no meio da lista
        // aux recebe ref. para o nó de indice-1
        No aux = percorrerLista(indice-1);
        // novoNo é criado com a ref. para proximo Nó, como aux => proximoNo.
        novoNo = new No(info,aux.getProximoNo());
        // aux atualiza a ref. para o próximo nó, atribuindo o NovoNo.
        aux.setProximoNo(novoNo);
        qtdNo++;
        }   
    }
    }
   
   public void adicionar(int valor, TipoOrdenacao tipo){
       No aux = primeiroNo;
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
               aux = aux.getProximoNo();
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
               aux = aux.getProximoNo();
          }
          if(adicionado == false){
          adicionar(valor);
          }else adicionar(valor, indice);
       }
   }
    
   public void remover(int indice){
       No aux;
       if(indice == 0){
       //Remove da primeira posição da lista.
       primeiroNo = primeiroNo.getProximoNo();
       qtdNo--;
       }
       else if(indice == qtdNo-1){
       //Remove da última posição da lista.
       aux = percorrerLista(indice-1);
       aux.setProximoNo(null);
       ultimoNo = aux;
       qtdNo--;
       }else{
       //Remove de qualquer outra posição da lista.
       aux = percorrerLista(indice-1);
       aux.setProximoNo(aux.getProximoNo().getProximoNo());
       qtdNo--;
       }
   }
   
   
   
   public String exibirLista(){
   //Percorre toda a lista retornando um string com o info de todos os nós
   String mensagem = "Lista: ";
   No aux = primeiroNo;
   
   while(aux.getProximoNo() != null){
   mensagem += aux.getInfo() + " ";
   // Percorre a lista
   aux = aux.getProximoNo();
   }
   mensagem += aux.getInfo();
   return mensagem;
   }
   
    public String getLista(int indice){
    return percorrerLista(indice).getInfo().toString();
    }
    
    
    private No percorrerLista(int indice){
    if(indice >= 0 && indice < qtdNo){
        No aux = primeiroNo;
        for(int i = 0; i < indice; i++){
            aux = aux.getProximoNo();
        } 
    return aux;
    }else  return null;
    }
    
    public int getLista2(Object item){
    int indice = 0;
    boolean encontrado = false;
    No aux = primeiroNo;
        for(int i = 0; i < qtdNo; i++){
               if(item == aux.getInfo()){
                     indice = i;  
                     encontrado = true;
               }
               aux = aux.getProximoNo();
          }
    if(encontrado == false){
        return -1;
    }else return indice;
    }
    
    
    public boolean remover2(Object item){
    if(getLista2(item) != -1){
    remover(getLista2(item));
    return true;
    }else return false;
    }
    
    public void concatenar(ListaLigada lista){
    No aux = lista.primeiroNo;
    
    for(int i = 0; i < lista.qtdNo; i++){
    adicionar(aux.getInfo());
    aux = aux.getProximoNo();
    }
    lista.primeiroNo = null;
    lista.ultimoNo = null;
    }
    
    public int getQtd(){
    return this.qtdNo;
    }
    
    public ListaLigada copiar(){
    ListaLigada listaNova = new ListaLigada();
    
    for(int i = 0; i < qtdNo; i++){
    listaNova.adicionar(getLista(i));
    
    }    
        
    return listaNova;
    }
}
