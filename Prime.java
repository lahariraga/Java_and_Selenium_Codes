package practice;

public class Prime {

	public static void main(String[] args) {
	int num=7;
	int count=0;
	if(num>1)
	{
		for(int i=0;i<=num;i++)
		{
			if(num%i==0)
				count++;
		}
		if(count==2)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}}
		else
			{
			System.out.println("Not Prime");
			}}
	}

