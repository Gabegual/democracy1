package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {

	public void run() {
		
		for(int i=0;i<5;i++) {
			if(frontIsClear()) {
				move();
			}
		}
		if(leftIsClear()) {
			turnLeft();
			move();
			pickBeeper();
			turnAround();
		}
		if(frontIsClear()) {
			move();
			turnLeft();
		}
		for(int i=0;i<4;i++){
			if(frontIsClear()) {
				move();
			}
		}
		if(leftIsClear()) {
			turnLeft();
			move();
			pickBeeper();
			turnAround();
			move();
			move();
			if(beepersPresent()) {
				pickBeeper();
				pickBeeper();
			}
			turnAround();
			move();
			turnRight();
			move();
		}
		
				
	}
	
		
}
