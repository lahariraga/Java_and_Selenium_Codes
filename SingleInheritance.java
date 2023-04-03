package practice;

 class Parent
{
	public void gold()
	{
		System.out.println("Gold");
	}
}
public class SingleInheritance extends Parent{
	
        public void money()
{
	System.out.println("Money");
}
	
	public static void main(String[] args) {
		SingleInheritance obj = new SingleInheritance();
		obj.money();
		obj.gold();

	}
}
