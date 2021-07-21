package calculator.model;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorModel implements ActionListener {
	
	private JTextField output = new JTextField(10);
	
	public CalculatorModel(){
		JFrame frame = new JFrame("Calculator");
		
		frame.getContentPane().setLayout(null);
		frame.setSize(250,350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		output.setBounds(25, 15, 150, 20);
		frame.getContentPane().add(output);
		
		JLabel label = new JLabel("Calculator Applet");
		frame.getContentPane().add(label);
		
		
		JButton one = new JButton("1");
		one.addActionListener(this);
		one.setBounds(25, 175, 50, 25);	// Bottom left
		frame.getContentPane().add(one);
		
		JButton two = new JButton("2");
		two.addActionListener(this);
		two.setBounds(75, 175, 50, 25); // Bottom center
		frame.getContentPane().add(two); 
		
		JButton three = new JButton("3");
		three.addActionListener(this);
		three.setBounds(125, 175, 50, 25); // Bottom right
		frame.getContentPane().add(three);
		
		JButton four = new JButton("4");
		four.addActionListener(this);
		four.setBounds(25, 125, 50, 25); // Center left
		frame.getContentPane().add(four);
		
		JButton five = new JButton("5");
		five.addActionListener(this);
		five.setBounds(75, 125, 50, 25); // Center
		frame.getContentPane().add(five);
		
		JButton six = new JButton("6");
		six.addActionListener(this);
		six.setBounds(125, 125, 50, 25); // Center right
		frame.getContentPane().add(six);
		
		JButton seven = new JButton("7");
		seven.addActionListener(this);
		seven.setBounds(25, 75, 50, 25); // Top left
		frame.getContentPane().add(seven);
		
		JButton eight = new JButton("8");
		eight.addActionListener(this);
		eight.setBounds(75, 75, 50, 25); // Top center
		frame.getContentPane().add(eight);
		
		JButton nine = new JButton("9");
		nine.addActionListener(this);
		nine.setBounds(125, 75, 50, 25); // Top right
		frame.getContentPane().add(nine);
		
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("1")) {
			changeTextField("Pressed 1");
		}
		else if(e.getActionCommand().equals("2")) {
			changeTextField("Pressed 2");
		}
		else if(e.getActionCommand().equals("3")) {
			changeTextField("Pressed 3");
		}
		else if(e.getActionCommand().equals("4")) {
			changeTextField("Pressed 4");
		}
		else if(e.getActionCommand().equals("5")) {
			changeTextField("Pressed 5");
		}
		else if(e.getActionCommand().equals("6")) {
			changeTextField("Pressed 6");
		}
		else if(e.getActionCommand().equals("7")) {
			changeTextField("Pressed 7");
		}
		else if(e.getActionCommand().equals("8")) {
			changeTextField("Pressed 8");
		}
		else if(e.getActionCommand().equals("9")) {
			changeTextField("Pressed 9");
		}
	}
	
	public void changeTextField(String s) {
		this.output.setText(s);
	}
	
}