package inheritance;

public class Puppy extends Dog {
	String name="twinkle";
	public void puppy()
	{
		System.out.println("Welcome, say hi to puppy");
	}

	public static void main(String[] args) {
		Puppy ob=new Puppy();
		ob.animal();
		ob.dog();
		ob.puppy();
		System.out.println(ob.name);
		
	
		

	}

}
