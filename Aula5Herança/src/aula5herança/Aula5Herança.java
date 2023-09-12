/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5herança;
import Classes.Alunos;
import Classes.Pessoa;
import Classes.Funcionarios;
/**
 *
 * @author Alunos
 */
public class Aula5Herança {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p1 = new Pessoa("Jorge", "3523523523");
        Alunos a1 = new Alunos("Maria", 35235);
        
        System.out.println(p1.getNome());
        System.out.println(a1.getNome());
    }
    
}
