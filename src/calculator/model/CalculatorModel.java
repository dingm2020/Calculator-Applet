package calculator.model;

import javax.swing.*;

public class CalculatorModel {
	
	/***
	 * Changes the text box to reflect what was entered
	 * @param s the value being displayed as a String
	 * @param jft the JavaTextField being modified
	 */
	public static void changeTextField(String s, JTextField jft) {
		jft.setText(s);
	}
	
	/***
	 * Displays any change in inputs for the user
	 * @param s the String being displayed
	 * @param label the label the String is being added to
	 * @param input the new input from the user
	 * @return the updated String to store correctly, for future reference
	 */
	public static String changeInputHistory(String s, JLabel label, String input) {
		s += input;
		label.setText(s);
		return s;
	}
	
	/***
	 * Blanks the display
	 * @param jft Java TextField that displays current values
	 */
	public static void clearTextField(JTextField jft) {
		jft.setText("");
	}
	
	/***
	 * Blanks the display
	 * @param label 
	 * @param input
	 */
	public static void clearInputHistory(JLabel label, String input) {
		label.setText("");
	}
	
	/***
	 * 
	 * @param value
	 */
	public static void zero(int value) {
		value = 0;
	}
	
}
