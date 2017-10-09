/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs245guiproject1;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;

/**
 *
 * @author Jorge
 */
public class Menu {
    public Menu(){}
    
    public JPanel menu(){
        JPanel mBackground = new JPanel();
        JPanel buttonList = new JPanel();
        BSet button = new BSet();
        
        mBackground.setBackground(Color.black);
        buttonList.setLayout(new GridLayout(3,0));

        buttonList.add(button.Play());
        buttonList.add(button.Score());
        buttonList.add(button.Cred());
        
        mBackground.setLayout(new BorderLayout());
        mBackground.add(buttonList, BorderLayout.SOUTH);
        return mBackground;
    }
}
