package Exceptionhandling;

public class Throw 
{
	public static void add(int a,int b)
	{
		int sum=a+b;
	
	if(sum<50)
	{
		throw new ArithmeticException ("Exception occured");
		
	}
	else
	{
		System.out.println("rest code");
	}

}
	public static void main(String[] args)
	{
		try
		{
			add(10,30);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("balance");
	}
}