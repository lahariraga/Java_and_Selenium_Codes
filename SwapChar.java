package practice;

public class SwapChar {

	public static void main(String[] args) {
		String str = "Lahari";
		System.out.println(str.length());
		char[] ch = str.toCharArray();
	
		char temp = ch[str.length()-1];
		//System.out.println(ch[str.length()-1]);
		ch[str.length()-1] = ch[str.length()-2];
		//System.out.println(ch[str.length()-2]);
		ch[str.length()-2] = temp;
		//System.out.println(temp);
		
		System.out.println(ch);

	}

}
