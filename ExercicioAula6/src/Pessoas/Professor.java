/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pessoas;


public final class Professor extends Funcionarios implements SalaVirtual{
    private float salarioHora;
    private float qtdHoras;
    
    public Professor(String nome, String genero, int idade, float salarioBase, float salarioHora){
    super(nome, genero, idade, salarioBase);
    this.salarioHora = salarioHora;
}
    
    @Override
    public double calculaSalario(){
    return super.getSalarioBase() + (salarioHora * qtdHoras);
    }
    
    @Override
    public String getNome(){
    if(super.getGenero().equals("Masculino")){
     return "Professor " + super.nome;
    }
    else{
    return "Professora " + super.nome;
    }   
    }
    
    @Override
    public String login(){
    
        
        return "Conectado na Sala Virtual!";
    }
    @Override
    public String logout(){
    
        return "Desconectado da Sala Virtual!";
    }
    
}
