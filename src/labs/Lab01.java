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
	//Scanner input 

		int num = x.nextInt();
		int num2 = x.nextInt();
// gets to integers from the input
		double power = Math.pow(num, num2);
//gets the power of the second number from first
		System.out.println(power);
		
	}
	
	
	
	
	public static void problem02() {
		
		Scanner x = new Scanner(System.in);
		System.out.println("Enter a positive number:");
		int num = x.nextInt();
// gets an integer input from the user
		double y = Math.sqrt(num);
		//square roots the input
		System.out.println("The square root of " + num + " is " + y);

		
	}

	
	

	public static void problem03() {
		
		Scanner x = new Scanner(System.in);
		System.out.println("Type the sides of a triangle");
		int A = x.nextInt();
		int B = x.nextInt();
		//gets 2 integer inputs from user

		int num = A*A;
		int num2 = B*B;
//multiplies both integers by itself
		int sum = num + num2;
//sums up those products
		double y = Math.sqrt(sum);
//then square roots the total sum of products.
		System.out.println("Hypotenuse = " + y);


		

	}


	
	
	public static void problem04() {
		
		Scanner inKey = new Scanner(System.in);
		System.out.print("enter an integer: ");
// gets an integer from user
		int x = inKey.nextInt();
		int max = x;
		int min = x;
		
		//sets a maximum and minimum with users input

		while (x != 0) {
// x cannot equal 0
		System.out.print("Enter an integer: ");
		x = inKey.nextInt();
		max = Math.max(max, x);
		min = Math.min(min, x);
		}
// you ask for another integer and then set the original integer to its aximum and minimum.

		System.out.println("Max = " + max  + " || Min = "+  min);
		
	}
	
	
	
	
	
	
}
