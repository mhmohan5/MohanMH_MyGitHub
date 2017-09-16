package week2.samplescripts;

import java.util.Scanner;

public class BasicJavaProgramsusingfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner (System.in);
		
		String myName;
		String myAge;
		String myAddress;
		
		for (int i = 1; i <= 3; i++)
		{
			System.out.println("Enter your name:" +i );
			myName = in.nextLine();
			
			System.out.println("Enter you Age:");
			myAge = in.nextLine();
			
			System.out.println("Enter you Address:");
			myAddress = in.nextLine();
			
			System.out.println(myName + myAge + myAddress);

		}
		
	in.close();		

	}

}