package calculator.ui_delegate;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import calculator.model.CalculatorModel;


public class CalculatorDelegate implements ActionListener{
	
	private JLabel input_hist = new JLabel(); 
	private JTextField output = new JTextField(10);
	private String input_hist_text = "";
	private int sum = 0;

	
	public CalculatorDelegate(){
		JFrame frame = new JFrame("Calculator");
		JPanel panel = new JPanel();
		//calcModel = new CalculatorModel();
		
		frame.getContentPane().setLayout(null);
		frame.setSize(250,350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		input_hist.setText(input_hist_text);
		input_hist.setBounds(25,15,150,20);
		frame.getContentPane().add(input_hist);
		
		output.setBounds(25, 50, 150, 20);
		frame.getContentPane().add(output);	
		
		
		JButton clear = new JButton("Clear"); // Below numbers, right side
		clear.addActionListener(this);
		clear.setBounds(125, 225, 50, 40);
		frame.getContentPane().add(clear);
		
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
		
		JButton add = new JButton ("+");
		add.addActionListener(this);
		add.setBounds(180, 175, 40, 25);
		frame.getContentPane().add(add);
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("1")) {
			CalculatorModel.changeTextField("Pressed 1", this.output);
			input_hist_text = CalculatorModel.changeInputHistory(input_hist_text, input_hist, "1");
		}
		else if(e.getActionCommand().equals("2")) {
			CalculatorModel.changeTextField("Pressed 2", this.output);
			input_hist_text = CalculatorModel.changeInputHistory(input_hist_text, input_hist, "2");
		}
		else if(e.getActionCommand().equals("3")) {
			CalculatorModel.changeTextField("Pressed 3", this.output);
			input_hist_text = CalculatorModel.changeInputHistory(input_hist_text, input_hist, "3");
		}
		else if(e.getActionCommand().equals("4")) {
			CalculatorModel.changeTextField("Pressed 4", this.output);
			input_hist_text = CalculatorModel.changeInputHistory(input_hist_text, input_hist, "4");
		}
		else if(e.getActionCommand().equals("5")) {
			CalculatorModel.changeTextField("Pressed 5", this.output);
			input_hist_text = CalculatorModel.changeInputHistory(input_hist_text, input_hist, "5");
		}
		else if(e.getActionCommand().equals("6")) {
			CalculatorModel.changeTextField("Pressed 6", this.output);
			input_hist_text = CalculatorModel.changeInputHistory(input_hist_text, input_hist, "6");
		}
		else if(e.getActionCommand().equals("7")) {
			CalculatorModel.changeTextField("Pressed 7", this.output);
			input_hist_text = CalculatorModel.changeInputHistory(input_hist_text, input_hist, "7");
		}
		else if(e.getActionCommand().equals("8")) {
			CalculatorModel.changeTextField("Pressed 8", this.output);
			input_hist_text = CalculatorModel.changeInputHistory(input_hist_text, input_hist, "8");
		}
		else if(e.getActionCommand().equals("9")) {
			CalculatorModel.changeTextField("Pressed 9", this.output);
			input_hist_text = CalculatorModel.changeInputHistory(input_hist_text, input_hist, "9");
		}
		else if(e.getActionCommand().equals("Clear")) {
			CalculatorModel.clearInputHistory(input_hist, input_hist_text);
			CalculatorModel.clearTextField(output);
		}
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				new CalculatorDelegate();
			}
		});
	}
}
