package Interface;

public class Triangle implements Shape {
	public void draw() {
		System.out.println("Draw triangle");
		
	}

	public static void main(String[] args) {
		Shape obj=new Triangle();
		obj.draw();
		

	}

}
