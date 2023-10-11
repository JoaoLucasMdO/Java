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
public class TesteLista {
    
    public static void adicionarLista(){
    Lista.ListaLigada lista = new ListaLigada();
    
    lista.adicionar(3, ListaLigada.TipoOrdenacao.CRESCENTE);
    lista.adicionar(6, ListaLigada.TipoOrdenacao.CRESCENTE);
    lista.adicionar(7, ListaLigada.TipoOrdenacao.CRESCENTE);
    lista.adicionar(22, ListaLigada.TipoOrdenacao.CRESCENTE);
    lista.adicionar(11, ListaLigada.TipoOrdenacao.CRESCENTE);
    /*
    lista.adicionar("x", 0);
    lista.adicionar("p", 150);
    lista.adicionar("A", 3);*/
   
    
    
    System.out.println(lista.exibirLista() + " Qtd: " + lista.getQtd());
    lista.getLista2(7);
    System.out.println("Item 7 está na posição de indice: " + lista.getLista2(7));
    lista.remover2(7);
    System.out.println(lista.exibirLista() + " Qtd: " + lista.getQtd());
    
    
    Lista.ListaLigada lista2 = new ListaLigada();
    lista2.adicionar(3, ListaLigada.TipoOrdenacao.DECRESCENTE);
    lista2.adicionar(6, ListaLigada.TipoOrdenacao.DECRESCENTE);
    lista2.adicionar(7, ListaLigada.TipoOrdenacao.DECRESCENTE);
    lista2.adicionar(22, ListaLigada.TipoOrdenacao.DECRESCENTE);
    lista2.adicionar(11, ListaLigada.TipoOrdenacao.DECRESCENTE);
    lista.concatenar(lista2);
    System.out.println(lista.exibirLista());
    
        lista.copiar();
    }
}
