import java.awt.Dimension;

import javax.swing.*;

public class View {

    public View() {

        Controller controller = new Controller();
        Chords chords = new Chords();


        JLabel chordName = new JLabel(chords.getCurrentChordName());
        JTextField root = new JTextField(1);
       

        // Set the view layout

        JPanel ctrlPane = new JPanel();

        ctrlPane.add(chordName);

        ctrlPane.add(root);


        JFrame frame = new JFrame("Chord Tones");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(ctrlPane);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

 

}
