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
    lista.adicionar(1);
    lista.adicionar(2);
    lista.adicionar(3);
    lista.adicionar(5);
    lista.adicionar(4, 3);
    lista.adicionar("x", 0);
    lista.adicionar("p", 150);
    lista.adicionar("A", 3);
    
    lista.remover(2);
    
    System.out.println(lista.exibirLista() + " Qtd: " + lista.getQtd());
    }
}
