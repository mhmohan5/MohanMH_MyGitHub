package week1.sampleScripts;

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter the arithmetic operation to be performed :");
		System.out.println("Add or Subtract or Multiply or Divide");
		String operation = sc.next();
		int ans;
		switch(operation)
		{
			case "Add":
				ans = a+b;
				System.out.println("Addition of 2 numbers is "+ans);
				break;
			case "Subtract":
				ans = a-b;
				System.out.println("Subtraction of 2 numbers is "+ans);
				break;
			case "Multiply":
				ans = a*b;
				System.out.println("Multiplication of 2 numbers is "+ans);
				break;
			case "Divide":
				ans = a/b;
				System.out.println("Division of 2 numbers is "+ans);
				break;
			default:
				System.out.println("Invalid Option");
				break;	
		}
		sc.close();
	}

}
