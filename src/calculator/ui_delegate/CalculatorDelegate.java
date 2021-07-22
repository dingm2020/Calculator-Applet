package calculator.ui_delegate;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import calculator.model.CalculatorModel;


public class CalculatorDelegate implements ActionListener{
	
	private JLabel input_hist = new JLabel(); 
	private JTextField output = new JTextField(10);
	private String input_hist_text = "";
	
	//private CalculatorModel calcModel;
	
	public CalculatorDelegate(){
		JFrame frame = new JFrame("Calculator");
		JPanel panel = new JPanel();
		//calcModel = new CalculatorModel();
		
		frame.getContentPane().setLayout(null);
		frame.setSize(250,350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		input_hist.setText(input_hist_text);
		input_hist.setBounds(25,15,150,20);
		//panel.add(input_hist);
		frame.getContentPane().add(input_hist);
		
		output.setBounds(25, 50, 150, 20);
		frame.getContentPane().add(output);	
		
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
			CalculatorModel.changeTextField("Pressed 1", this.output);
			input_hist_text = CalculatorModel.changeInputHistory(input_hist_text, input_hist, "1");
		}
		else if(e.getActionCommand().equals("2")) {
			CalculatorModel.changeTextField("Pressed 2", this.output);
			input_hist_text = CalculatorModel.changeInputHistory(input_hist_text, input_hist, "2");
		}
		else if(e.getActionCommand().equals("3")) {
			(new CalculatorModel()).changeTextField("Pressed 3", this.output);
		}
		else if(e.getActionCommand().equals("4")) {
			(new CalculatorModel()).changeTextField("Pressed 4", this.output);
		}
		else if(e.getActionCommand().equals("5")) {
			(new CalculatorModel()).changeTextField("Pressed 5", this.output);
		}
		else if(e.getActionCommand().equals("6")) {
			(new CalculatorModel()).changeTextField("Pressed 6", this.output);
		}
		else if(e.getActionCommand().equals("7")) {
			(new CalculatorModel()).changeTextField("Pressed 7", this.output);
		}
		else if(e.getActionCommand().equals("8")) {
			(new CalculatorModel()).changeTextField("Pressed 8", this.output);
		}
		else if(e.getActionCommand().equals("9")) {
			(new CalculatorModel()).changeTextField("Pressed 9", this.output);
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
