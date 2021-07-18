package calculator.controller;
import calculator.model.Model;
import calculator.view.View;

public interface Controller {

	View getView();
	void setView(View view);
	
	Model getModel();
	void setModel(Model model);
	
}
