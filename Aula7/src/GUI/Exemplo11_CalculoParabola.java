/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Exemplo11_CalculoParabola implements ActionListener{
    
    /*=== Exemplo adaptados das notas de aula do Profº Edson Luiz – UNESP FEG ====*/
    
    private JFrame jf;
    private JPanel p1, p2, p3, p4;
    private JButton b1, b2, b3;
    private JRadioButton rb1, rb2;
    private ButtonGroup bg;
    private JLabel lab1, lab2, lab3, lab4;
    private JTextField tf1, tf2, tf3, tf4;
    private double vel,ang;
    
    public Exemplo11_CalculoParabola(){
        jf = new JFrame("Exemplo5");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Painel superior
        p1 = new JPanel();
        rb1 = new JRadioButton("Angulo em graus",true);
        rb2 = new JRadioButton("Angulo em radianos",false);
        bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        p1.add(rb1);
        p1.add(rb2);
        // Painel da direita
        p2 = new JPanel(new GridLayout(3,1));
        b1 = new JButton("Calcula");
        b1.addActionListener((ActionListener) this);
        b2 = new JButton("Gráfico");
        b2.addActionListener(this);
        b2.setEnabled(false);
        b3 = new JButton("Limpa");
        b3.addActionListener(this);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        // Painel central
        p3 = new JPanel();
        p3.setBackground(Color.YELLOW);
        // Painel inferior
        p4 = new JPanel(new GridLayout(2,4));
        lab1 = new JLabel(" Velocidade = ");
        lab2 = new JLabel(" Angulo = ");
        lab3 = new JLabel("Alcance = ");
        lab4 = new JLabel("Altura máxima = ");
        tf1 = new JTextField(5);
        tf2 = new JTextField(5);
        tf3 = new JTextField(5);
        tf4 = new JTextField(5);
        tf3.setEditable(false);
        tf4.setEditable(false);
        p4.add(lab1);
        p4.add(tf1);
        p4.add(lab3);
        p4.add(tf3);
        p4.add(lab2);
        p4.add(tf2);
        p4.add(lab4);
        p4.add(tf4);
        // Area de conteudo
        Container c = jf.getContentPane();
        c.add(p1,BorderLayout.NORTH);
        c.add(p2,BorderLayout.EAST);
        c.add(p3,BorderLayout.CENTER);
        c.add(p4,BorderLayout.SOUTH);
        jf.setSize(500,300);
        jf.setVisible(true);
        }
    
    private void pegarDados()
    {
        vel = 0;
        ang = 0;
        if (tf1.getText().equals("") || tf2.getText().equals("")) return;
        vel = Double.parseDouble(tf1.getText());
        ang = Double.parseDouble(tf2.getText());
        if (rb1.isSelected())
        {
            //Converte de graus para radianos
            ang = Math.PI*ang/180;
        }
    }
    private void efetuarCalculos()
    {
        pegarDados();
        double alc, hmax;
        alc = Math.pow(vel,2)*Math.sin(2*ang)/10;
        hmax = (Math.pow(vel,2)*Math.pow(Math.sin(ang),2))/20;
        DecimalFormat df = new DecimalFormat("0.00");
        tf3.setText(df.format(alc));
        tf4.setText(df.format(hmax));
        b2.setEnabled(true);
    }
    
    private void mostrarGrafico()
    {
        int y;
        double alfa,beta;
        pegarDados();
        Graphics g = p3.getGraphics();
        g.setColor(Color.red);
        for (int x = 0; x < p3.getWidth(); x++)
        {
            alfa = Math.tan(ang);
            beta = Math.pow(vel,2)*Math.pow(Math.cos(ang),2);
            y = p3.getHeight()-(int)(alfa*x-(5/beta)*Math.pow(x,2));
            g.fillOval(x,y,3,3);
        }
    }
    private void limpar()
    {
        tf1.setText(""); tf2.setText("");
        tf3.setText(""); tf4.setText("");
        b2.setEnabled(false);
        Graphics g = p3.getGraphics();
        g.setColor(Color.YELLOW);
        g.fillRect(0,0,p3.getWidth(),p3.getHeight());
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
    if (e.getSource() == b1)
    {
        efetuarCalculos();
    }
    else
    if (e.getSource() == b2)
    {
        mostrarGrafico();
    }
    else
    if (e.getSource() == b3)
    {
        limpar();
    }
    }
    
    public static void main(String args[])
    {
        new Exemplo11_CalculoParabola();
    }
}