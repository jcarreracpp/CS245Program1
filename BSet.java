package cs245guiproject1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.*;
public class BSet extends JButton{
    
    public BSet(){}
    
    public JButton back(){
        JButton temp = new JButton();
        temp.setText("Back");
        temp.setActionCommand("MM");
        temp.setFont(new Font("Papyrus", Font.BOLD, 12));
        temp.setBackground(Color.WHITE);
        return temp;
    }
    
    public JButton Score(){
        JButton temp = new JButton();
        temp.setText("Highscores");
        temp.setActionCommand("Scores");
        temp.setFont(new Font("Comic Sans", Font.BOLD, 12));
        temp.setForeground(Color.WHITE);
        temp.setBackground(Color.BLUE);
        temp.setPreferredSize(new Dimension(100,50));
        return temp;
    }
    
    public JButton Cred(){
        JButton temp = new JButton();
        temp.setText("Credits");
        temp.setActionCommand("Cred");
        temp.setFont(new Font("Comic Sans", Font.BOLD, 12));
        temp.setForeground(Color.WHITE);
        temp.setBackground(Color.BLUE);
        temp.setPreferredSize(new Dimension(100,50));
        return temp;
    }
    
    public JButton Play(){
        JButton temp = new JButton();
        temp.setText("Play");
        temp.setActionCommand("Play");
        temp.setFont(new Font("Comic Sans", Font.BOLD, 12));
        temp.setForeground(Color.WHITE);
        temp.setBackground(Color.BLUE);
        temp.setPreferredSize(new Dimension(100,50));
        return temp;
    }
}