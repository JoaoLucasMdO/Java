package ClassesCalculadora;
enum FormasGeometricas{QUADRADO, RETANGULO};


public class Retangulo {
public FormasGeometricas tipo;
private double lado1;
private double lado2;
private double lados;
private double area;
private double perimetro;
private String mensagem;    

    
public Retangulo(double lados){
setLado(lados);
setLado(lados);
tipo = FormasGeometricas.QUADRADO;
} 

public Retangulo(double lado1, double lado2){
setLado(lado1);
setLado(lado2);  
tipo = FormasGeometricas.RETANGULO;
} 

private double area(){
this.area = this.lado1 * this.lado2;  
return this.area;
}

private double perimetro(){
if(this.lado1 == this.lado2){
this.perimetro = this.lado1 + this.lado1 + this.lado1 + this.lado1;
}

else{
    
this.perimetro = 2*(this.lado1 + this.lado2);     

}
return this.perimetro;
}

public void setLado(double lados){
if(this.lado1 == 0){
this.lado1 = lados; 
}
else if(this.lado2 == 0){     
this.lado2 = lados;
}
if(this.lado1 == this.lado2){
this.mensagem = "Quadrado";  
}

else{
this.mensagem = "Retangulo";  
}

this.lados = this.lado1 + this.lado2;
}

public double getLado(){

return this.lados;
}

public double getArea(){

return this.area();
}

public double getPerimetro(){

return this.perimetro();
}

public String getQouR(){
if(this.lado1 == this.lado2){
this.mensagem += " com " + this.lado1 + " de lado, perímetro de " + this.perimetro + " e area de " + this.area;
}
else{
this.mensagem += " com " + this.lado1 + " de lado por " + this.lado2 +", perímetro de " + this.perimetro + " e area de " + this.area;
}
return this.mensagem;
}

}
