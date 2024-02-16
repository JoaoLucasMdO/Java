/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula_1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diver
 */
public class Aula_1 {

    /* ****** EXERCÍCIO *******
    1. Aplique os conceitos de encapsulamento na classe “Pessoa” criada na aula anterior, modificando a visibilidade de todos as variáveis para privado.

    2. Modifique o acesso aos atributos da classe “Pessoa” adicionado métodos Getters e Setters para todas as variáveis.

    3. Crie três construtores que irão receber respectivamente as seguintes variáveis:
        (String nome);
        (String nome, Pessoa mae);
        (String nome, Pessoa mae, Pessoa pai);
        Deverão ser utilizados os conceitos de sobre-carga de construtores (overload).

    4. Modifique a classe principal para utilizar os métodos getters e setters e implemente os métodos necessários para responder as perguntas?
	Quantos filhos o objeto pessoa possui ?
	Qual o nome desses filhos ?
	Quantos irmãos o objeto pessoa possui ?
	Qual o nome desses irmãos ? 

    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //List<Pessoa> arvoreG = new ArrayList<>();
        Pessoa[] arvore = new Pessoa[10];
        //Avos
        arvore[0]= new Pessoa("José");
        arvore[1] = new Pessoa("Maria");
        // Pais
        arvore[2]= new Pessoa("Mauricio",80);
        arvore[3]= new Pessoa("Creusa",75);
        // Eu 
        arvore[4]=new Pessoa("Rodrigo",36,arvore[3]);
        // Meu irmão
        arvore[5] = new Pessoa("William",48,arvore[3]);
        // Outro irmão
        arvore[6] = new Pessoa("José",32,arvore[3]);
        // Mais um irmão
         arvore[7] = new Pessoa("Roger",26,arvore[3]);
        
         
         
         
        System.out.println(arvore[4].getNome() + " => Irmaos: " + arvore[4].nomeIrmaos());
        System.out.println(arvore[5].getNome() + " => Irmaos: " + arvore[5].nomeIrmaos());
        System.out.println(arvore[6].getNome() + " => Irmaos: " + arvore[6].nomeIrmaos());
        System.out.println(arvore[7].getNome() + " => Irmaos: " + arvore[7].nomeIrmaos());
        System.out.println("Mae: " + arvore[4].getMae().getNome() + "\n" + arvore[3].nomeFilhos());
        
        /* ========= Atividade a ser desenvolvida ==========
            4. Modifique a classe principal para utilizar os métodos getters e setters e implemente os métodos necessários para responder as perguntas?
                Quantos filhos o objeto pessoa possui ?
                Qual o nome desses filhos ?
                Quantos irmãos o objeto pessoa possui ?
                Qual o nome desses irmãos ? 
        */
    }   
    
}
