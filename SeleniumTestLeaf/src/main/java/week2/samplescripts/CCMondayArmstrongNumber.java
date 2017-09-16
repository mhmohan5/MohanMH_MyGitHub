package week2.samplescripts;

//Program to find the armstrong number between 100 and 1000

public class CCMondayArmstrongNumber {

	public static void main(String[] args) {

		int n = 0;
		for(int i=100;i<=1000;i++)
		{
			int total = 0;
			int temp = 0;
			int cube = 0;
			n = i;
			while (n>0)
			{
				temp = n%10;
				cube =(temp*temp*temp);
				total = total + cube;
				n = n/10;
			}
			if (total == i)
				{
				System.out.println(i+" is a armstrong number");
				}
		}
	}
}
