/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.*;
import javafx.scene.paint.Color;
import javax.swing.*;


public class Exemplo4 {
    private JFrame janela;
    public Exemplo4(){
    janela = new JFrame("Quarta Janela");
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    
    JLabel label = new JLabel("Label");
    JButton botao1 = new JButton("Butao 1");
    JButton botao2 = new JButton("Butao 2");
    JButton botao3 = new JButton("Butao 3");
    
    p1.setBackground(java.awt.Color.BLUE);
    p1.add(label);
    p1.setLayout(new FlowLayout(FlowLayout.LEFT));
    p2.setBackground(java.awt.Color.DARK_GRAY);
    p2.add(botao1);
    p3.setBackground(java.awt.Color.MAGENTA);
    p3.setLayout(new GridLayout(2,1));
    p3.add(botao2);
    p3.add(botao3);
    
    Container c = janela.getContentPane();
    c.add(p1, BorderLayout.NORTH);
    c.add(p2, BorderLayout.SOUTH);
    c.add(p3, BorderLayout.WEST);
    c.setBackground(java.awt.Color.red);
    
    janela.setSize(800, 600);
    janela.setVisible(true);
    }
    
    public static void main(String[] args) {
    new Exemplo4();
    }
}
