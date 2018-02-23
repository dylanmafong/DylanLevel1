
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.awt.Component;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz implements MouseMotionListener {
	
	public static void main(String[] args) throws Exception {
		new PhotoQuiz().quiz();
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
	
public void quiz() throws MalformedURLException {

	Frame quizWindow = new Frame();
	quizWindow.setVisible(true);
	int score = 0;

	// 1. find an image on the internet, and put its URL in a String variable (from
	// your browser, right click on the image, and select “Copy Image URL”)
	String url = "https://images-na.ssl-images-amazon.com/images/I/81ep8rBNqFL._SL1500_.jpg";
	// 2. create a variable of type "Component" that will hold your image
	Component image = createImage(url);
	image.addMouseMotionListener(this);
	// 3. use the "createImage()" method below to initialize your Component
	// 4. add the image to the quiz window
	quizWindow.add(image);
	// 5. call the pack() method on the quiz window
	quizWindow.pack();
	// 6. ask a question that relates to the image
	String color = JOptionPane.showInputDialog("what 3 colors are in this image");
	// 7. print "CORRECT" if the user gave the right answer
	if (color.equals("red white blue")) {
		JOptionPane.showMessageDialog(null, "CORRECT");
		score = score+1;
	}
	// 8. print "INCORRECT" if the answer is wrong
	else {
		JOptionPane.showMessageDialog(null, "INCORRECT");
	}
	// 9. remove the component from the quiz window (you may not see the effect of
	// this until step 12)
	quizWindow.remove(image);
	
	// 10. find another image and create it (might take more than one line of code)
	String URL = "https://cdn.shopify.com/s/files/1/0257/6087/products/48-Soccer-Ball-Solo_Single_Front_ee0e6213-8997-45fc-bfc5-483ef2dc1391.png?v=1510679921";
	// 11. add the second image to the quiz window
	Component image1 = createImage(URL);
	quizWindow.add(image1);
	// 12. pack the quiz window
	quizWindow.pack();
	// 13. ask another question
	String ball = JOptionPane.showInputDialog("kind of ball is this");
	// 14+ check answer, say if correct or incorrect, etc.

	if (ball.equals("soccerball")) {
		JOptionPane.showMessageDialog(null, "CORRECT");
		score = score+1;
	
	} else {
		JOptionPane.showMessageDialog(null, "INCORRECT");
	}
	JOptionPane.showMessageDialog(null, "your score is " + score );
	quizWindow.remove(image1);

}
	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())

@Override
public void mouseDragged(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseMoved(MouseEvent e) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "WRONG");
}
}
