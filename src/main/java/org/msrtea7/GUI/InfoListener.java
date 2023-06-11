package org.msrtea7.GUI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class InfoListener implements ActionListener{

    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
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

    private void popUp(){
        JFrame popFrame = new JFrame("Guess my hobby");
        popFrame.setSize(400, 400);
        popFrame.setVisible(true);

        String[] hobbies={"football","sex","black metal"};
        JComboBox<String> hobbyBox = new JComboBox<>(hobbies);
        JTextArea contentArea = new JTextArea();

        popFrame.setLayout(new BorderLayout());

        Box componentBox = Box.createHorizontalBox();
        componentBox.add(hobbyBox);
        componentBox.add(contentArea);

        popFrame.add(componentBox, BorderLayout.NORTH);

        hobbyBox.addActionListener(e -> {
            String content = (String) hobbyBox.getSelectedItem();

            if (content.equals("black metal"))
                contentArea.setText("correct! I am a bloddy black metal head");
            else
                contentArea.setText("");
        });
    }
}