package practice;

public class RemoveSpecialCharsString {

	public static void main(String[] args) {
		String s = "^#$%&$&$&&Ra^#$ga^%$Lahari";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
