package chordtones;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class ImageFrame extends JFrame {
	
	public ImageFrame() {
		// get the screen size as a java dimension
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		// get 2/3 of the height, and 2/3 of the width
		int height = screenSize.height - 50;//* 3 / 4;
		int width = screenSize.width * 3 / 4;

		// set the jframe height and width
		setPreferredSize(new Dimension(width, height));
		
		//loadtesticon
		ImageIcon autumn_leaves = new ImageIcon("src/main/resources/autumn_leaves.jpg");
		//JLabel label = new JLabel("", image, JLabel.CENTER);
		
		JLabel musicLabel = new JLabel() {

   		 @Override
   		 public void paintComponent (Graphics g) {
      	  super.paintComponent (g);
      	  Image image = autumn_leaves.getImage();
      	  double width = (double)image.getWidth(null) * 0.80;

      	  double height = (double)image.getHeight(null) * 0.80;
      	  

      	  g.drawImage (image, 0, 0, (int)width, (int)height, null);
    		}
		};
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(musicLabel, BorderLayout.CENTER );
		add(panel);
		add(new SwingAudioPlayer(), BorderLayout.EAST);


		setVisible(true);
		pack();
	}
}