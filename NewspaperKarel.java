
import java.awt.Color;
import stanford.karel.*;

/**
 * 
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.

 * Here are some helpful commands. See the command list for more:
 * move();
 * turnLeft();
 * putBeeper();
 * pickBeeper();
*/
public class NewspaperKarel extends SuperKarel {
	
	//This is an inline comment.
	
	/* This is a block commment
	 * that can span over
	 * multiple lines.
	 */
	
	//run will be the first method to run
	public void run() {
		 move();
		 move();
		 turnLeft();
		 turnLeft();
		 turnLeft();
		 move();
		 turnLeft();
		 move();
		 pickBeeper();
		 turnLeft();
		 turnLeft();
		 move();
		 turnLeft();
		 turnLeft();
		 turnLeft();
		 move();
		 turnLeft();
		 move();
		 move();
		 turnLeft();
		 turnLeft();
	
	}

	//remember to break each sub task down into a method.
	
}
