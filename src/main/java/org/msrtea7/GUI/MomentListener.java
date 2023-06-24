package org.msrtea7.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
* A class implements ActionListener, taking action for the JMenu of Moments
* @author msrtea7
*/

public class MomentListener implements ActionListener{

    /**
     * 1 level filter, distinguish which pic was chosen
     * @param e  the window event
     */

    public void actionPerformed(ActionEvent e) {

        String source = e.getActionCommand();

        switch(source) {
            case "MyNigga":
                popUp("My nigga", "img1.jpg");
                break;

            case "MyBitch":
                popUp("My bitch", "img2.jpg");
                break;

            case "MyDawgs":
                popUp("My Dawgs", "img3.jpg");
                break;
            
            default:
                return;
        }
    }

    /**
     * Pop-up windows, on a second-level page, displaying the corresponding img through JLabel, which was read through ImageIcon
     * @param imgName  string of the image file name
     * @param frameName   string of the frame's name
     */

    private void popUp(String frameName, String imgName){

        /* Set up a new frame */
        JFrame popFrame = new JFrame(frameName);
        popFrame.setSize(400, 400);
        popFrame.setVisible(true);

        /*    ./target/classes/imgs/  if wanted to work within IDE. If wanted to usable within jar, use the path ./imgs/     */

        ImageIcon imageIcon = new ImageIcon("./imgs/" + imgName);
        JLabel iconLabel = new JLabel(imageIcon);

        popFrame.add(iconLabel);
    }
}