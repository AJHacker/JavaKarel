import stanford.karel.SuperKarel;
import java.awt.Color;



/**
 * File: MazeKarel.java
 * --------------------------------
 * Karel solves any maze (without loops) using the
 * right hand rule.
 */
public class MazeKarel extends SuperKarel {

	public void run() {
		while(noBeepersPresent()){
			if(rightIsClear()){
				turnRight();
			}else{
				while(frontIsBlocked()){
					turnLeft();
				}
			}
		move();
		paintCorner(Color.blue);
		
		}
		
		pickBeeper();	
		}
	
}

	


			
			

		
	




