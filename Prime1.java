package practice;

import java.util.Scanner;

public class Prime1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int count = 0;
		if(num>1)
		{
			for(int i=0;i<=num;i++)
			{
				if(num%i==0)
					count++;
			}
			if(count==2)
			{
				System.out.println("Prime");
			}
			else
			{
				System.out.println("Not Prime");
			}}
			else
			{
				System.out.println("Not Prime");
			}}
		
			
}
