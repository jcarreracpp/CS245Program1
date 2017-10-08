/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs245guiproject1;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Jorge
 */
public class CS245GUIProject1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new LaunchHangman();
    }

    
    private static void bakeAndMakeGUI(){

        JFrame frame = new JFrame("600x400");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,400);
        frame.setVisible(true);

    }
    
}
