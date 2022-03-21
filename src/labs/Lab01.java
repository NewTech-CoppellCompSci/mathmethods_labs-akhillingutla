package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		
		Scanner x = new Scanner(System.in);
		System.out.println("Type 2 positive integers!");

		int num = x.nextInt();
		int num2 = x.nextInt();

		double power = Math.pow(num, num2);

		System.out.println(power);
		
	}
	
	
	
	
	public static void problem02() {
		
		Scanner x = new Scanner(System.in);
		System.out.println("Enter a positive number:");
		int num = x.nextInt();

		double y = Math.sqrt(num);
		System.out.println("The square root of " + num + " is " + y);

		
	}

	
	

	public static void problem03() {
		
		Scanner x = new Scanner(System.in);
		System.out.println("Type the sides of a triangle");
		int A = x.nextInt();
		int B = x.nextInt();

		int num = A*A;
		int num2 = B*B;

		int sum = num + num2;

		double y = Math.sqrt(sum);

		System.out.println("Hypotenuse = " + y);


		

	}


	
	
	public static void problem04() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.print("enter an integer: ");

		int x = inKey.nextInt();
		int max = x;
		int min = x;

		while (x != 0) {

		System.out.print("Enter an integer: ");
		x = inKey.nextInt();
		max = Math.max(max, x);
		min = Math.min(min, x);
		}


		System.out.println("Max = " + max  + " || Min = "+  min);
		
	}
	
	
	
	
	
	
}
