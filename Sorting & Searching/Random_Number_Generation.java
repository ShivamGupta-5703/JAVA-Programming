package Sorting;

import java.util.Random;

public class Random_Number_Generation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//generate 10 random numbers between 10 and 90
		int start=10;
		int end=90;
		randnumber(start,end);
	}
	public static void randnumber(int start,int end) {
		Random rand = new Random();    //class to generate random number in java [using predefined numbers]
		
		int low = start;
		int high = end;
		for(int i=0;i<10;i++) {   //jitne number generate krne utni loop
			int rn = rand.nextInt(high-low+1) + low;
			// (high-low+1) - used to set range on which our function will work,because rand.nextInt gives IllegalArgumentException if bound<=0
			//then we add low to it.
			//Example with bound rand.nextInt() will generate a number between 0 and 80 ,then we add low =10 to bring it in range 10 to 90.
			System.out.println(rn);
		}
	}

}
 