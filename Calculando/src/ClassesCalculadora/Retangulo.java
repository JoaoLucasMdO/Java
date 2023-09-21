package ClassesCalculadora;



public class Retangulo {
private double lado1;
private double lado2;
private double lados;
private double area;
private double perimetro;
private String mensagem;    
    
    
public Retangulo(double lados){
this.setLado(lados);
this.mensagem = "Quadrado";
} 

public Retangulo(double lado1, double lado2){

this.mensagem = "Retangulo";    
} 

private double area(){
this.area = this.lado1 * this.lado2;
    
return this.area;
}

private double perimetro(){
this.perimetro = 
        
return this.perimetro;
}

public void setLado(double lados){
if(){

}

    
this.lado1 = lados;
}

public double getLado(){

return this.lado;
}

public double getArea(){

return this.area();
}

public double getPerimetro(){

return this.perimetro();
}

public String getQouR(){

return this.mensagem;
}

}
