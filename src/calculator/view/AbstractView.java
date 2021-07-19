package calculator.view;

import javax.swing.*;

import calculator.controller.Controller;
import calculator.model.AbstractModel;
import calculator.model.Model;
import calculator.model.ModelListener;

public abstract class AbstractView extends JFrame implements View, ModelListener {
	private Model model;
	private Controller controller;
	
	public AbstractView (Model model, Controller controller) {
		setModel(model);
		setController(controller);
	}
	
	public void registerWithModel(){
		((AbstractModel)model).addModelListener(this);
	}
	
	public Controller getController() {
		return controller;
	}
	
	public void setController(Controller controller) {
		this.controller = controller;
	}
	
	public Model getModel() {
		return model;
	}
	
	public void setModel(Model model) {
		this.model = model;
		registerWithModel();
	}
	
}
