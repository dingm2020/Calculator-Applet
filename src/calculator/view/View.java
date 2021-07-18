package calculator.view;

import calculator.controller.Controller;
import calculator.model.Model;

public interface View {
	
	Controller getController();
	void setController(Controller controller);
	
	Model getModel();
	void setModel(Model model);

}
