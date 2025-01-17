package Interface;

public class Childinterface implements Sampleinterface {

	public static void main(String[] args) {
		Sampleinterface obj= new Childinterface();
		obj.show();
		obj.print();
		
	}

	@Override
	public void print() {
		System.out.println(NUM);
		
	}

	@Override
	public void show() {
		System.out.println(VALUE);
		
	}

}
