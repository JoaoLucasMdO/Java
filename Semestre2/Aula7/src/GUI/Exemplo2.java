package GUI;

import com.sun.javafx.geom.Shape;
import javax.swing.JFrame;


public class Exemplo2 {
    private JFrame janela;
    public Exemplo2(){
    janela = new JFrame("Segunda Janela");
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.setSize(800, 600);
    janela.setVisible(true);
    }
    public static void main(String[] args){
    
    new Exemplo2();
    
    }
    
}
