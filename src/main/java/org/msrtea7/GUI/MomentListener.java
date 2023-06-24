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
     * @param e
     */

    public void actionPerformed(ActionEvent e) {

        String source = e.getActionCommand();

        switch(source) {
            case "MyNigga":
                popUp("img1.jpg");
                break;

            case "MyBitch":
                popUp("img2.jpg");
                break;

            case "MyDawgs":
                popUp("img3.jpg");
                break;
            
            default:
                return;
        }
    }

    /**
     * Pop-up windows, on a second-level page, displaying the corresponding img through JLabel, which was read through ImageIcon
     * @param text
     */

    private void popUp(String text){
        JFrame popFrame = new JFrame();
        popFrame.setSize(400, 400);
        popFrame.setVisible(true);

        // ./target/classes/imgs/  if wanted to work within IDE. If wanted to usable within jar, use the path ./imgs/

        ImageIcon imageIcon = new ImageIcon("./target/classes/imgs/" + text);
        JLabel iconLabel = new JLabel(imageIcon);

        popFrame.add(iconLabel);
    }
}