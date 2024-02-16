/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author diver
 */
public class TesteLista {
    
    public static void adicionarLista(){
        Classes.ListaLigada lista=new ListaLigada();
        lista.adicionar(1);//indice 0
        lista.adicionar(2);//indice 1
        lista.adicionar(3);//indice 2
        System.out.println(lista.exibirLista());
        
        lista.adicionar("x", 2);
        System.out.println(lista.exibirLista());
        lista.remover(1);
        System.out.println(lista.exibirLista());
    }
    
}
