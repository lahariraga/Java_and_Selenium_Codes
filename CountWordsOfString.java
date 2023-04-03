package practice;

import java.util.Scanner;

public class CountWordsOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		//int len = str.length();
		int count = 1;
		
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' '))
				count++;
		}
		
    System.out.println("Number of words in a string are" +count);
	}

}
