/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

/**
 *
 * @author Alunos
 */
public class Aula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String msg, msg2;
        Pessoa joao = new Pessoa("Joao", 19);
        Pessoa joseneide = new Pessoa("Joseneide", 46);
        Pessoa ney;
        ney = new Pessoa("Ney", 51);
        
        //Filhos
        Pessoa leonardo, maria, pedro;
        leonardo = new Pessoa("Leonardo", 3);
        maria = new Pessoa("maria", 3);
        pedro = new Pessoa("pedro", 3);
        
        
        joao.mae = joseneide;
        joao.pai = ney;
        joao.filhos.add(leonardo);
        joao.filhos.add(maria);
        joao.filhos.add(pedro);
        
        msg = joao.mae.nome + " é mãe do " + joao.nome + " e " + joao.pai.nome + " é o pai";
        
        msg2 = "Joao tem " + joao.filhos.size() + " filhos" + "\n" + joao.nomeFilhos();
    
        System.out.println(msg + "\n" + msg2);
        
    }
    
}
