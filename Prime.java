package fs;

import java.util.Scanner;

public class Prime {

	  public static void main(String[] args) {

	    int num;
        System.out.println("Enter an num :: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; ++i) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	  }
	}