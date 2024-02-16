/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesFila;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class FilaPref {
     private List<Object> fila;
    
    public FilaPref(){
    //Variável fila está sendo instanciada
    fila = new ArrayList<Object>();
    }
    
    
    public void adiciona(Object item){
        boolean foiAdic = false;
        if(fila.isEmpty()){
        fila.add(item);
        }
        else{
        for(int i = 0; i < fila.size(); i++){
            if(Integer.parseInt(fila.get(i).toString()) > Integer.parseInt(item.toString())){   
            fila.add(i,item);
            foiAdic = true;
            break;
             }
            }
        if(foiAdic == false){
        fila.add(item);
        }
        }
        
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
