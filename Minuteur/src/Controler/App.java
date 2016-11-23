package Controler;
import Model.*;
import View.*;

public class App {
	
	private static Model model;
	private static View view;
	
	public static Model getModel() {
		return model;
	}

	public static void setModel(Model m) {
		model = m;
	}

	
	public static View getView() {
		return view;
	}

	public static void setView(View view) {
		App.view = view;
	}

	public static void main(String[] args) {
		model = new Model();
		view = new View(model);
	}
	


}
