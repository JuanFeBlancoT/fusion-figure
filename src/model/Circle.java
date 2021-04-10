package model;

import processing.core.PApplet;

public class Circle extends Figure{

	public Circle(int size, int posX, int posY, int dir, int value) {
		super(size, posX, posY, dir, value);
	}

	@Override
	public void draw(PApplet app) {
		
		app.circle(posX, posY, size);
	}

	@Override
	public void move() {
		posX+=2*dir;
		posY-=2*dir;
	}

}
