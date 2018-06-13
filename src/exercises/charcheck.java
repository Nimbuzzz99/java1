package exercises;
import java.util.*;

public class charcheck {

	public static void main(String[] args) {
		String s;
		System.out.println("Enter the charecter");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		sc.close();
		char lett=s.charAt(0);
		if(lett>='a'&&lett<='z')
			System.out.println("Lowercase");
		else if(lett>='A'&&lett<='Z')
			System.out.println("Uppercase");
		else if(lett>='0'&&lett<='9')
			System.out.println("Number");
		else
			System.out.println("Special Charecter");
	
	}

}
