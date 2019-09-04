package _04_chuckle_clicker;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton joke = new JButton("joke");
	JButton punchline = new JButton("punchline");
	
	public void makeButtons(){
		
		frame.setVisible(true);
		panel.add(joke); panel.add(punchline);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		
		joke.addActionListener(this);
		punchline.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == joke) {
			JOptionPane.showMessageDialog(null, "Why there is a 'k' instead of a 'c' in the word dark?");
		}
		if(e.getSource() == punchline) {
			JOptionPane.showMessageDialog(null, "'Because you can't 'see' in the dark.");
				
		}
	}
}
