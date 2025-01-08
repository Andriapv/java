package inheritance;

public class Developer extends Employee {
	String emp2="Annliya";
	String designation2="developer";
	public void designation2()
	{
		System.out.println("the details of developer"+emp2+designation2);
		System.out.println();
	}
	

	public static void main(String[] args) {
		Developer developer=new Developer();
		developer.designation2();
		developer.details();

	}

}
