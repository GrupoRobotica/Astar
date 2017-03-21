package Astar;

import Kalman.*;
import lejos.nxt.*;

public class Main {
	public static void main(String[] args) throws InterruptedException{

		//Kalman kalman = new Kalman(0.7782, 0.3996, 50);
		
		
		//tamanho robo = 23x23
		turn(2880, 1); 
		
    	
		
    	turn(3050, 2); //esquerda
	

		Button.waitForAnyPress();
	}
	public static void turn(int degrees, int direction)  throws InterruptedException{
		
    	Motor.B.setSpeed(200);
    	Motor.C.setSpeed(200);

    	if(direction == 1) { // direita
    		Motor.B.rotate( degrees, true);
    		Motor.C.rotate( -degrees, true);
    	}
    	else  {
    		Motor.B.rotate( -degrees, true);
    		Motor.C.rotate( degrees, true);
    	}
    	
    	Thread.sleep(10000);
		Motor.B.stop();
		Motor.C.stop();
	}
}
