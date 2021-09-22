
package snakegame;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class GameFrame extends JFrame{
    
    GameFrame(){
        add(new GamePlayPanel());
        setResizable(false);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Snake");
        setLocationRelativeTo(null);
        setVisible(true);
        displayTitleScreen();
    }
    
    public void displayTitleScreen(){
        
    }
    
}
