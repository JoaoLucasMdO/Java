package GUI;

import javax.swing.JFrame;

public class Exemplo1 {
    private JFrame janela;
    
    public Exemplo1(){
    janela = new JFrame("Primeira Janela");
    janela.setSize(800, 600);
    janela.setVisible(true);//Define que a janela estará visível
    }
    
    public static void main(String[] args){
    Exemplo1 p = new Exemplo1();
    
    }
}
