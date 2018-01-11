package chordtones;


import java.awt.*;

import javax.swing.*;


public class View extends JFrame {

    private ChordNotesPanel p;
    private JLabel label;
    private JTabbedPane tabbedPane;

    public View(ChordNotesPanel panel) {

    	this.p = panel;
        setTitle("Chord Tones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createAndShowGUI(panel);
        
    }
    
    
    public void createAndShowGUI(ChordNotesPanel panel) {
        
            add(panel, BorderLayout.CENTER);

         
            setSize(500, 120);
            setLocationRelativeTo(null);

            setVisible(true);
        }
 

}
