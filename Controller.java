import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JOptionPane;

public class Controller {

	private Chords chords;
	private ChordNotesPanel panel;
	private ChordsView chordsView; 
	private View v;
	private ArrayList<Chord> repeats;
	
	public Controller() {
		chords = new Chords();
		chords.addMajor7Chords();
		chords.addMin7Chords();
		
		repeats = new ArrayList<Chord>();
		
		panel = new ChordNotesPanel();
		panel.setChordLabel(chords.getCurrentName());
		
		addListeners();
		
		v = new View(panel);
	}
	
	public void addListeners() {
		addRevealListener();
		addNextListener();
		addChordsListener();
		

	}

	public void addToRepeatList(Chord chord) {
		if (repeats.size() < 5) repeats.add(chord);
		else {
			repeats.remove(0);
			repeats.add(chord);
		}
	}

	public int generateIndex() {
		int size = chords.getSize();

		Random r = new Random();
		int index = r.nextInt(size);
		return index;
	}
	
	public void generateNewChord() {
		int index = generateIndex();
		Chord c = chords.getChordFromIndex(index);
		
		while (repeats.contains(c)) {
			index = generateIndex();
			c = chords.getChordFromIndex(index);
		}
		chords.setCurrentIndex(index);
}

	public void addRevealListener() {
		panel.addRevealListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				panel.setNoteField(chords.getCurrentChordNotes());
			}
		});
	}
	
	public void addNextListener() {
		panel.addNextListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("next listener");

				addToRepeatList(chords.getCurrentChord());
				panel.setNoteField("");
				generateNewChord();
				panel.setChordLabel(chords.getCurrentName());
				}
		});
	}

	public void addChordsListener() {
		panel.addChordsListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ChordsView a = new ChordsView(chords);
			}
		});
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	