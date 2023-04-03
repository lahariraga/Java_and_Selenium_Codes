package practice;

public class ConstructorExample {
		
	ConstructorExample()
		{
			System.out.println("This is a constructor");
			
		}
		public void method()
		{
			System.out.println("This is a method");
		}

	public static void main(String[] args) {
		ConstructorExample obj = new ConstructorExample();
		obj.method();

	}

}
