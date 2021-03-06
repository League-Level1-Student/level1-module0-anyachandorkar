/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {

	// 0. You can use the celebrity photos we have placed in the default java package,  
	// or if you prefer, get celebrity photos from the Internet, place them in the default
	// package, and change the names below.
	
	String firstImage = "src/arnold.jpeg";
	String secondImage = "src/leonardo.jpeg";
	String thirdImage = "src/morgan.jpeg";

	
	JFrame window = new JFrame();
	JPanel panel = new JPanel();


	private void startQuiz() {

		// 1. Make an int variable to hold the score.
int score = 0;
		// 2. Set the size of the window in the initializeGui() method below

			// 4. Ask the user who this person is and store their answer
			String guess= JOptionPane.showInputDialog("who is this?");
			
			// 5. Check their answer. If they guessed correctly:
			// -- Tell them they are right and increase the score by 1
			if(guess.equals("Arnold Shwarzenegger")) {
				JOptionPane.showMessageDialog(null, "CORRECT");
				score = score +1;
			}

			// 6. Otherwise:
			// -- Tell them they are wrong and who the person is
			else {
				JOptionPane.showMessageDialog(null, "INCORRECT. It's Arnold Shwarzenegger");
			}

			// 7. Use the showNextImage() method below to get the next image
			showNextImage();
		    // 8. Show them their current score
			JOptionPane.showMessageDialog(null, "Your current score is " + score);
			// 9. .... repeat for all your images.....
String guess2 = JOptionPane.showInputDialog("Who is this?");
if(guess2.equals("Leonardo Decaprio")) {
	JOptionPane.showMessageDialog(null, "CORRECT");
	score = score +1; 
}
else {
	JOptionPane.showMessageDialog(null, "INCORRECT. It's Leonardo Decaprio");
}
showNextImage();
JOptionPane.showMessageDialog(null, "Your current score is " + score);
String guess3 = JOptionPane.showInputDialog("Who is this?");
if(guess3.equals("Morgan Freeman")) {
	JOptionPane.showMessageDialog(null, "CORRECT");
	score = score +1; 
}
		
else {
	JOptionPane.showMessageDialog(null, "INCORRECT. It's Morgan Freeman");
	}
showNextImage();
JOptionPane.showMessageDialog(null, "Your current score is " + score);
	}

	public void showNextImage() {
		panel.removeAll();
		panel.add(getNextImage());		
		window.setVisible(true);
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);
		
		// 3. Change the size of the window so that you can only see part of the image.		
		window.setSize(100,130);
		
		showNextImage();
		
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		return label;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		System.exit(0);
		return new JLabel();
	}
}
