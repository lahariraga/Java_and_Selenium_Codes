package practice;

class Jan
{
	public void roi()
	{
		System.out.println("5.6%");
	}
}

class Feb extends Jan
{
	public void roi()
	{
		System.out.println("6.8%");
	}
}

class Mar extends Feb
{
	public void roi()
	{
		System.out.println("6.99%");
	}
}



public class MethodOverridingCurrentMonth extends Mar{
		public void roi()
		{
			System.out.println("2.44");
		}
	public static void main(String[] args) {
		//MethodOverridingCurrentMonth obj = new MethodOverridingCurrentMonth();
		Mar obj = new Mar();
		obj.roi();

	}

}
