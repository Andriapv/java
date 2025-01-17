package Exceptionhandling;

public class Test {
	public static void check(int age) throws  LicenceException
	{
		if(age<=18)
		{
			throw new  LicenceException("not eligible");
		}
		else
		{
			System.out.println("Eligible");
		}
	}

	public static void main(String[] args) {
		try {
			check(27);
		} catch (LicenceException e) {
			
			e.printStackTrace();
		}

	}

}
