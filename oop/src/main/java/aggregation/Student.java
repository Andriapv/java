package aggregation;

public class Student {
	String name;
	int rollnumber;
	Address add;
	public Student(String name,int rollnumber,Address add)
	{
		this.name=name;
		this.rollnumber=rollnumber;
		this.add=add;
	}
	public void display()
	{
		
		System.out.println("Name :"+name);
		System.out.println("Roll number :"+rollnumber);
		System.out.println("housename :"+add.housename);
		System.out.println("city :"+add.city);
		System.out.println("house number :"+add.pincode);
		System.out.println("house number :"+add.housenumber);
	}
	public static void main(String[] args) {
		Address obj=new Address("obsqura","ernakulam",123,682509);
		Student obj1=new Student("Ann",12,obj);
		obj1.display();
		
		
	}

}
