package fs;

import java.util.Scanner;

public class pn {
	 public static void main(String[] args) {

		  
		  int num, count;
	      System.out.println("Enter an num :: ");
	      Scanner sc = new Scanner(System.in);
	      num = sc.nextInt();

		  for (int i = 1; i <= num; i++) {
		   count = 0;
		   for (int j = 2; j <= i / 2; j++) {
		    if (i % j == 0) {
		     count++;
		     break;
		    }
		   }

		   if (count == 0) {
		    System.out.println(i);
		   }

		  }
		 }

}
