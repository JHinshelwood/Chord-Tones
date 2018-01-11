import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ChordsView extends JFrame {

	private JPanel panel, buttonsPanel;
	private JList chords;
	private DefaultListModel model;
	private JScrollPane listScrollPane;
	private JButton addChord, editChord, deleteChord;
	private Chords chordList;
	private int clickIndex = 0;
	
	public void createAndPopulateModel(Chords chordList) {
		model = new DefaultListModel();
        
        for (Chord chord : chordList.getChords()) {
        	model.addElement(chord.getName());
        }
	}
	
	public void createComponents() {
		listScrollPane = new JScrollPane();
        panel = new JPanel();
        buttonsPanel = new JPanel();
        chords = new JList(model);
        addChord = new JButton("Add Chord");
        editChord = new JButton("Edit Chord");
        deleteChord = new JButton("Delete Chord");
	}
	
	public ChordsView(Chords chordList) {
		this.chordList = chordList;
		setTitle("Edit Chords");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        createAndPopulateModel(chordList);
        createComponents();
       
        listScrollPane.add(chords);
        listScrollPane.setViewportView(chords);

        panel.setLayout(new BorderLayout());
        panel.add(listScrollPane, BorderLayout.CENTER);
       
        buttonsPanel.setLayout(new GridLayout(3, 1));
        buttonsPanel.add(addChord);
        buttonsPanel.add(editChord);
        buttonsPanel.add(deleteChord);
        
        add(panel, BorderLayout.CENTER);
        add(buttonsPanel, BorderLayout.EAST);
        

        addNewChordListener();
        addEditButtonListener();
        addListenerToMenuList();
        addDeleteButtonListener();
        
        setSize(300, 300);
        setVisible(true);	
        }
	
	
	private void addListenerToMenuList() {
	  chords.addListSelectionListener(new ListSelectionListener() {
	    public void valueChanged(ListSelectionEvent e) {
	    	  clickIndex = chords.getSelectedIndex();
	    	  System.out.println(clickIndex);
	    	}
	  	});
	}
	
	public void addNewChordListener() {
		addChord.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AddChord a = new AddChord(model, chordList);
			}
		});
	}
	
	public void addEditButtonListener() {
		
		editChord.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				EditChord edit = new EditChord(model, chordList, clickIndex);
			
			}
		});
	}
	
public void addDeleteButtonListener() {
		
		deleteChord.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int option = JOptionPane.showConfirmDialog(null,
						"Are you sure you want to delete?","Are you sure?", JOptionPane.YES_NO_OPTION);
				
				if (option == 0) {
					chordList.removeChord(clickIndex);
					model.remove(clickIndex);
					clickIndex = clickIndex -1;

				}
				
			
			}
		});
	}
}








