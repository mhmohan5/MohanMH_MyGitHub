package week1.sampleScripts;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		int n = sc.nextInt();
		int i,m=0,flag=0;    
        m=n/2;    
        for(i=2;i<=m;i++)
        {    
            if(n%i==0)
            {    
                System.out.println("Entered number is not a PRIME NUMBER");   
                flag=1;    
                break;    
            }    
        }    
        if(flag==0)    
        System.out.println("Entered number is a PRIME NUMBER");  
        sc.close();
	}

}
