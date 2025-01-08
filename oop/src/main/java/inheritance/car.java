package inheritance;

public class car extends vechicle {
	String name="BMW";
	public void mileage()
	{
		System.out.println("mileage");
	}

	public static void main(String[] args) {
		car obj=new car();
		obj.speed();
		obj.mileage();
		System.out.println(obj.name);
		System.out.println(obj.noofwheel);
		

	}

}
