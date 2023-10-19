package GUI;

import com.sun.javafx.geom.Shape;
import java.awt.*;
import javax.swing.*;


public class Exemplo3 {
    private JFrame janela;
    public Exemplo3(){
    janela = new JFrame("Terceira Janela");
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Container c =  janela.getContentPane();
    JLabel rotulo = new JLabel("Texto...");
    JButton botao = new JButton("Clicka ae");
    c.setLayout(new GridLayout(2, 10));
    c.add(rotulo);
    c.add(botao);
    
    
    janela.setSize(800, 600);
    janela.setVisible(true);
    }
    public static void main(String[] args){
    
    new Exemplo3();
    
    }
    
}