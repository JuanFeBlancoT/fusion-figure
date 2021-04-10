package model;

import java.util.ArrayList;
import java.util.Arrays;

import processing.core.PApplet;

public class Logic {

	private int height, width;
	private String[] linesInText;
	private ArrayList<String> figureAtributes;
	private ArrayList<Figure> figures;
	
	public Logic(int h, int w, PApplet app) {
		width = w;
		height = h;
		figureAtributes = new ArrayList<>();
		figures = new ArrayList<>();
		generateFigureAttributes(app);
	}
	
	public void generateFigureAttributes(PApplet app){
		
		linesInText = app.loadStrings("figuresInfo");
		
		for (int i = 0; i < linesInText.length; i++) {
			String[] tempAtributes = linesInText[i].split(" ");
			for (int j = 0; j < tempAtributes.length; j++) {
				figureAtributes.add(tempAtributes[j]);
			}
		}
	}
	
	public void createCircle(int size, int posX, int posY, int dir, int value) {
		Circle circle = new Circle(size, posX, posY, dir, value, width, height);
		figures.add(circle);
	}
	
	public void createSquare(int size, int posX, int posY, int dir, int value) {
		Square square = new Square(size, posX, posY, dir, value, width, height);
		figures.add(square);
	}
	
	public void createTriangle() {
		
	}
	
	public void createRandomFigure() {
		int type = (int) (Math.random()*6);
		int size = (int) (Math.random()*80+20);
		int posX = (int) (Math.random()*800+100);
		int posY = (int) (Math.random()*700+100);
		//int dir = (int) (Math.random()*2-1);
		int dir = 1;
		int value = (int) (Math.random()*100);
		
		if(type >-1 && type <2) {
			createCircle(size, posX, posY, dir, value);
		}else {
			createSquare(size, posX, posY, dir, value);
		}
	}

	
	//Getters and setters

	public ArrayList<Figure> getFigures() {
		return figures;
	}

	public void setFigures(ArrayList<Figure> figures) {
		this.figures = figures;
	}
}
