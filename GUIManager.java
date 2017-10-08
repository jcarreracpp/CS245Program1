/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs245guiproject1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Jorge
 */
public class GUIManager {
    private Timer timer;
    private MainSplash ms = new MainSplash();
    private JPanel temp = ms.mainSplash();
    private HighScoreBoard h = new HighScoreBoard();
    
    public GUIManager(){
        begin();
    }
    
    private void begin(){
        JFrame mainFrame = new JFrame("600x400");

        ActionListener timedSwitch = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                timer.stop();
                temp = h.highScoreBoard();
                mainFrame.add(temp);
                mainFrame.setVisible(true);
            }
        };
        timer = new Timer(3000, timedSwitch);
        timer.setRepeats(false);
        timer.setInitialDelay(3000);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(600,400);
        mainFrame.setVisible(true);

        mainFrame.add(temp);
        timer.start();
        
        mainLoop();
    }
    
    private void mainLoop(){
        
    }
    
}
