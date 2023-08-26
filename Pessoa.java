/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class Pessoa{
    
    private String nome;
    private int idade;
    private Pessoa mae, pai;
    private String NomeMae, NomePai;
    
    
    private List<Pessoa> filhos = new ArrayList<>();
    private List<Pessoa> irmaos = new ArrayList<>();
    
    
    //Construtores
    
    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public Pessoa(String nome, int idade) {
        this(nome);
        this.idade = idade;
    }
    
    public Pessoa(String nome,int idade, Pessoa mae) {
        this(nome,idade);
        this.mae = mae;
        this.NomeMae = mae.nome;
    }
    
    public Pessoa(String nome,int idade, Pessoa mae, Pessoa pai) {
        this(nome,idade,mae);
        this.pai = pai;
        this.NomeMae = mae.nome;
        this.NomePai = pai.nome;
    }
    
    
    
    //Setter
    public void setPessoa(String nome, int idade, Pessoa mae, Pessoa pai) {
        this.nome = nome;
        this.idade = idade;
        this.mae = mae;
        this.pai = pai;     
    }
    
    public void setFilho(Pessoa filho){
        this.filhos.add(filho);
    }
    
    public void setIrmaos(Pessoa irmaos){
        this.irmaos.add(irmaos);
    }
    
    //Gets
    public String getNomePessoa(){
        return this.nome;               
    }
    
     public int getIdadePessoa(){
        return this.idade;           
    }
    
     public Pessoa getMaePessoa(){
        return this.mae;               
    }
    
     public Pessoa getPaiPessoa(){
        return this.pai;               
    }
     
    public String getMaeNome(){
        return this.NomeMae;               
    }
    
    public String getPaiNome(){
        return this.NomePai;               
    }
    
    public int qtdFilhos(){
        return this.filhos.size();
    }
    
    public int qtdIrmaos(){
        return this.irmaos.size();
    }
    
    public String getNomeFilhos(){
        String mensagem = "";
        
        for(int i = 0; i < filhos.size(); i++)
        {
        if( i == filhos.size()-1){
            mensagem += filhos.get(i).nome;
        }
        else{
        mensagem += filhos.get(i).nome + ", ";
        }  
    }
        return mensagem;
    
}
    public String getNomeIrmaos(){
        String mensagem = "";
        
        for(int i = 0; i < irmaos.size(); i++)
        {
        if( i == irmaos.size()-1){
            mensagem += irmaos.get(i).nome;
        }
        else{
        mensagem += irmaos.get(i).nome + ", ";
        }  
    }
        return mensagem;
    }
}
