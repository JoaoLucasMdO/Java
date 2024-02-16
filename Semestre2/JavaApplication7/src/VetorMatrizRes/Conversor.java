package VetorMatrizRes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alunos
 */
public class Conversor {
private int Matriz[][] = new int[8][3];    
private String mensagem1 = "Pot|";
private String mensagem2 = "Bin|";
private String mensagem3 = "Dec|";
private String mensagemFinal;
    
public String binario(int num1, int num2, int num3, int num4, int num5, int num6, int num7, int num8){
    
//Vetor1    
Matriz[0][0] = num8;
Matriz[1][0] = num7;
Matriz[2][0] = num6;
Matriz[3][0] = num5;
Matriz[4][0] = num4;
Matriz[5][0] = num3;
Matriz[6][0] = num2;
Matriz[7][0] = num1;

//Vetor2
Matriz[0][1] = 1;
Matriz[1][1] = 2;
Matriz[2][1] = 4;
Matriz[3][1] = 8;
Matriz[4][1] = 16;
Matriz[5][1] = 32;
Matriz[6][1] = 64;
Matriz[7][1] = 128;


int resultado = 0;
   
for(int i = 0; i < 7; i++){
Matriz[i][2] = Matriz[i][0] * Matriz[i][1];
resultado += Matriz[i][2];

mensagem1 += Matriz[i][1] + "|";
mensagem2 += Matriz[i][0] + "|";
mensagem3 += Matriz[i][2] + "|";
}

mensagemFinal = mensagem1 + "\n" + mensagem2 + "\n" + mensagem3 + " = " + resultado;

return mensagemFinal;
}
    
}
