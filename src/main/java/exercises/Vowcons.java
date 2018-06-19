package main.java.exercises;
import java.util.*;

public class Vowcons {

	public static String VoCo(String str) {
	char letter;
	String s = "";
	for(int i=0;i<str.length();i++)
	  {
		letter=Character.toLowerCase(str.charAt(i));
		if(letter>='a'&&letter<='z')
		{
			if(letter == 'a' ||letter == 'e'||letter == 'i'||letter == 'o'||letter == 'u') {
				s+="vowel";
			}
			else {
				s+="consonent";
			}
		}
		else
		{
		    s+="invalid";
			
		}
	  }
	return s;
	}

}
