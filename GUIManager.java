/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs245guiproject1;

import javax.swing.JFrame;

/**
 *
 * @author Jorge
 */
public class GUIManager {
    
    public GUIManager(){
        begin();
    }
    
    private void begin(){
        JFrame mainFrame = new JFrame("600x400");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(600,400);
        mainFrame.setVisible(true);
        int[] ttt = new int[5];
        new HighScoreBoard(mainFrame, ttt);

    }
    
    private void refresh(){
        
    }
}
