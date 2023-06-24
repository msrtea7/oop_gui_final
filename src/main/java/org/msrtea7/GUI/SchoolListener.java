package org.msrtea7.GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
* A class implements ActionListener, taking action for the JMenu of school info
* @author msrtea7
*/

public class SchoolListener implements ActionListener{

    /**
     * 1 level filter, distinguish what certain type of school the action is from
     * @param e   the window event
     */
    public void actionPerformed(ActionEvent e) {

        String source = e.getActionCommand();

        switch(source) {

            case "primary":
                popUp("primary", "DaSiXiang school");
                break;
            
            case "secondary":
                popUp("secondary", "DongFang school");
                break;
            
            case "high":
                popUp("high", "ZheShiDaFuZhong school");
                break;
            
            case "university":
                popUp("university", "CJLU");
                break;
            
            default:
                return;
        }
    }

    /**
     * Pop-up windows, on a second-level page, a JLabel shows the contents about my school information
     * @param schoolType  String, the type of school
     * @param schoolName   String, the name of the school
     */
    private void popUp(String schoolType, String schoolName){

        /* Set up a new frame */
        JFrame popFrame = new JFrame(schoolType);
        popFrame.setSize(400, 400);
        popFrame.setVisible(true);
        popFrame.setLayout(new BorderLayout());

        /* set the layout and add the componet */
        JLabel contentField = new JLabel("My " + schoolType + " school is " + schoolName);
        contentField.setHorizontalAlignment(SwingConstants.CENTER);
        
        popFrame.add(contentField, BorderLayout.NORTH);
    }
}
