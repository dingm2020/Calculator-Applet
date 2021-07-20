package calculator.model;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorModel implements ActionListener {
	
	private JTextField output = new JTextField(10);
	
	public CalculatorModel(){
		JFrame frame = new JFrame("Calculator");
		
		frame.getContentPane().setLayout(null);
		frame.setSize(200,220);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		output.setBounds(25, 15, 150, 20);
		frame.getContentPane().add(output);
		
		JLabel label = new JLabel("Testing 123");
		frame.getContentPane().add(label);
		
		JButton one = new JButton("1");
		one.addActionListener(this);
		one.setBounds(25, 50, 50, 25);
		frame.getContentPane().add(one);
		
		JButton two = new JButton("2");
		two.addActionListener(this);
		two.setBounds(75, 50, 50, 25);
		frame.getContentPane().add(two);
		
		
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("1")) {
			changeTextField("Pressed 1");
		}
		else if(e.getActionCommand().equals("2"))
			changeTextField("Pressed 2");
	}
	
	public void changeTextField(String s) {
		this.output.setText(s);
	}
	
}
