package practice;

public class SwapWithoutThirdVar {

	public static void main(String[] args) {
	int a=10;
	int b=20;
	System.out.println("The values before swapping are " +a +"and" +b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("The values after swapping are " +a +"and" +b  );


	}

}
