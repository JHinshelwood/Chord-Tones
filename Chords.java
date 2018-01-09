import java.util.*;


public class Chords {
	
	private ArrayList<Chord> chords;
	private Chord currentChord;


	public Chords() {
		chords = new ArrayList<Chord>();
		setupChords();
	}

	public Chords(ArrayList<Chord> chords) {
		this.chords = chords;
	}

	public void addChord(Chord chord) {
		chords.add(chord);
	}

	public Chord getCurrentChord() {
		return currentChord;
	}

	public String getCurrentChordName() {
		return currentChord.getName();
	}

	public String getCurrentChordNotes() {
		return currentChord.getNotes();
	}

	public void addChord(String name, String root, String third, String fifth, String seventh, String ninth) {
		chords.add(new Chord(name, root, third, fifth, seventh, ninth));
	}

	public int getSize() {
		return chords.size();
	}

	public String getChordNotes(int index) {
		Chord chord = getChordFromIndex(index);
		return chord.getNotes();
	}

	public Chord getChordFromIndex(int index) {
		try {
			return chords.get(index);
		} catch (IndexOutOfBoundsException e) {
       		System.err.println("IndexOutOfBoundsException: " + e.getMessage());
    		return null;
		}
	}

	public void setupChords() {
		//Major7 Chords		
		addChord(new Chord("CMaj7", "C", "E", "G", "B", "D"));
		addChord(new Chord("DMaj7", "D", "F#", "A", "C#", "E"));
		addChord(new Chord("EMaj7", "E", "G#", "B", "D#", "F#"));
		addChord(new Chord("FMaj7", "F", "A", "C", "E", "G"));
		addChord(new Chord("GMaj7", "G", "B", "D", "F", "A"));
		addChord(new Chord("AMaj7", "A", "C#", "E", "G#", "B"));
		addChord(new Chord("BMaj7", "B", "D#", "F#", "A#", "C#"));
		addChord(new Chord("EbMaj7", "Eb", "G", "Bb", "D", "F"));
		addChord(new Chord("DbMaj7", "Db", "F", "Ab", "C", "Eb"));
		addChord(new Chord("AbMaj7", "Ab", "C", "Eb", "G", "Bb"));
		addChord(new Chord("BbMaj7", "Bb", "D", "F", "A", "C"));
		
		
	}
}
