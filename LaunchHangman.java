/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs245guiproject1;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import java.util.Random;
import javax.swing.JPanel;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

/**
 *
 * @author Jacob
 */
public class LaunchHangman 
{
    public LaunchHangman()
    {
        Random rand = new Random();
        int randVal = rand.nextInt(5);
        int numArray = 0;
        String answer;
        boolean gameover = false;
        int gamePoint = 100;
        
        switch(randVal)
        {
            case 1:
                answer = "abstract";
                numArray = 8;
                break;
            case 2:
                answer = "cemetery";
                numArray = 8;
                break;
            case 3:
                answer = "nurse";
                numArray = 5;
                break;
            case 4:
                answer = "pharmacy";
                numArray = 8;
                break;
            default:
                answer = "climbing";
                numArray = 8;
                break;    
        }
        char [] array = answer.toCharArray(); // saving string answer to char array.
       
        JPanel hangmanPanel = new JPanel();
        JPanel buttonList = new JPanel();
        BSet button = new BSet();
        
        hangmanPanel.setBackground(Color.white);
        
        
        Runnable guiOperate = new Runnable()
        {
            public void run()
            {
                new GUIManager();
            }
        };
        SwingUtilities.invokeLater(guiOperate);
    }
}
