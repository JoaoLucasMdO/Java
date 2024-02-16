/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Alunos
 */
public class Pessoa {
private String nome;
private String cpf;
private String telefone;
private String endereco;


public Pessoa(String nome){
this.setNome(nome);
}

public Pessoa(String nome, String cpf){
this(nome);
this.setCpf(cpf);
}
public Pessoa(String nome, String cpf, String telefone){
this(nome, cpf);
this.setTelefone(telefone);
}
public Pessoa(String nome, String cpf, String telefone, String endereco){
this(nome, cpf, telefone);
this.setEndereco(endereco);
}

public void setNome(String nome){
this.nome = nome;
}

public String getNome(){
return this.nome;
}

public void setCpf(String cpf){
this.cpf = cpf;
}

public String getCpf(){
return this.cpf;
}

public void setTelefone(String telefone){
this.telefone = telefone;
}

public String getTelefone(){
return this.telefone;
}

public void setEndereco(String endereco){
this.endereco = endereco;
}

public String getEndereco(){
return this.endereco;
}


}
