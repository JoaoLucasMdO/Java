package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exemplo5 implements ActionListener{
    private JFrame janela;
    private JButton jb1, jb2;
    
    
    public Exemplo5(){
    janela = new JFrame("Quinta Janela");
    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    janela.setLayout(new FlowLayout());
    
    jb1 = new JButton("OK");
    jb1.addActionListener(this);
    
    jb2 = new JButton("Aaperta ae");
    jb2.addActionListener(this);
    
    Container c = janela.getContentPane();
    c.add(jb1);
    c.add(jb2);
    
    janela.setSize(800, 600);
    janela.setVisible(true);
    }
    public static void main(String[] args){
    new Exemplo5();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jb1){
        JOptionPane.showMessageDialog(janela, "Você apertou o botao 1");
        }
        else if(e.getSource() == jb2){
        JOptionPane.showMessageDialog(janela, "Você apertou o botao 2");
        }
    }
  
}
