package labs;

import java.util.Scanner;

public class PerformanceTask {

	public static void main(String[] args) {
		
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter the launch velocity -");
		double launchVelocity = inKey.nextDouble();
		// gets an integer input for the launch velocity from the user.
		
		System.out.println("What is the T-Shirt launcher's angle? (degrees)");
		double launchAngle = inKey.nextDouble();
// gets a double value of tshirt launch angle integer from the user.
		int time;
		
		while (time < 100) {
			Object x = Math.cos(Math.toRadians(launchAngle)) 
					* time * launchVelocity;
			//sets a launch velocity equation multiplied by the angle in order to make it less than 100.
			
	
			Object y = Math.sin(Math.toRadians(launchAngle)) 
					* time * launchVelocity - 0.5 * 9.8 * Math.pow(time, 2);
			// sets velocity equation.
		if(y < 0) {
		y = 0;
		}
		//sets y's minimum to 0
		System.out.println("Time: " + time + "s");
		System.out.println("The X-Position is: " + x + "m");
			System.out.println("The Y-Position is: " + y + "m");
		if(y == 0 && time > 0){
		break;
		//prints out the x and y position with appropriate times.
		}
			time++;
		}
		
		
		
		
	}
	
	
}
