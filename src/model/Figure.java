package model;

import processing.core.PApplet;

public abstract class Figure {
	
	protected int size, posX, posY, dir, value, r,g,b, maxX, maxY;
	protected boolean canMove;
	
	public Figure(int size, int posX, int posY, int dir, int value, int maxX, int maxY) {
		
		canMove = true;
		this.size = size;
		this.posX = posX;
		this.posY = posY;
		this.dir = dir;
		this.value = value;
		this.maxX = maxX;
		this.maxY = maxY;
		r = (int) (Math.random()*255);
		g = (int) (Math.random()*255);
		b = (int) (Math.random()*255);
	}

	public abstract void draw(PApplet app);
	
	public abstract void move();
	
	//Getters and setters
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public boolean isCanMove() {
		return canMove;
	}

	public void setCanMove(boolean canMove) {
		this.canMove = canMove;
	}
	
}
