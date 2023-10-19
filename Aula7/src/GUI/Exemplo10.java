package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Exemplo10 implements ActionListener{
    
    //Declaração dos componentes do GUI
    private JFrame frame;
    private JMenuBar barra;
    private JMenu arqMenu, corMenu, tamMenu;
    private JMenuItem sobre, fim;
    private JMenuItem azul,vermelho,preto;
    private JMenuItem maior,menor;
    private JLabel mostra;
    private int tamFonte;

    public Exemplo10(){
        //Inicialização dos componentes
        frame = new JFrame("Exemplo 10 - GUI com Menus");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Incluir a barra de menus ao frame
        barra = new JMenuBar();
        frame.setJMenuBar(barra);
        // Menu Arquivo
        arqMenu = new JMenu("Arquivo");
        sobre = new JMenuItem("Sobre...");
        //Adicionando sobre ao ouvidor
        sobre.addActionListener(this);
        fim = new JMenuItem("Fim");
        fim.addActionListener(this);
        arqMenu.add(sobre);
        arqMenu.addSeparator();
        arqMenu.add(fim);
        barra.add(arqMenu);
        // Menu Cor
        corMenu = new JMenu("Cor");
        azul = new JMenuItem("Azul");
        azul.addActionListener(this);
        vermelho = new JMenuItem("Vermelho");
        vermelho.addActionListener(this);
        preto = new JMenuItem("Preto");
        preto.addActionListener(this);
        corMenu.add(azul);
        corMenu.add(vermelho);
        corMenu.add(preto);
        barra.add(corMenu);
        // Menu Tamanho
        tamMenu = new JMenu("Tamanho");
        maior = new JMenuItem("Maior");
        maior.addActionListener(this);
        menor = new JMenuItem("Menor");
        menor.addActionListener(this);
        tamMenu.add(maior);
        tamMenu.add(menor);
        barra.add(tamMenu);
        mostra = new JLabel("Exemplo10 - GUI com Menus",SwingConstants.CENTER);
        tamFonte = 20;
        mostra.setFont(new Font("Arial",Font.BOLD,tamFonte));
        Container c = frame.getContentPane();
        c.setBackground(Color.YELLOW);
        c.add(mostra,BorderLayout.CENTER);
        frame.setSize(500,200);
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sobre)        {
        JOptionPane.showMessageDialog(frame,"Exemplo10 - GUI com Menus",
        "Sobre...",JOptionPane.INFORMATION_MESSAGE);
        }
        else if (e.getSource() == fim)        {
        System.exit(0);
        }
        else if (e.getSource() == azul)        {
        mostra.setForeground(Color.BLUE);
        }
        else if (e.getSource() == vermelho)        {
        mostra.setForeground(Color.RED);
        }
        else if (e.getSource() == preto)        {
        mostra.setForeground(Color.BLACK);
        }
        else if (e.getSource() == maior)        {
        tamFonte += 10;
        mostra.setFont(new Font("Arial",Font.BOLD,tamFonte));
        }
        else if (e.getSource() == menor)        {
        tamFonte -= 10;
        mostra.setFont(new Font("Arial",Font.BOLD,tamFonte));
        }
    }
    
    public static void main(String args[]){
        new Exemplo10();
    }
}