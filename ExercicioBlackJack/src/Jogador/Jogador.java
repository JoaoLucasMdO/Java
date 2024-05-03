package Jogador;
import Baralhos.*;

public class Jogador {
    String nome;
    
    public Jogador(String nome){
        this.nome = nome;
    }
    
    public void jogar() throws InterruptedException{
        String carta = "";
        
        while(carta != null){
                carta = Baralho.getInstance().pegarCarta().getNome();
                System.out.println(nome + " - " + carta);
                Thread.sleep(100);
        }
    }
}
