/*Pseudocode:
	Step1:
		Get a number which needs to be checked whether it is palindrome or not
			input n
		Create a new varible as original number and assign it as n
	Step2:
		check whether number is greater than 0  and then proceed with the validation loop 
	Step3:
		write the login inside while loop
	Step4:
		Declare a temporary_variable1 to save the reminder when the input number is divided by 10
		Declare a revesed_variable and initialize to zero 
	Step5:
		Below part to be in while loop with n>0 condition
		-Divide the input number by 10 and save the quotient in another temporary varible1
			temp1 = n%10
		-multiply the reversed varible with 10 and add it with quotient of previous step
			reversed_variable = (reversed_variable * 10) + temp1
		-divide n with 10 and save the quiotent in n
		Loop continues until n > 0
	Step 6
		compare the reversed variable and original varible. If both are equal print the variable as palindrome. 
		If the condition fails, print the entered number is not a palindrome*/
	
package week1.sampleScripts;

import java.util.Scanner;

public class PalindromeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, temp, reversenum =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked whether it is Palindrome or not");
		n = sc.nextInt();
		int originalnum = n ;
		while (n>0)
		{
			temp = n%10;
			reversenum = (reversenum*10)+temp;
			n = n/10;
		}
		if (reversenum==originalnum)
			System.out.println("Entered number : "+originalnum+" is a Palindrome Number");
		else
			System.out.println("Entered number : "+originalnum+" is not a Palindrome Number");
		sc.close();
	}

}
