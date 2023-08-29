/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diver
 */
public class Pessoa {
    
    //Variáveis
    private String nome;
    private int idade;
    private Pessoa mae, pai;
    private List<Pessoa> filhos = new ArrayList<>();
    private List<Pessoa> irmaos = new ArrayList<>();
    
    //***** construtores ******
    public Pessoa(String nome){
        this.nome=nome;
    }    
    public Pessoa(String nome, int idade) {
        this(nome);
        this.idade=idade;
    }
    public Pessoa(String nome, int idade, Pessoa mae){
        this(nome,idade);
        this.mae=mae;
        setMaternidade(mae);
        setIrmaos(mae);
    }
    //************
    
    //**** Setters ****
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setMae(Pessoa mae){
        this.mae=mae;
    }
    public void setPai(Pessoa pai){
        this.pai= pai;
    }
    //*******************************
    
    //****** Getters *************
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public Pessoa getMae(){
        return this.mae;
    }
    public Pessoa getPai(){
        return this.pai;
    }
    //*********************
    
    // **** Métodos de interface *******
    public String nomeFilhos(){
        String mensagem="Meus filhos sao ";
        int i;
        for( i=0;i<filhos.size();i++)
        {
            mensagem +=filhos.get(i).nome;
            if (i < filhos.size()-1){
                mensagem+=", ";
            }
        }
        
        return mensagem;
    }
    public int qtdFilhos(){
       return this.filhos.size();
    }
    
    public String nomeIrmaos(){
        String mensagem="Meus irmaos sao ";
        int i;
        for( i=0;i<irmaos.size();i++)
        {
            mensagem +=irmaos.get(i).nome;
            if(i<irmaos.size()-1){
                mensagem+=", ";
            }
                
        }
        
        return mensagem;
    }
    
    
    public int qtdIrmaos(){
       return this.irmaos.size();
    }
    
    // ***************************************
    
    // ***** Métodos Internos ***********
      public void setMaternidade(Pessoa mae){
        this.mae = mae;
        mae.addFilho(this);
               
    }
      public void addFilho(Pessoa filho){
          filhos.add(filho);
      }
      public void setIrmaos(Pessoa mae){
          this.mae = mae;
          this.addIrmao(mae.filhos);
          
      }
      public void addIrmao(List<Pessoa> irmaos){  
        for(int i=0; i < irmaos.size();i++){
            if(this != irmaos.get(i)){
            this.irmaos.add(irmaos.get(i));
            irmaos.get(i).irmaos.add(this);
            }
            } 
      }
     
    // ***********************************
}
