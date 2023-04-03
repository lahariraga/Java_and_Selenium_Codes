package practice;

import java.util.Scanner;

public class MinArray {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size = sc.nextInt();
	System.out.println("Enter the values of the array");
	int arr[] = new int[size];
	for(int i=0;i<size;i++)
		arr[i] = sc.nextInt();
	int min=arr[0];
	{
		for(int i=0;i<arr.length;i++)
			if(arr[i]<min)
			{
				min = arr[i];
			}
	}
	System.out.println("Minimum number in the array is: " +min);
			
	

	}

}
