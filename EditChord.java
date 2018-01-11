import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class EditChord extends JFrame {

	private JPanel panel;
	private JList chords;
	private JLabel name, root, third, fifth, seventh, ninth;
	private JTextField nameField, rootField, thirdField, fifthField, seventhField, ninthField;
	private JButton okButton;
	private static DefaultListModel model;
	private static Chords chordsArray;
	private ArrayList<Chord> chordsArrayList;
	private Chord selectedChord;
	private int selectedIndex;
	
	
	
	public void createComponents() {
        panel = new JPanel();
        name = new JLabel("Name:"); nameField = new JTextField(selectedChord.getName());
        root = new JLabel("Root:");	rootField = new JTextField(selectedChord.getRoot());
        third = new JLabel("Third:"); thirdField = new JTextField(selectedChord.getThird());
        fifth = new JLabel("Fifth:"); fifthField = new JTextField(selectedChord.getFifth());
        seventh = new JLabel("Seventh:"); seventhField = new JTextField(selectedChord.getSeventh());
        ninth = new JLabel("Ninth:"); ninthField = new JTextField(selectedChord.getNinth());
        okButton = new JButton("Ok");

	}
	
	public EditChord(DefaultListModel model, Chords chordsArray, int selectedIndex) {
		this.model = model;
		this.chordsArray = chordsArray;
		this.selectedIndex = selectedIndex;
		chordsArrayList = chordsArray.getChords();
		selectedChord = chordsArray.getChordFromIndex(selectedIndex);
		
		
		setTitle("Edit Chord");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        createComponents();
        
        panel.setLayout(new GridLayout(7, 2));
        panel.add(name);panel.add(nameField);
        panel.add(root);panel.add(rootField);
        panel.add(third);panel.add(thirdField);
        panel.add(fifth);panel.add(fifthField);
        panel.add(seventh);panel.add(seventhField);
        panel.add(ninth);panel.add(ninthField);
        panel.add(okButton);
      
        add(panel);
        
        addOkButtonListener();
        
        pack();
        setVisible(true);	
        
        System.out.println(selectedIndex);
        }
	
	public void addOkButtonListener() {
		okButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//if all the fields have a string
				if (checkValidEdit(nameField.getText(), rootField.getText(), thirdField.getText(), 
						fifthField.getText(), seventhField.getText(), ninthField.getText())) {
					
					//create new chord with these
					Chord newChord = new Chord(nameField.getText(), rootField.getText(), thirdField.getText(), 
						fifthField.getText(), seventhField.getText(), ninthField.getText());
				
					
					//add new chord to model and chords array
					model.remove(selectedIndex);
					model.add(selectedIndex, newChord.getName());

					chordsArray.removeChord(selectedIndex);
					chordsArray.addChordIndex(selectedIndex, newChord);
					
					dispose();
				
				
				}
			}
		});
	}
	
	public boolean checkValidEdit(String name, String root, String third, String fifth, String seventh, String ninth) {
		if (name.equals("") || root.equals("") || third.equals("") || fifth.equals("") || seventh.equals("")) {
			return false;
		}
			return true;

	}
}








