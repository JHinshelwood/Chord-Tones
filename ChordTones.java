import java.util.*;
import javax.swing.SwingUtilities;

public class ChordTones {
 
 //public static void main(String[] args) {
		
		/**Controller controller = new Controller();
		Chords chords = new Chords();
				
		System.out.println("Welcome, to reveal the chord tones of the chord, press 'n'.");
		System.out.println("Press 'q' to quit.");
		System.out.println("-------");

				
		do {
		
		controller.task(chords);
		
		} while(true);**/

		public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    createAndShowGUI();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void createAndShowGUI() throws Exception {
        new View();

    }

	}
