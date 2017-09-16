package week2.samplescripts;

import java.util.Scanner;

public class NameAgeAddressInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter your name:");
		Scanner in=new Scanner (System.in);
		String input=in.nextLine();
		System.out.println("The entered name is:" +input);
		in.close();
		

	}

}