package model;

import processing.core.PApplet;

public class Triangle extends Figure{

	private int dirX, dirY;
	public Triangle(int size, int posX, int posY, int dir, int value, int maxX, int maxY) {
		super(size, posX, posY, dir, value, maxX, maxY);
		dirX = dir;
		dirY = -dir;
	}

	@Override
	public void draw(PApplet app) {
		app.fill(r,g,b);
		app.triangle(posX-(size/2), posY-(size/2), posX, posY+(size/2), posX+(size/2), posY-(size/2));
		app.fill(255);
		app.text(value, posX, posY);
	}

	@Override
	public void move() {
		if(canMove) {
			posX+=2*dirX;
			posY+=2*dirY;
			
			if(posX > maxX-(size/2) || posX < (size/2)) {
				dirX*= -1;
			}
			if(posY > maxY-(size/2) || posY < (size/2)) {
				dirY*= -1;
			}
		}
	}
}
