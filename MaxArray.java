package practice;

import java.util.Scanner;

public class MaxArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		System.out.println("Enter the values of elements in the array");
		int	arr[] = new int[size];
		for(int i=0;i<size;i++)
			arr[i] = sc.nextInt();
		int max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		System.out.println("Maximum array is:" +max);
			

	}

}
