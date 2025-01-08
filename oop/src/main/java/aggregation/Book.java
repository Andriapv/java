package aggregation;

public class Book {
    String publication;
    Author details;
    public Book(String publication,Author details)
    {
    	this.publication=publication;
    	this.details=details;
    	
    }
    public void display()
    {
    	System.out.println("publication"+publication);
    	System.out.println("Name of author :"+details.name);
    	System.out.println("name of the book"+details.book);
    }
	public static void main(String[] args) {
		Author obj=new Author("abc","cd");
		Book obj1=new Book("hc",obj);
		obj1.display();
		

	}

}
