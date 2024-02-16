/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFila;

import java.util.*;

/**
 *
 * @author Alunos
 */
public class Fila {
    //Variável fila está sendo declarada
    private List<Object> fila;
    
    public Fila(){
    //Variável fila está sendo instanciada
    fila = new ArrayList<Object>();
    }
    
    
    public void adiciona(Object item){
    fila.add(item);
    }
    
    public Object remove(){
    if(!fila.isEmpty()){
    return fila.remove(0);
    }else return "Fila vazia";
    }
    
    public Object exibirInicio(){
    
    return fila.get(0);
    }
    
    public int tamanho(){
    
    return fila.size();
    }
    
}
