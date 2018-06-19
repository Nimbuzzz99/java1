package main.java.exercises;
import java.util.*;

public class Numsort {

	public static int[] sortNum(int num) {
		int n,temp;
		int []arr=new int[5];
		n=num;
		for(int i=0;n>0;i++)
		{
			arr[i]=n%10;
			n=n/10;
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]>arr[i])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}

}
