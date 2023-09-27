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
        
        Triangulo tri1 = new Triangulo(10,20);
        System.out.println(tri1.getTipo());
        Triangulo tri2 = new Triangulo(10,10,35);
        System.out.println(tri2.getTipo());
        Triangulo tri3 = new Triangulo(10,20,90);
        System.out.println(tri3.getTipo());
        Triangulo tri4 = new Triangulo(10,20,80);
        System.out.println(tri4.getTipo());
        
        /*
        Retangulo quad1 = new Retangulo(3,3);
        System.out.println(quad1.getArea());
        System.out.println(quad1.getPerimetro());
        System.out.println(quad1.getQouR());
        
        Retangulo ret1 = new Retangulo(3,2);
        System.out.println(ret1.getArea());
        System.out.println(ret1.getPerimetro());
        System.out.println(ret1.getQouR());
        
        Retangulo quad2 = new Retangulo(3);
        System.out.println(quad2.getArea());
        System.out.println(quad2.getPerimetro());
        System.out.println(quad2.getQouR());
        */
        
        /*Calculadora calc1 = new Calculadora();
        calc1.div(10, 5);
        System.out.println(calc1.getResultadoString());
        calc1.mult(10, 5);
        System.out.println(calc1.getResultadoString());
        calc1.soma(10, 5);
        System.out.println(calc1.getResultadoString());
        calc1.sub(10, 5);
        System.out.println(calc1.getResultadoString());
        
        System.out.println(calc1.convertDectoBin(8));
        System.out.println(calc1.getResultadoString());
        System.out.println(calc1.convertBintoDec("101010"));
        System.out.println(calc1.getResultadoString());*/
        
        
    }
    
}
