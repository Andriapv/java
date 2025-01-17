package Interface;

public class Circle implements Shape {
	public void draw() {
		System.out.println("Draw circle");
		
	}

	public static void main(String[] args) {
		Shape obj1=new Circle();
		obj1.draw();

	}

}
