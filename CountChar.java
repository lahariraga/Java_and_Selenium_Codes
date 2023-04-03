package practice;

public class CountChar {

	public static void main(String[] args) {
		String str = "raga is a good girl";
		int len1 = str.length();
		char c ='a';
		String rep = str.replaceAll("a", "");
		System.out.println(rep);
		int len2 = rep.length();
		
		int count = len1-len2;
		System.out.print(count);

	}

}
