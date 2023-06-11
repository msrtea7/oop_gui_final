package org.msrtea7.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MomentListener implements ActionListener{

    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
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

    private void popUp(String text){
        JFrame popFrame = new JFrame();
        popFrame.setSize(400, 400);
        popFrame.setVisible(true);

        ImageIcon imageIcon = new ImageIcon("./target/classes/imgs/" + text);

        JLabel iconLabel = new JLabel(imageIcon);

        popFrame.add(iconLabel);
    }
}