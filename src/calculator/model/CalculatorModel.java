package calculator.model;

import javax.swing.*;

public class CalculatorModel {
	
	public static void changeTextField(String s, JTextField jft) {
		jft.setText(s);
	}
	
	public static String changeInputHistory(String s, JLabel label, String input) {
		s += input;
		label.setText(s);
		return s;
	}
	
	public static void clearTextField(JTextField jft) {
		jft.setText("");
	}
	
	public static void clearInputHistory(JLabel label, String input) {
		label.setText("");
	}
	
}
