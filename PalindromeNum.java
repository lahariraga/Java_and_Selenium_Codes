package practice;
import java.util.*;
public class PalindromeNum {

	public static void main(String[] args) {
	int rem,sum=0;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
	int reversenum=num;
	while(num>0)
	{
		rem=num%10;
		sum=sum*10+rem;
		num =num/10;
	}
if(reversenum==sum)
{
	System.out.println("Number is Palindrome");
}
else
{
	System.out.println("Number is not Palindrome");
}
	}

}
