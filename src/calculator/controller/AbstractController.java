package calculator.controller;

import calculator.model.Model;
import calculator.view.View;

public abstract class AbstractController {
	private View view;
	private Model model;
	
	public void setModel(Model model) {
		this.model = model;
	}
	
	public Model getModel() {
		return model;
	}
	
	public View getView() {
		return view;
	}
	
	public void setView(View view) {
		this.view = view;
	}
}
