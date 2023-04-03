package practice;

class Grandparent {
	
	public void gold()
	{
		System.out.println("Gold");
	}
}

class Parentss extends Grandparent {
	
	public void shares()
	{
		System.out.println("Shares");
	}
}

public class Multilevelinheritance extends Parentss{

	public void assets()
	{
		System.out.println("Assets");
	}
	public static void main(String[] args) {
		Multilevelinheritance obj = new Multilevelinheritance();
		obj.gold();
		obj.shares();
        obj.assets();
	}

}
