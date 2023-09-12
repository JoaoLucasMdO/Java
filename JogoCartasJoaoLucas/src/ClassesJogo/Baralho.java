/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesJogo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alunos
 */
public class Baralho {
private List<Cartas> cartas = new ArrayList<>();
public String mensagem;
public String CriarBaralho(){
    String naipes[];
    naipes = new String[]{"PAUS", "OUROS", "COPAS", "ESPADAS"};
    String numeroCartas[];
    numeroCartas = new String[]{"UM", "DOIS", "TRES", "QUATRO", "CINCO", "SEIS", "SETE", "OITO" ,"NOVE", "DEZ", "VALETE", "DAMA", "REI"};
    
for(int i = 0; i < 4; i++){
    int valor = 1;
    for(int p = 0; p < 13; p++){
    if(numeroCartas[p] == "VALETE"){
    valor = 8;
    }
    
    else if(numeroCartas[p] == "DAMA"){
    valor = 9;
    }
       
    else if(numeroCartas[p] == "REI"){
    valor = 10;
    }        
    Cartas carta = new Cartas(Naipes.valueOf(naipes[i]), NumerosCartas.valueOf(numeroCartas[p]), valor);
    cartas.add(carta);
    valor++;  
    }
}
for(int a = 0; a < cartas.size(); a++){
mensagem += a + " Carta " + "Naipe:" + cartas.get(a).naipe + "\n Numero:" + cartas.get(a).numero + "\n Valor:" + cartas.get(a).valor + "\n" ;
}
return mensagem;
}

}


