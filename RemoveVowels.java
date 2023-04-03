package practice;
import java.util.*;
public class RemoveVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		String str1 = str.replaceAll("[AEIOUaeiou]", "");
		System.out.println(str1);
	}

}
