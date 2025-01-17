package Interface;
public  class Child implements Interface1,Interface2
{
	public void print() 
	{
		System.out.println("The value"+MAX_VALUE);
	}
	public void show() 
	{
		System.out.println("The value "+MIN_VALUE);
		
	}


	public static void main(String[] args) {
		Child c=new Child();
		c.show();
		c.print();
		
		
	}

}
