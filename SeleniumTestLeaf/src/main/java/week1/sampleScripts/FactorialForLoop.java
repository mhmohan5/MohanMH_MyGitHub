package week1.sampleScripts;

import java.util.Scanner;

public class FactorialForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find the factorial");
		int n = sc.nextInt();
		int fact =1;
		for (int i=1;i<=n;i++)
		{
			int temp = i+1;
			fact = fact*temp;
		}
		System.out.println("FactorialForLoop of the entered number is "+fact);
		sc.close();
	}

}
