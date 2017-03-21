package Kalman;
import lejos.nxt.*;

public class Ultrasom {
	
	private double meta;
	
	public Ultrasom(double meta){
		this.meta = meta;
	}
	
	public void medirUltrasom(){
		int distance, init, value;
		
		Motor.A.setSpeed(100);
		Motor.B.setSpeed(100);
	    Motor.C.setSpeed(100);
	    
	    UltrasonicSensor ultrasom = new UltrasonicSensor(SensorPort.S4);
        init = ultrasom.getDistance();
        
        Motor.A.rotate(36000, true);
	    Motor.B.rotate(-36000, true);
	    Motor.C.rotate(-36000, true);
	    
        
	    do {
    			value = ultrasom.getDistance();
    			distance = init - value;
    			System.out.println(distance);
    		} while (distance < this.meta && Motor.B.isMoving());
	
	    Motor.A.stop();
	    Motor.B.stop();
	    Motor.C.stop();
    
	}
}
