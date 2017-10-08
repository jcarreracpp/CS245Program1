/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs245guiproject1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jorge
 */
public class MainSplash {
    
    public MainSplash(){}
    
    public JPanel mainSplash(){
        JLabel Title = new JLabel("CS 245 Quarter Project");
        Title.setForeground(Color.white);
        Title.setFont(new Font("Times New Roman", Font.PLAIN, 48));
        JLabel teamName = new JLabel("By: Team Name Pending");
        teamName.setForeground(Color.white);
        JPanel LPanel = new JPanel();
        LPanel.setBackground(Color.black);
        JPanel PPanel = new JPanel();
        PPanel.setBackground(Color.black);
        LPanel.add(Title);
        PPanel.add(teamName);
        JPanel MPanel = new JPanel();
        MPanel.setBounds(0, 0, 600, 400);
        MPanel.setBackground(Color.black);
        MPanel.setLayout(new BorderLayout());
        MPanel.add(LPanel, BorderLayout.NORTH);
        MPanel.add(PPanel, BorderLayout.SOUTH);
        return MPanel;
    }
    
}
