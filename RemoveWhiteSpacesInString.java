package practice;

public class RemoveWhiteSpacesInString {

	public static void main(String[] args) {
		String str = "Raga is very kind and sweet  and she louss to listen to musiccc";
		str=str.replaceAll("\\s", "");
		System.out.println(str);

	}

}
