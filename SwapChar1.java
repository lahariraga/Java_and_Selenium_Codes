package practice;

public class SwapChar1 {

	public static void main(String[] args) {
		String str = "Lahari";
		char[] ch =  str.toCharArray();
		char temp = ch[str.length()-4];
		System.out.println(ch[str.length()-4]);
		ch[str.length()-4] = ch[str.length()-6];
		ch[str.length()-6] = temp;
		System.out.println(ch);

	}

}
