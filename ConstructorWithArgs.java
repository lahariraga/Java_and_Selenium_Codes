package practice;

public class ConstructorWithArgs {

	int a; int b;
	
	ConstructorWithArgs(int m1,int m2)
	{
		a=m1;
		b=m2;
	}
	void total()
	{
		System.out.println(a+b);
	}
	void avg()
	{
		System.out.println(a+b/2);
	}	
	
	public static void main(String[] args) {
		ConstructorWithArgs obj = new ConstructorWithArgs(50,50);
		obj.avg();
		obj.total();

	}

}
