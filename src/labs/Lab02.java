package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter an integer");

		int x = inKey.nextInt();

		System.out.println("Enter another integer");

		int y = inKey.nextInt();


		int max = Math.max(x, y);
		int min = Math.min(x, y);

		for (int i = 10; i > 0;) {

		int total = (int)(Math.random()* (max - min+1)+ min);
		System.out.println(total);
		i--;
		}
		
		
	}
	
	
	
	
	public static void problem02() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter the radi(s)us of the cylinder");
		int radisus= inKey.nextInt();
		System.out.println("Enter the height of the cylinder");
		int x = inKey.nextInt();

		double y = Math.PI * radisus * radisus);
		double z = y * x;

		System.out.println("The Volume of the Cylinder is: " + z);
		
	}

	
	

	public static void problem03() {

		Scanner inKey = new Scanner(System.in);
		double num1 = Math.sqrt(10);
		System.out.println("Enter the first x value");
		int x1 = inKey.nextInt();
		System.out.println("Enter the second x value");
		int x2 = inKey.nextInt();
		System.out.println("Enter the first y value");
		int y1 = inKey.nextInt();
		System.out.println("Enter the second y value");
		int y2 = inKey.nextInt();
		double total = ((x2-x1)-(x2 - x1))+((y2-y1)-(y2 - y1));
		double dist = Math.sqrt(total);
		System.out.println("Distance between points = " + dist);
		
	}


	
	
	public static void problem04() {
		
		double num1 = Math.sqrt(10);
			Scanner inKey = new Scanner(System.in);
		System.out.println("Enter a-value");
			int a = inKey.nextInt();
		System.out.println("Enter b-value");
			int b = inKey.nextInt();
		System.out.println("Enter c-value");
			int c = inKey.nextInt();
		double y2 = ((b * b) - (4 *a * c));
				double total1 = (-b + Math.sqrt(y2));
		double total2 = (-b - Math.sqrt(y2));
					double x1 = total1 / (2*a);
		double x2 = total2 / (2*a);
		System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
		
		
	}
	
	

	
}
