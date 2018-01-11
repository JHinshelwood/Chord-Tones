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
	
	public void addMajor7Chords() {
		chords.add(new Chord("CMaj7", "C", "E", "G", "B", "D"));
		chords.add(new Chord("DbMaj7", "Db", "F", "Ab", "C", "Eb"));
		chords.add(new Chord("DMaj7", "D", "F#", "A", "C#", "E"));
		chords.add(new Chord("EbMaj7", "Eb", "G", "Bb", "D", "F"));
		chords.add(new Chord("EMaj7", "E", "G#", "B", "D#", "F#"));
		chords.add(new Chord("FMaj7", "F", "A", "C", "E", "G"));
		chords.add(new Chord("GMaj7", "G", "B", "D", "F#", "A"));
		chords.add(new Chord("AbMaj7", "Ab", "C", "Eb", "G", "Bb"));
		chords.add(new Chord("AMaj7", "A", "C#", "E", "G#", "B"));
		chords.add(new Chord("BMaj7", "B", "D#", "F#", "A#", "C#"));
		chords.add(new Chord("BbMaj7", "Bb", "D", "F", "A", "C"));


	}
	
	public void addMin7Chords() {
		chords.add(new Chord("CMin7", "C", "Eb", "G", "Bb"));
		chords.add(new Chord("DMin7", "D", "F", "A", "C"));
}
}












