package labs;

import java.util.Scanner;

public class PerformanceTask {

	public static void main(String[] args) {
		
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter the launch velocity -");
		double launchVelocity = inKey.nextDouble();
		
		
		System.out.println("What is the T-Shirt launcher's angle? (degrees)");
		double launchAngle = inKey.nextDouble();

		int time;
		
		while (time < 100) {
			Object x = Math.cos(Math.toRadians(launchAngle)) 
					* time * launchVelocity;
			
			
	
			Object y = Math.sin(Math.toRadians(launchAngle)) 
					* time * launchVelocity - 0.5 * 9.8 * Math.pow(time, 2);
		if(y < 0) {
		y = 0;
		}
		System.out.println("Time: " + time + "s");
		System.out.println("The X-Position is: " + x + "m");
			System.out.println("The Y-Position is: " + y + "m");
		if(y == 0 && time > 0){
		break;
		}
			time++;
		}
		
		
		
		
	}
	
	
}
