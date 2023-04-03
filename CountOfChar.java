package practice;

import java.util.Scanner;

public class CountOfChar {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		int len = str.length();
		String str1 = str.replace("a", "");
		int len1 = str1.length();
		System.out.println("Number of occurences of a is:" +(len-len1));

	}

}
