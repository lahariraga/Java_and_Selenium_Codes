package practice;

public class PalindromeString {

	public static void main(String[] args) {
		String str= "Madame";
		// String newstring = str;
		 String reverseStr = "";	
		int len=str.length()-1;
	    for (int i = len; i >=0; i--) 
		{
	    	reverseStr = reverseStr+str.charAt(i);
		}
	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) 
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}

}
