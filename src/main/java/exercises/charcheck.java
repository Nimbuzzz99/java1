package main.java.exercises;
import java.util.*;

public class charcheck {

	public static String casecheck(char lett) {
		String s = "";
		System.out.println("Enter the charecter");
		if(lett>='a'&&lett<='z')
			s = "LowerCase";
		else if(lett>='A'&&lett<='Z')
			s = "UpperCase";
		else if(lett>='0'&&lett<='9')
			s = "number";
		else
			s = "SpecialCharater";
	    
		return s;
	}

}
