package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	JLabel icon1; JLabel a;
	JLabel icon2; JLabel b;
	JLabel icon3; JLabel c;
	JPanel panel = new JPanel();
	JFrame frame = new JFrame("Slot Machine");
	JButton button = new JButton();
	
	void run() {
		button.setText("SPIN");
		panel.add(button);
		icon1 = loadImage("7.png");
		icon2 = loadImage("7.png");
		icon3 = loadImage("7.png");
		panel.add(icon1); panel.add(icon2); panel.add(icon3);
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		button.addActionListener(this);
	}
	
	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("clicked");
		panel.remove(icon1);
		icon1 = randomImage();
		panel.add(icon1);
		
		panel.remove(icon2);
		icon2 = randomImage();
		panel.add(icon2);
		
		panel.remove(icon3);
		icon3 = randomImage();
		panel.add(icon3);
		
		frame.pack();
		
		
	}
	private JLabel randomImage() {
		int x = new Random().nextInt(31);
		if(x <= 8) {
			return loadImage("cherry.png");
		}
		else if(x > 8 && x <= 17) {
			return loadImage("orange.png");
		}
		else if(x > 17 && x <= 26) {
			return loadImage("grape.png");
		}
		else if(x > 26 && x <= 29) {
			return loadImage("ace.png");
		}
		else {
			return loadImage("7.png");
		}
	}
	
}


