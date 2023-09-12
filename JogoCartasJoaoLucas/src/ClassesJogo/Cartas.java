/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesJogo;

import java.util.List;

/**
 *
 * @author Alunos
 */

enum Naipes{PAUS, OUROS, COPAS, ESPADAS};
enum NumerosCartas{UM, DOIS, TRES, QUATRO, CINCO, SEIS, SETE, OITO ,NOVE, DEZ, VALETE, DAMA, REI};
public class Cartas {
    public final Naipes naipe;
    public final NumerosCartas numero;
    public final int valor;
    
public Cartas(Naipes naipe, NumerosCartas numero, int valor){ 
    this.naipe = naipe;
    this.numero = numero;
    this.valor = valor;
}
    
public String getNome(){
    return "Carta " + numero + naipe;
}
    
}
