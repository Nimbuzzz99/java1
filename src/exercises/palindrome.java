package exercises;
import java.util.*;

public class palindrome {

	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int r,sum=0,temp,evesum=0;     
      sc.close();
      temp=num;    
      while(num>0){    
       r=num%10; 
       if(r%2 == 0) {
    	   evesum+=r;
       }
       sum=(sum*10)+r;    
       num=num/10;    
      }    
      if(temp==sum)    
       System.out.println("palindrome number ");    
      else    
       System.out.println("not palindrome"); 
      
      if(evesum > 25) {
    	  System.out.println("Sum greater than 25");
      }
	}

}
