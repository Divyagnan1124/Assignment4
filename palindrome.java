package fs;

import java.util.Scanner;

public class palindrome { 
		 public static void main(String args[]){  
		  int r,sum=0,temp;    
		  
		  int n;
	        System.out.println("Enter an num :: ");
	        Scanner sc = new Scanner(System.in);
	        n = sc.nextInt();
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
}
	

