import java.util.*;

public class ChordTones {
 
 public static void main(String[] args) {
		
		Controller controller = new Controller();
		Chords chords = new Chords();
				
		System.out.println("Welcome, to reveal the chord tones of the chord, press 'n'.");
		System.out.println("Press 'q' to quit.");
		System.out.println("-------");

				
		do {
		
		controller.task(chords);
		
		} while(true);
	}
}