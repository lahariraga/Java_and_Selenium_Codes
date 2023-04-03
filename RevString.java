package practice;

public class RevString {

	public static void main(String[] args) {
	String str="Java is a an oops language";
	int len=str.length()-1;
	System.out.println(str.length()-1);
	for(int i=len;i>=0;i--)
	{
		System.out.print(str.charAt(i));
	}

	}

}
