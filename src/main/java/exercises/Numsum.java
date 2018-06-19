package main.java.exercises;
import java.util.*;


public class Numsum {

	public static int numsumact() {
		int n,sum=0;
		int num = 0;
		System.out.println("Enter the number of inputs:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("Enter the inputs:");
		for(int i=0;i<n;i++)
		{
			num =sc.nextInt();
			sum+=num;
			
		}
		sc.close();
		return sum;
	}

}
