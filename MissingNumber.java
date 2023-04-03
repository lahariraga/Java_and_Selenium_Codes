package practice;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array1");
		int size = sc.nextInt();
		System.out.println("Enter the elements in the array1");
		int arr1[] = new int[size];
		for(int i=0;i<size;i++)
	    arr1[i] = sc.nextInt();
		int sum=0;
		{
			for(int i=0;i<arr1.length;i++)
				sum=sum+arr1[i];
			System.out.println("Sum of the elements in array 1 is:" +sum);
		}
		int sum1 = 0;
		{
		for(int i=0;i<=size;i++)
			sum1 = sum1+i;
		}
		System.out.println("Sum of the elements in array 1 is:" +sum);
		System.out.println("Missing element is:" +(sum1-sum));
		
	}

}
