package Exceptionhandling;

public class throwexample2 {
	public static void test1() throws ClassNotFoundException
	{
		throw new ClassNotFoundException();
	}

	public static void main(String[] args)  {
		
try {
	test1();
} 
catch (ClassNotFoundException e) {
	
	e.printStackTrace();
}
	}

}
