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
public class Aula2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //News
    Pessoa joseneide = new Pessoa("Joseneide", 0);
    Pessoa edinei = new Pessoa("Edinei", 0);
    Pessoa joao = new Pessoa("Jo�o", 19, joseneide, edinei);
    Pessoa mauricio = new Pessoa("Mauriocio", 12, joao, joao);
    Pessoa maria= new Pessoa("Maria", 12, joao, joao);
    Pessoa ronaldo = new Pessoa("Ronaldo", 12, joao, joao);
    
    //Arvore
    Pessoa[] arvore = new Pessoa[10];
    
    //Av�s
    arvore[0] = new Pessoa("Jos�");
    arvore[1] = new Pessoa("Maria");
    
    //Pais
    arvore[2] = new Pessoa("Mauiricio", 80);
    arvore[3] = new Pessoa("Creusa", 76);
    
    //Eu
    arvore[4] = new Pessoa("J�o", 19, arvore[3]);
    
    //Meu irm�o
    arvore[5] = new Pessoa("jhonatan", 21, arvore[3]);
  
     
    //Adds Filhos
    joao.setFilho(mauricio);
    joao.setFilho(maria);
    joao.setFilho(ronaldo);
    
    //Adds Irmaos
    joao.setIrmaos(mauricio);
    joao.setIrmaos(maria);
    joao.setIrmaos(ronaldo);
    
    /*
    System.out.println("Nome: " +joao.getNomePessoa() + "| Idade: " + joao.getIdadePessoa() + "| Mãe: " + 
    joao.getMaeNome() + "| Pai: " + joao.getPaiNome() + "\nFilhos: " + 
    joao.getNomeFilhos() + "| Qtd: " + joao.qtdFilhos() + "\n" + "Irmãos: " + joao.getNomeIrmaos() + "| Qtd: " + joao.qtdIrmaos());    
    }*/
    
        System.out.println(arvore[4].getNomePessoa() + "=> Mae: " + arvore[4].getMaeNome());
}
}