/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoas;

    public final class Fundamental extends Alunos{
        
    public Fundamental(String nome, String genero, int idade){
    super(nome, genero, idade);
    }
    
    @Override
    public void setNota(String nota){  
    if(Float.parseFloat(nota) > 10 || Float.parseFloat(nota) < 0){
    super.nota = 0;
    }
    else{
    super.nota = Float.parseFloat(nota);
    }  
    }
    
    @Override
    public String exibirNotas(){
    if(super.nota == 10 || super.nota == 9){
    return "Nota:A";
    }
    else if(super.nota == 8 || super.nota == 7){
    return "Nota:B";
    }
    else if(super.nota == 6 || super.nota == 5){
    return "Nota:C";
    }
    else {
    return "Nota:D";
    }
 }
}
