package ClassesCalculadora;

import java.lang.Math;
public class Calculadora {
private double valorA, valorB, resultado;
private String resultMsg;
 
//Métodos
public void soma(double valorA, double valorB){
this.valorA = valorA;
this.valorB = valorB;

this.resultado = valorA + valorB;
this.resultMsg = valorA + " + " + valorB + " = " + this.resultado;  
}

public void sub(double valorA, double valorB){
this.valorA = valorA;
this.valorB = valorB;

this.resultado = valorA - valorB;
this.resultMsg = valorA + " - " + valorB + " = " + this.resultado;
}  

public void mult(double valorA, double valorB){
this.valorA = valorA;
this.valorB = valorB;

this.resultado = valorA * valorB;
this.resultMsg = valorA + " * " + valorB + " = " + this.resultado;   
}

public void div(double valorA, double valorB){
this.valorA = valorA;
this.valorB = valorB;

this.resultado = valorA / valorB;
this.resultMsg = valorA + " / " + valorB + " = " + this.resultado;  
}    

public int convertDectoBin(int num){
int binario = num;    
String resultado = "";
int p = 8; 

while(p <= 8 ){  
resultado = num % 2 + resultado;
num = num / 2;

if(num < 2){  
resultado = num %2 + resultado;
break;
}
p--;      
}
this.resultMsg = binario + " em decimal é igual a " + resultado + " em binário.";
return Integer.parseInt(resultado);
}

public int convertBintoDec(String num){
int pot = 1;
int resultado = 0;

for(int i = num.length()-1; i <= num.length(); i--){
resultado += pot * Character.getNumericValue(num.charAt(i));
pot = pot * 2;

if(i == 0){
    break;
}
}
this.resultMsg = num + " em binário é igual a " + resultado + " em decimal.";
return resultado;
}   
     
//Getters
public String getResultadoString(){
    
return resultMsg;
} 

public double getResultadoValor(){
   
return resultado;
} 



}
