package chordtones;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class AddChord extends JFrame {

	private JPanel panel;
	private JList chords;
	private JLabel name, root, third, fifth, seventh, ninth;
	private JTextField nameField, rootField, thirdField, fifthField, seventhField, ninthField;
	private JButton addChord;
	private DefaultListModel model;
	private Chords chordsArray;
	private ArrayList<Chord> chordsArrayList;
	
	
	
	public void createComponents() {
        panel = new JPanel();
        name = new JLabel("Name:"); nameField = new JTextField("");
        root = new JLabel("Root:");	rootField = new JTextField("");
        third = new JLabel("Third:"); thirdField = new JTextField("");
        fifth = new JLabel("Fifth:"); fifthField = new JTextField("");
        seventh = new JLabel("Seventh:"); seventhField = new JTextField("");
        ninth = new JLabel("Ninth:"); ninthField = new JTextField("");
        addChord = new JButton("Add");

	}
	
	public AddChord(DefaultListModel model, Chords chordsArray) {
		this.model = model;
		this.chordsArray = chordsArray;
		chordsArrayList = chordsArray.getChords();
		
		setTitle("Add Chord");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        createComponents();
        
        panel.setLayout(new GridLayout(7, 2));
        panel.add(name);panel.add(nameField);
        panel.add(root);panel.add(rootField);
        panel.add(third);panel.add(thirdField);
        panel.add(fifth);panel.add(fifthField);
        panel.add(seventh);panel.add(seventhField);
        panel.add(ninth);panel.add(ninthField);
        panel.add(addChord);
      
        add(panel);
        
        addAddListener();
        
        pack();
        setVisible(true);	
        }
	
	public void addAddListener() {
		addChord.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
	        	
				if (checkValidChord(nameField.getText(), rootField.getText(), thirdField.getText(), 
						fifthField.getText(), seventhField.getText(), ninthField.getText())) {
				Chord newChord = new Chord(nameField.getText(), rootField.getText(), thirdField.getText(), 
						fifthField.getText(), seventhField.getText(), ninthField.getText());
				
	        	//Add new chord to model for chord list previous window
				model.addElement(newChord.getName());
				
				chordsArray.addChord(newChord);
				
				try {
				CSVReader c = new CSVReader();
				c.writeContentToCSV(chordsArray);
			} catch(Exception f) {f.printStackTrace();}

				dispose();

				
				}

			}
		});
	}
	
	public boolean checkValidChord(String name, String root, String third, String fifth, String seventh, String ninth) {
		if (name.equals("") || root.equals("") || third.equals("") || fifth.equals("") || seventh.equals("")) {
			return false;
		}
		
		if (!chordsArrayList.isEmpty()) {
		for (int i = 0; i < chordsArrayList.size(); i++) {
			if (chordsArrayList.get(i).getName().equals(name) || chordsArrayList.get(i).getNotes().equals("Root: " + root + ", third: " + third + ", fifth: " + 
						fifth + ", seventh: " + seventh + ", ninth: " + ninth)) return false;
		}
	}
		return true;

	
	}
}








