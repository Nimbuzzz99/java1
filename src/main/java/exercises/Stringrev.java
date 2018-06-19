package main.java.exercises;
import java.util.*;

public class Stringrev {

	public static String revstr() {
		String str="london";
		String rev = "";
		System.out.println("The original string is "+str);
		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
			
		}
	    return rev;
	}

}
