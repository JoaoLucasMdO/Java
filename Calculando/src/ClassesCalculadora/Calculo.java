package ClassesCalculadora;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class Calculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calc1 = new Calculadora();
        calc1.div(10, 5);
        System.out.println(calc1.getResultadoString());
        calc1.mult(10, 5);
        System.out.println(calc1.convertDectoBin(8));
        System.out.println(calc1.getResultadoString());
        System.out.println(calc1.convertBintoDec("101010"));
        System.out.println(calc1.getResultadoString());
    }
    
}
