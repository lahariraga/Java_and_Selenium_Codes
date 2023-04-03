package practice;


class superr
{
	int a=20;
void display()
{
	System.out.println("superrvalue");
}
}
public class SuperChild extends superr 
{
	int a=40;
	void display()
	{
		System.out.println("SuperChildValue");
	System.out.println(a);
    //System.out.println(super.a);
	}
}
