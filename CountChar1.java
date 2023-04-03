package practice;

public class CountChar1 {

	public static void main(String[] args) {
	String str = "Raga is a good girl";
	char ch  = 'a';
	int count = 0;
	int len = str.length();
	for(int i = 0; i<len;i++)
	{
	if(str.charAt(i)==ch)
	count++;
	}
		System.out.println(count);
	}
			
}
