/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoas;

/**
 *
 * @author Alunos
 */
public final class Administrativo extends Funcionarios{

public Administrativo(String nome, String genero, int idade, float salarioBase){
super(nome, genero, idade, salarioBase);
}
   
public double calculaSalario(){
return super.getSalarioBase();
    }
    
}
