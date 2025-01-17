package Accessmodifier1;
public class Exam 
{
	protected String subject="Maths";
	 protected void test()
	{
		System.out.println("Subject :"+subject);
	}
	public static void main(String args[])
	{
		Exam e=new Exam();
		System.out.println(e.subject);
		e.test();
	}

}