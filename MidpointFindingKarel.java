import stanford.karel.SuperKarel;


public class MidpointFindingKarel extends SuperKarel {
	int i;
	int x;
	int z;
	int y;
	public void run() 
	{
		x=0;
		while(frontIsClear()){
			i++;
			move();
		
		}
		y=0;
		turnLeft();
		while(frontIsClear()){
			z++;
			move();
			
		}
		
		
			
			i=y/2;
			turnLeft();
			turnLeft();
			while(i>0){
				move();
				i--;
		}
		putBeeper();
		
	}
	
	
	}
