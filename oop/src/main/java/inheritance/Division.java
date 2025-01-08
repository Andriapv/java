package inheritance;

public class Division extends Addition 
{
	public void div(int a,int b)
	{
	float result=super.add(a,b);
	
	if(result % 10 ==0)
	{
		System.out.println("It is divisible by 10 and the sum is :"+result);
	}
	else
	{
		System.out.println("It is not divisible by 10 and the sum is :"+result);
	}
	}

	public static void main(String[] args) {
		 Division division=new  Division();
		 division.div(15, 25);
		 division.div(16, 2);
		 

	}

}
