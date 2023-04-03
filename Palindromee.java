package practice;

public class Palindromee {

	public static void main(String[] args) {
		String str = "Madame";
		String revstring = "";
		int len = str.length()-1;
		for(int i=len;i>=0;i--)
		{
			revstring = revstring+str.charAt(i);
			
		}
		if(str.toLowerCase().equals(revstring.toLowerCase()));
		{
			System.out.println("Reverse String");
		}
		else
		{
			System.out.println("Not Reverse String");
		}
	}

}
