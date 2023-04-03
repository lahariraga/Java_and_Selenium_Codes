package practice;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			int data = 100/0;
		}
       catch(ArithmeticException e) {
    	   System.out.println(e);
       }
		
		try {
			String s = null;
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		try {
			String s1 = "Raga";
			System.out.println(s1.charAt(6));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		finally {
		System.out.println("Rest of the code");
	}

}
}