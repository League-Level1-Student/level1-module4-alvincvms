package _05_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor {
	JFrame frame = new JFrame();
	JLabel label = new JLabel();
	char currentLetter;
	
	public void run() {
	currentLetter = generateRandomLetter();
	
	}
	
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
}
