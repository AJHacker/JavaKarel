import java.awt.Color;

import stanford.karel.SuperKarel;

public class DrawFlag extends SuperKarel {
	int x =0;

	public void run() {
		for(int i = 0;i<24;i++){
			moveandpaint();
				rs();
				moveandpaint();
				ls();
			
		}
		moveandpaint();
		rs();
		moveandpaint();
		turnRight();
		turnRight();
	}
	public void moveandpaint(){
		
		while(frontIsClear()){
			if(x<2){
				paintCorner(Color.red);
			}
			else{
				paintCorner(Color.white);
			}
			move();
			
			if(x==4){
				x=0;
			}
	}
		
		x=x+1;
		}
		
	public void rs(){
		turnLeft();
		if(x<2){
			paintCorner(Color.red);
		}
		else{
			paintCorner(Color.white);
		}
		move();
		if(x<2){
			paintCorner(Color.red);
		}
		else{
			paintCorner(Color.white);
		}
		turnLeft();
	}
public void ls(){
		turnRight();
		
		move();
		if(x<2){
			paintCorner(Color.red);
		}
		else{
			paintCorner(Color.white);
		}
		turnRight();
	}
}