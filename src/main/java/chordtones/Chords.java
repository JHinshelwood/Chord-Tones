package chordtones;


import java.util.*;
import java.util.Observable;


public class Chords {
	
	private ArrayList<Chord> chords;
	private Chord currentChord;
	private int currentIndex;
	
	public Chords() {
		chords = new ArrayList<Chord>();
		currentIndex = 0;
	}
	
	public void addChord(String name, String root, String third, String fifth, String seventh, String ninth) {
		chords.add(new Chord(name, root, third, fifth, seventh, ninth));
	}
	
	public void addChord(String name, String root, String third, String fifth, String seventh) {
		chords.add(new Chord(name, root, third, fifth, seventh));
	}
	
	public void addChord(Chord chord) {
		chords.add(chord);
	}
	public String getCurrentName() {
		return chords.get(currentIndex).getName();
	}
	
	public String getCurrentChordNotes() {
		Chord c = chords.get(currentIndex);
		return c.getNotes();
	}
	
	public void addChordIndex(int index, Chord chord) {
		chords.add(index, chord);
	}
	
	public Chord getChordFromIndex(int index) {
		return chords.get(index);
	}
	
	public int getSize() {
		return chords.size();
	}
	
	public Chord getCurrentChord() {
		return chords.get(currentIndex);
	}
	
	public void setCurrentIndex(int newIndex) {
		currentIndex = newIndex;
	}
	
	public ArrayList<Chord> getChords() {
		return chords;
	}
	
	public void removeChord(int index) {
		chords.remove(index);
	}
	
	
}












