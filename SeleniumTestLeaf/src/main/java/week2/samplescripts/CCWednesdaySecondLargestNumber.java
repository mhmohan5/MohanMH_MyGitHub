/*Psuedocode:
	1. intialise the array
	2. use the sort method in java util to sort the array in ascending order
	3. get the array size and decrement by 1 to find the last item index and decrement by 2 to get the last before item index
	4. print the second largest number by using the last before index in the array since we have sorted in ascending order*/
	
package week2.samplescripts;

import java.util.Arrays;

public class CCWednesdaySecondLargestNumber {

	public static void main(String[] args) {
		int[] intarray = {-1,-4,-5,-6,-11,-66};

		Arrays.sort(intarray);
		int arraysize = intarray.length;
		int lastindex = arraysize-1;
		int lastbeforeindex = lastindex -1;
		int secondlargestnum = intarray[lastbeforeindex];
		System.out.println("Largest number is "+intarray[lastindex]);
		System.out.println("Second Largest number is "+secondlargestnum);

	}

}
