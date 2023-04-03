package practice;
import java.util.*;
public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		String str1 = str.replaceAll("\\s", ""); 
		System.out.println(str1);

	}

}
