package org.msrtea7.GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SchoolListener implements ActionListener{

    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String source = e.getActionCommand();

        switch(source) {

            case "primary":
                popUp("primary", "A school");
                break;
            
            case "secondary":
                popUp("secondary", "B school");
                break;
            
            case "high":
                popUp("high", "C school");
                break;
            
            case "university":
                popUp("university", "D school");
        }
    }

    private void popUp(String schoolType, String schoolName){
        JFrame popFrame = new JFrame(schoolType);
        popFrame.setSize(400, 400);
        popFrame.setVisible(true);
        popFrame.setLayout(new BorderLayout());

        JTextField contentField = new JTextField("My " + schoolType + " is " + schoolName);
        contentField.setHorizontalAlignment(JTextField.CENTER);
        
        popFrame.add(contentField, BorderLayout.NORTH);
    }
}
