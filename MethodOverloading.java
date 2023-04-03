package practice;

public class MethodOverloading {

		public static void sum (int a,int b)
		{
			System.out.println(a+b);
		}
		public static void sum(int a,int b,int c)
		{
			System.out.println(a+b+c);
	}
		public static void main(String args[])
		{
			sum(10,20);
			sum(10,20,30);
		}
		
}
