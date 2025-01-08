package superkeyword;

public class Child extends Parent {
	String color="white";
	public Child()
	{
		super("hello");
		System.out.println("child contructor");
		
	}
	public void show()
	{
		super.show();
		System.out.println("child class");
		System.out.println(color);
		System.out.println(super.color);
	}

	public static void main(String[] args) {
		Child child=new Child();
		child.show();
		
		
	}

}
