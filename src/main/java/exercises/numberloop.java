package main.java.exercises;
import java.util.*;

public class numberloop {

	public static String loop() {
		int num;
		String loop = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the upper limit number:");
		num=sc.nextInt();
		sc.close();
		for(int i=1;i<=num;i++)
		{
			for(int j=0;j<i;j++)
			{
				loop+= i;
			}
		}
        return(loop);
	}

}
