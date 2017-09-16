package week1.sampleScripts;

import java.util.Scanner;

public class FactorialWhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find the factorial");
		int n = sc.nextInt();
		int fact =1;
		int i=1;
		while(i<=n)
		{
			int temp = i+1;
			fact = fact*temp;
			i = i+1;
		}
		System.out.println("FactorialForLoop of the entered number is "+fact);
		sc.close();
	}

}