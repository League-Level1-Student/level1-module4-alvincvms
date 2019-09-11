package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame = new JFrame("Simple Calculator");
	JPanel panel = new JPanel();
	JLabel number = new JLabel();
	
	JTextField num1 = new JTextField(10);
	JTextField num2 = new JTextField(10);
	
	JButton add = new JButton("add");
	JButton subtract = new JButton("subtract");
	JButton multiply = new JButton("multiply");
	JButton divide = new JButton("divide");
	
	void run() {
		panel.add(num1); panel.add(num2);
		panel.add(number);
		panel.add(add); panel.add(subtract); panel.add(multiply); panel.add(divide);
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(500, 500);
		frame.pack();
		add.addActionListener(this); subtract.addActionListener(this); multiply.addActionListener(this); divide.addActionListener(this);
	}
	
	int add(int num1, int num2) {
		return (num1 + num2);
	}
	
	int subtract(int num1, int num2) {
		return (num1 - num2);
	}
	
	int multiply(int num1, int num2) {
		return (num1 * num2);
	}
	
	int divide(int num1, int num2) {
		return (num1/num2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==add) {
			number.setText(""+add(Integer.parseInt(num1.getText()),Integer.parseInt(num2.getText())));
			frame.pack();
		}
		if(e.getSource()==subtract) {
			number.setText(""+subtract(Integer.parseInt(num1.getText()),Integer.parseInt(num2.getText())));
			frame.pack();
		}
		if(e.getSource()==multiply) {
			number.setText(""+multiply(Integer.parseInt(num1.getText()),Integer.parseInt(num2.getText())));
			frame.pack();
		}
		if(e.getSource()==divide) {
			number.setText(""+divide(Integer.parseInt(num1.getText()),Integer.parseInt(num2.getText()))+" R"+(Integer.parseInt(num1.getText())%Integer.parseInt(num2.getText())));
			frame.pack();
		}
	}
}
