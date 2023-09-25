package ClassesCalculadora;
import java.lang.Math;
enum TiposTriangulos{TRIANGULO_RETANGULO, TRIANGULO_OBTUSANGULO, TRIANGULO_ACUTANGULO};

public class Triangulo {
    public TiposTriangulos tipo;
    private double angulo;
    private double base;
    private double altura;
    private double segmentoAB;
    private double segmentoAC;
    private double area;
    private double perimetro;
    private String mensagem = "";
    
    public Triangulo(double base, double altura){
    this.base = base;
    this.altura = altura;
    this.angulo = 90;
    tipo = TiposTriangulos.TRIANGULO_RETANGULO;
    }
    
    public Triangulo(double segmentoAB, double segmentoAC, double angulo){
    this.segmentoAB = segmentoAB;
    this.segmentoAC = segmentoAC;
    if(angulo > 90){
    this.angulo = 90;
    }
    else if(angulo <= 0){
    this.angulo = 90;
    }
    else{
    this.angulo = angulo;
    }
    if(angulo == 90){
    tipo = TiposTriangulos.TRIANGULO_RETANGULO;
    }
    else if(angulo > 90){
    tipo = TiposTriangulos.TRIANGULO_OBTUSANGULO;
    }
    else{
    tipo = TiposTriangulos.TRIANGULO_ACUTANGULO;
    }
    }
    
    private double area(){
    if(this.base != 0 && this.altura != 0 ){ 
        this.area = (this.base * this.altura)/2;
    }
    else{
        this.area = (this.segmentoAB * this.segmentoAC * Math.sin(this.angulo))/2;
    }             
    return area;
    }
    
    private double perimetro(){
    double hipo;
    if(this.base != 0 && this.altura !=0){
    hipo = Math.sqrt((this.base * this.base) + (this.altura * this.angulo));
    this.perimetro = hipo + this.altura + this.base;   
    }
    else{
        if(tipo == tipo.TRIANGULO_RETANGULO){
        hipo = Math.sqrt((this.segmentoAB * this.segmentoAB) + (this.segmentoAC * this.segmentoAC));
        this.perimetro = hipo + this.segmentoAB + this.segmentoAC;
        }
        else{
        hipo = Math.sqrt((this.segmentoAB * this.segmentoAB) + (this.segmentoAC * this.segmentoAC) - 2 * (10 * 12) * Math.cos(this.angulo));
        this.perimetro = hipo + this.segmentoAB + this.segmentoAC;
        }
    }
    return perimetro;
    }
   
    
    public String getTipo(){
    if(tipo == tipo.TRIANGULO_RETANGULO){
        if(this.base != 0 && this.altura !=0){
        mensagem += "A área do triângulo retangulo de base " + this.base + " e altura de " + this.altura + " é de " + this.area() + " com perimetro de " + this.perimetro();
        }
        else{
        mensagem += "A área do triângulo retangulo de lado A = " + this.segmentoAB + " e lado B = " + this.segmentoAC + " e angulo AB = " + this.angulo + " é de " + this.area() + " com perimetro de " + this.perimetro();
        }
    }
    else if(tipo == tipo.TRIANGULO_OBTUSANGULO){
    mensagem += "A área do triângulo obtuso de lado A = " + this.segmentoAB + " e lado B = " + this.segmentoAC + " e angulo AB = " + this.angulo + " é de " + this.area() + " com perimetro de " + this.perimetro();
    } 
    else{
    mensagem += "A área do triângulo acutangulo de lado A = " + this.segmentoAB + " e lado B = " + this.segmentoAC + " e angulo AB = " + this.angulo + " é de " + this.area() + " com perimetro de " + this.perimetro();
    }    
        
    return mensagem;
    }
    
    
}
