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
public class Alunos extends Pessoa{
    int ra;
    Pessoa responsavel;
    double mediaFinal;
            
    public Alunos(String nome){
    super(nome);
    }
    
    public Alunos(String nome, int ra){
       this(nome);
       this.ra = ra;
    }
    
    public Alunos(String nome, int ra, double mediaFinal){
        this(nome,ra);
        this.mediaFinal = mediaFinal;
    }
    
    public String getNome(){
        return "Sra." + super.getNome();
    }
    
    public String toString(){
        return "Meu nome é " + super.getNome();
    }
    
    
    
       
}
