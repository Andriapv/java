package inheritance;

public class Tester extends Employee {
	String name="annliya";
	String designation="tester";
	public void designation()
	{
		System.out.println("the details of tester"+name+designation);
		
	}
	

	public static void main(String[] args) {
		Tester tester=new Tester();
		tester.designation();
		tester.details();
		
		
	}

}
