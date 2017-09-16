package week2.samplescripts;

import java.util.Scanner;

public class BasicJavaPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner (System.in);
		
		System.out.println("Enter your name:");
		String myName=in.nextLine();
		
		System.out.println("Enter you Age:");
		String myAge = in.nextLine();
		
		System.out.println("Enter you Address:");
		String myAddress=in.nextLine();
		
		System.out.println("Enter your Father name:");
		String fatherName=in.nextLine();
		
		System.out.println("Enter you Father Age:");
		String fatherAge = in.nextLine();
		
		System.out.println("Enter you Father Address:");
		String fatherAddress=in.nextLine();
		
		System.out.println("Enter your Mother name:");
		String motherName=in.nextLine();
		
		System.out.println("Enter you Mother Age:");
		String motherAge = in.nextLine();
		
		System.out.println("Enter you Mother Address:");
		String motherAddress=in.nextLine();
		
		System.out.println("My name is "+myName+ ", I am "+myAge+" Old. "+"My address is "+myAddress);
		System.out.println("My Father name is "+fatherName+ ", He is "+fatherAge+" Old. "+"His address is "+fatherAddress);
		System.out.println("My name is "+motherName+ ", She is "+motherAge+" Old. "+"Her address is "+motherAddress);
		in.close();
		
		
		

	}

}