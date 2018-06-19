package main.java.exercises;
import java.util.*;

public class Tomnjerry {

	public static String Looney(int num) {
		String str  = "";
		if(num>20&&num<30)
		{
			if(num%2==0)
			str = "jerry";
			else
			str = "Tom";	
		}
		else
			str = "Invalid Input";	
		
		return str;
	}

}
