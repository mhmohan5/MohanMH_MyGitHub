package week1.sampleScripts;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    if(n%2==0)
    	System.out.println("This is NOT a ODD Number");
    else
    	System.out.println("This is a ODD Number");
    sc.close();
	}
}
