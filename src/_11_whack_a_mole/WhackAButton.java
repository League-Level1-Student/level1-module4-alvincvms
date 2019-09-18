package _11_whack_a_mole;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAButton implements ActionListener {
	int score = 0;
	JFrame frame = new JFrame("Whack-A-Button");
	JPanel panel = new JPanel();
	
	void run() {
		
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(380, 220);
		frame.setLocation(500, 500);
		drawButtons();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	void speak(String words) { 
	    try { 
	        Runtime.getRuntime().exec("say " + words).waitFor();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	private void endGame(Date timeAtStart, int molesWhacked) { 
	    Date timeAtEnd = new Date();
	    JOptionPane.showMessageDialog(null, "Your whack rate is "
	            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	                  + " moles per second.");
	}
	private void playSound(String fileName) { 
	    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	    sound.play();
	}
	void drawButtons() {
		panel.removeAll();
		int r = new Random().nextInt(20);
		for(int i=0;i<20;i++) {
			JButton J = new JButton();
			panel.add(J);
			J.addActionListener(this);
			if(r == i) {
				J.setText("Mole!");
			}
		}
	}
	
}

unfinished
