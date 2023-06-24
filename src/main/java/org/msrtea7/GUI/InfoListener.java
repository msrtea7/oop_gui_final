package org.msrtea7.GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
* A class implements ActionListener, taking action for the JMenu of hobbies
* @author msrtea7
*/

public class InfoListener implements ActionListener{

    /**
     * 1 level filter, distinguish what certain type of menu item the action is from, 'hobbies' or 'about me'
     * @param e   the window event
     */

    public void actionPerformed(ActionEvent e) {
        
        // Here the source is the LabelText of the component
        String source = e.getActionCommand();

        switch(source) {
            case "AboutMe":
                JOptionPane.showMessageDialog(null, "I am from CS 20H1");
                break;
            
            case "GuessMyHobby":
                popUp();
                break;
            
            default:
                return;
        }
    }

    /**
     * Pop-up windows, on a second-level page, check the item from the Combo box and validify it with correct answer. If matches, a sentence would shows up on the text area
     */

    private void popUp(){

        /* Set up a new frame */
        JFrame popFrame = new JFrame("Guess my hobby");
        popFrame.setSize(400, 400);
        popFrame.setVisible(true);

        String[] hobbies={"football","sex","black metal"};
        JComboBox<String> hobbyBox = new JComboBox<>(hobbies);
        JTextArea contentArea = new JTextArea();

        /* set the layout and add the componet */
        popFrame.setLayout(new BorderLayout());

        Box componentBox = Box.createHorizontalBox();
        componentBox.add(hobbyBox);
        componentBox.add(contentArea);

        popFrame.add(componentBox, BorderLayout.NORTH);

        /* add action listener to show the contenes if matches */
        hobbyBox.addActionListener(e -> {
            String content = (String) hobbyBox.getSelectedItem();

            if (content.equals("black metal"))
                contentArea.setText("correct! I am a bloddy black metal head");
            else
                contentArea.setText("");
        });
    }
}