package main.java.exercises;
import java.util.*;

public class palindrome {

	public static boolean[] palin(int num) {
      int r,sum=0,temp,evesum=0;     
      temp=num;  
      boolean res[] = new boolean[2];
      while(num>0){    
	       r=num%10; 
	       if(r%2 == 0) {
	    	   evesum+=r;
	       }
	       sum=(sum*10)+r;    
	       num=num/10;    
	      }
      if(temp==sum)    
           res[0] = true;    
      else    
           res[0] = false;
      
      if(evesum > 25) {
    	  res[1] = true;
      }
      
      return res;
	}
	
	public static boolean[] palin(String str) {
		boolean res[] = new boolean[2];
		res[0] = false;
		System.out.println("invalid input");
		return res;
	}
	 
}
