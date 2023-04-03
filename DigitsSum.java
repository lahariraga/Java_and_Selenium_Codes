package practice;
import java.util.*;
public class DigitsSum {

	public static void main(String[] args) {
		int rem,sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
        while(num>0)
        {
        	rem=num%10;
        	sum=sum+rem;
        	num=num/10;
        }
        System.out.println("Sum of the digits is:" +sum);
	}

}
