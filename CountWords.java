package practice;
import java.util.*;
public class CountWords {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter the sentence");
        String str=sc.nextLine();
        String parts[] = str.split(" ");
        int len=parts.length;
        System.out.println(len);
	}

}
