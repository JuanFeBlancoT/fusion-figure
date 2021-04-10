package model;

import processing.core.PApplet;

public class Square extends Figure{
	
	private int time, optionM;
	
	public Square(int size, int posX, int posY, int dir, int value, int maxX, int maxY) {
		super(size, posX, posY, dir, value, maxX, maxY);
		time = 0;
		optionM = (int) (Math.random()*7);
	}

	@Override
	public void draw(PApplet app) {
		
		app.square(posX, posY, size);
	}

	@Override
	public void move() {

		if(canMove) {
			time++;
			
			if(posX < maxX-size/2 && posX > size/2 && posY < maxY-size/2 && posY > size/2) {
				
			}else {
				dir=-dir;
			}
			if(time == 120) {
				optionM = (int) (Math.random()*7);
				time = 0;
			}
			
			if(optionM == 0 || optionM == 1) {
				posX+=2*dir;
			}else if(optionM == 2 || optionM == 3) {
				posX-=2*dir;
			}else if(optionM == 4 || optionM == 5) {
				posY+=2*dir;
			}else if(optionM == 6 || optionM == 7){
				posY-=2*dir;
			}
		}
	}
}
