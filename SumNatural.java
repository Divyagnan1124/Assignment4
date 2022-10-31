package fs;
import java.util.Scanner;
public class SumNatural {

    public static void main(String[] args) {
    	int num, sum=0;
        System.out.println("Enter an num :: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
       for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}


