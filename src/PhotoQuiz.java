/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
String dwight = "https://thoughtcatalog.files.wordpress.com/2015/01/screen-shot-2015-01-21-at-3-27-37-pm.png?w=786&h=518";
		// 2. create a variable of type "Component" that will hold your image
Component image= createImage(dwight);
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
quizWindow.add(image);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String question = JOptionPane.showInputDialog("Question. Who is this?");
		// 7. print "CORRECT" if the user gave the right answer
if(question.equals("Dwight Shrute")) {
	System.out.println("CORRECT");
}
else {
	System.out.println("INCORRECT");
}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line of code)
String sherlock = "https://thumbs.mic.com/NWM3YmFhYzJmNiMvTlJ6NkQ2Ti02YWJVRVE0Z05waUFmTDNIa2FJPS81eDI3OjEwOTd4NzEzLzgwMHg0NTAvZmlsdGVyczpmb3JtYXQoanBlZyk6cXVhbGl0eSg4MCkvaHR0cHM6Ly9zMy5hbWF6b25hd3MuY29tL3BvbGljeW1pYy1pbWFnZXMvYmk0ZmtlbjZjZTB0YWdoZXN5aXdreHRkZ3hvdnFkcHozZGR1eWZhMzdsNGdzcW1yYWdlZGQ5aWltYzd0NGx1ZC5qcGc.jpg";
		// 11. add the second image to the quiz window
Component image2 = createImage(sherlock);
quizWindow.add(image2);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String q2 = JOptionPane.showInputDialog("Who is this?");
		// 14+ check answer, say if correct or incorrect, etc.
if(q2.equals("Sherlock Holmes")) {
	System.out.println("CORRECT");
}
else { 
	System.out.println("INCORRECT");
}

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





