package Pessoas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public abstract class Pessoa {
protected String nome; 
private String genero;
private int idade;

public Pessoa(String nome, String genero, int idade){
this.nome = nome;
this.genero = genero;
this.idade = idade;
}

public abstract String getNome();

public String getGenero(){ 
return genero; 
}

public int getIdade(){ 
return idade; 
}
    
}
