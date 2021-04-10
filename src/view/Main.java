package view;

import controller.MainController;
import processing.core.PApplet;

public class Main extends PApplet{
	public static void main (String[] args) {
		PApplet.main("view.Main");
	}
	
	private int width = 1000;
	private int height = 900;
	private MainController mainController;
	
	public void settings() {
		size(width, height);
	}
	
	public void setup() {
		mainController = new MainController(height, width, this);
	}

	public void draw() {
		background(40);
		mainController.draw(this);
	}
	
	public void mouseClicked() {
		
		if(mouseButton == LEFT) {
			System.out.println("left");
			mainController.getLogic().createRandomFigure();
		}else {
			System.out.println("right");
		}
		
	}
} 
