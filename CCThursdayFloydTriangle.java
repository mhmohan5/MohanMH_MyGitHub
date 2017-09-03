/*Psudeocode:
1. Get the number of lines to be printed in floyd triangle - n
2. use nested for loop to print the numbers till the number of rows mentioned
3. initialize the number(num) to be printed to 1 and 2 variables(i andj) used in the loop as also 1
4. first for loop condtion is i=1;i<=n;i++
5. nested for loop condtion is j=1;j<=i;j++
6. so here, the numbers in the same line will be printed by the innermost for loop, increment the num in each iteration , use system.print()
7. Number of lines will be handled by the outer for loop, use system.println() to move the control to the next line after each iteration*/

package week2.samplescripts;

import java.util.Scanner;

public class CCThursdayFloydTriangle {

	public static void main(String[] args) {
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of rows in Floyd Triangle");
	n = sc.nextInt();
	int num = 1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(num+" ");
			num++;
		}
		System.out.println();
	}
	sc.close();
	}

}
