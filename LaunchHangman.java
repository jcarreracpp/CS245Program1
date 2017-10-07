/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs245guiproject1;

import javax.swing.SwingUtilities;

/**
 *
 * @author Jorge
 */
public class LaunchHangman {
    public LaunchHangman(){
        SplashScreen heh = new SplashScreen();
        HighScoreBoard heoh = new HighScore
        Runnable guiOperate = new Runnable(){
            public void run(){
                heh.setVisible(true);
                heh.add(new HighScoreBoard());
            }
        };
        SwingUtilities.invokeLater(guiOperate);
    }
}
