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
public class Fatorial {
double resultado = 1;

        
        
public double FatorialRecursivo(int num){
if(num <= 0){
return 1;
}
else{
this.resultado = num * FatorialRecursivo(num-1); 
}

return this.resultado;
}


public double FatorialInterativo(int num){
if(num <= 0){
return 1;
}
else{ 
for(int i = 1; i <= num ; i++){
this.resultado *= i;
 
}
}
return this.resultado;    
}
    
}
