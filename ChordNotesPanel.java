import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;


public class ChordNotesPanel extends JPanel{
	
	private static Chords chords;
	private JLabel chordLabel;
	private JTextField notes;
	private JButton reveal, next, chordsButton;
	private JPanel north, south;

	public ChordNotesPanel() {
		createPanels();
		createComponents();
		addComponents();
		
        }
	
	public void createComponents() {
		chordLabel = new JLabel("");
		reveal = new JButton("Reveal Notes");
		next = new JButton("Next");
		notes = new JTextField(30);
		chordsButton = new JButton("Chords");
	}
	
	public void addComponents() {
		north.add(chordLabel);
		north.add(reveal);
		north.add(next);
		north.add(chordsButton);
		
		south.add(notes);
		
		add(north, BorderLayout.NORTH);
		add(south, BorderLayout.SOUTH);
	}
	
	public void createPanels() {
		north = new JPanel();
		north.setLayout(new FlowLayout());	
		
		south = new JPanel();
		south.setLayout(new FlowLayout());
	}
		
	public void setChordLabel(String text) {
		chordLabel.setText(text);
	}
	
	public void addRevealListener(ActionListener l) {
		reveal.addActionListener(l);
	}
	
	public void addChordsListener(ActionListener l) {
		chordsButton.addActionListener(l);
	}
	
	public void addNextListener(ActionListener l) {
		next.addActionListener(l);
	}
	
	public void setNoteField(String text) {
		notes.setText(text);
	}

	
}