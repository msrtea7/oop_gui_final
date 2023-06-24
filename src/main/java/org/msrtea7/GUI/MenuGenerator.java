package org.msrtea7.GUI;

import javax.swing.*;

/**
* Menu page generator, holding all the components on the initial page
* @author msrtea7
*/

public class MenuGenerator {

    private JFrame menuFrame;

    private JMenuBar menuBar;

    private JMenu schoolMenu;
    private JMenu momentMenu;
    private JMenu infoMenu;

    private JMenuItem schoolPrimary;
    private JMenuItem schoolSecondary;
    private JMenuItem schoolHigh;
    private JMenuItem schoolUniversity;

    private JMenuItem myNigga;
    private JMenuItem myBitch;
    private JMenuItem myDawgs;

    private JMenuItem aboutMe;
    private JMenuItem guessMyHobby;

    /** Aggregation */
    private InfoListener infoListener;
    private MomentListener momentListener;
    private SchoolListener schoolListener;

    /**
     * initialize the page
     */
    public void generate(){
        menuFrame = new JFrame("My Menu");
        menuFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        menuFrame.setVisible(true);
        menuFrame.setBounds(100,100,600,400);
        setMenu();
        setAction();
    }

    /**
     * organize the related components
     */
    private void setMenu(){
        menuBar = new JMenuBar();
        menuFrame.setJMenuBar(menuBar);

        schoolMenu = new JMenu("My school", false);
        momentMenu = new JMenu("Moments of LOVE", false);
        infoMenu = new JMenu("About Me", false);

        schoolPrimary = new JMenuItem("primary", 0);
        schoolSecondary = new JMenuItem("secondary", 0);
        schoolHigh = new JMenuItem("high", 0);
        schoolUniversity = new JMenuItem("university", 0);

        myNigga = new JMenuItem("MyNigga", 0);
        myBitch = new JMenuItem("MyBitch", 0);
        myDawgs = new JMenuItem("MyDawgs", 0);

        aboutMe = new JMenuItem("AboutMe", 0);
        guessMyHobby = new JMenuItem("GuessMyHobby", 0);

        menuBar.add(schoolMenu);
        menuBar.add(momentMenu);
        menuBar.add(infoMenu);

        schoolMenu.add(schoolPrimary,0);
        schoolMenu.add(schoolSecondary,1);
        schoolMenu.add(schoolHigh, 2);
        schoolMenu.add(schoolUniversity, 3);

        momentMenu.add(myNigga,0);
        momentMenu.add(myBitch, 1);
        momentMenu.add(myDawgs, 2);

        infoMenu.add(aboutMe, 0);
        infoMenu.add(guessMyHobby, 1);
    }


    /**
     * Set ActionListener to the corresponding JMenu items. Noteble here, (1 to N) relation between listeners and menu items.
     */
    private void setAction(){
        schoolListener = new SchoolListener();
        momentListener = new MomentListener();
        infoListener = new InfoListener();
        
        for (int i = 0; i < 4; i++){
            schoolMenu.getItem(i).addActionListener(schoolListener);
        }

        for (int i = 0; i < 3; i++){
            momentMenu.getItem(i).addActionListener(momentListener);
        }

        for (int i = 0; i < 2; i++){
            infoMenu.getItem(i).addActionListener(infoListener);
        }
    }
}
