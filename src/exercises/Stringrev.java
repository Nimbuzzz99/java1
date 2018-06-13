package exercises;
import java.util.*;

public class Stringrev {

	public static void main(String[] args) {
		String str="london";
		String rev = "";
		System.out.println("The original string is "+str);
		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
			
		}
		System.out.print("The reversed string is: "+rev);
	}

}
