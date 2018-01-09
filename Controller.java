import java.util.*; 

public class Controller {

	private Scanner scan;
	private Chords chords;
	public Controller() {
		scan = new Scanner(System.in);
	}

	public int generateIndex(Chords chords) {
		int size = chords.getSize();

		Random r = new Random();
		int index = r.nextInt(size);
		return index;
	}

	public Chord getChordFromIndex(Chords chords, int index) {
		return chords.getChordFromIndex(index);
	}

	public String displayChordFromIndex(Chords chords, int index) {
		Chord chord = getChordFromIndex(chords, index);
		return chord.getName();
	}

	public String displayChordNotesFromIndex(Chords chords, int index) {
		Chord chord = getChordFromIndex(chords, index);
		return chord.getNotes();
	}

	public Chord generateIndexAndReturnChord(Chords chords) {
		int index = generateIndex(chords);
		return getChordFromIndex(chords, index);
	}

	public String generateIndexAndDisplayChord(Chords chords) {
		int index = generateIndex(chords);
		return displayChordFromIndex(chords, index);
	}

	public String generateIndexAndDisplayChordNotes(Chords chords) {
		int index = generateIndex(chords);
		return displayChordNotesFromIndex(chords, index);
	}

	public void task(Chords chords) {
		int index = generateIndex(chords);
		System.out.println(displayChordFromIndex(chords, index));
		input();
		System.out.println(displayChordNotesFromIndex(chords, index));
		System.out.println("-------");
		input();
	}
	


	public void input() {
		try {
		System.in.read();
	}
		catch(Exception e){}
	}

	
	
}