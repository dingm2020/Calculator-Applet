package calculator.ui_delegate;

import javax.swing.SwingUtilities;
import calculator.model.CalculatorModel;

public class CalculatorDelegate {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				new CalculatorModel();
			}
		});
	}

}
