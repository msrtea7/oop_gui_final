package org.msrtea7.GUI;

/**
* 2nd layer of encapsulation.
* It aggregates 3 types of actionListeners (info, menu, school), and it intergrally process the actions from menu items.
* @author msrtea7
*/

public class SeniorListener {
    private InfoListener infoListener = new InfoListener();
    private MomentListener momentListener = new MomentListener();
    private SchoolListener schoolListener = new SchoolListener();

    public InfoListener getInfoListener(){return infoListener;}
    public MomentListener getMomentListener(){return momentListener;}
    public SchoolListener getSchoolListener(){return schoolListener;}
}
