package controller;

import model.Logic;
import processing.core.PApplet;

public class MainController {
	
	private int height, width;
	private Logic logic;
	
	public MainController(int h, int w, PApplet app) {
		width = w;
		height = h;
		logic = new Logic(height, width, app);
	}
	
	public void draw(PApplet app) {
		
		for (int i = 0; i < logic.getFigures().size(); i++) {
			 logic.getFigures().get(i).draw(app);
			 logic.getFigures().get(i).move();
		}
		logic.verifyCollition(app);
		System.out.println(logic.getFigures().size());
	}

	public Logic getLogic() {
		return logic;
	}

	public void setLogic(Logic logic) {
		this.logic = logic;
	}
}
