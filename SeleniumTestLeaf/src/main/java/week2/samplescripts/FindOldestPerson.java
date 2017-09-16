package week2.samplescripts;

import java.util.Scanner;

public class FindOldestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		
		
		System.out.println("Enter the number of persons");
		String numpeople = in.nextLine();
		int count = Integer.parseInt(numpeople);
		
		
		String[] names = new String[count];
		String[] age = new String[count];
		String[] bloodgp = new String[count];
		
		for(int i=0;i<count;i++)
		{
			System.out.println("Enter the name "+ (i+1) +" : ");
			names[i]=in.nextLine();
			System.out.println("Enter the age "+ (i+1) + " : ");
			age[i]=in.nextLine();
			System.out.println("Enter the blood group "+ (i+1) +" : ");
			bloodgp[i]=in.nextLine();			
		}
		
		for(int i=0;i<count;i++)
		{
			System.out.println("Entered name "+ (i+1) +" is : "+names[i]);
			
			System.out.println("Entered age "+ (i+1) + " is : "+age[i]);
			
			System.out.println("Entered blood group "+ (i+1) +" is : "+bloodgp[i]);
						
		}
	
		int[] tempage=new int[count];
		for (int i=0; i<count; i++)
		{
			tempage[i]=Integer.parseInt(age[i]);
		}
		
		int oldestPersonIndex=0;
		int oldestPersonAge=tempage[0];
		
		for (int i=1;i<count;i++)
		{
			if (tempage[i] > oldestPersonAge)
			{
				oldestPersonIndex=i;
				oldestPersonAge=tempage[i];
				
			}
			
		}
		
		System.out.println("The person " + names[oldestPersonIndex] + " is the oldest with the age :" + tempage[oldestPersonIndex]);
		
		in.close();
		

	}

}