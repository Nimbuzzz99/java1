package exercises;
import java.util.*;

public class Tomnjerry {

	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number");
		num=input.nextInt();
		input.close();
		if(num>20&&num<30)
		{
			if(num%2==0)
			System.out.println("Jerry");
			else
			System.out.println("Tom");	
		}
		else
			System.out.println("Number invalid");
	}

}
