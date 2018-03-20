
public class Books {

	//Fields/Attributes - describes object
    public int booknum;
    public String author;
    public String brand;
    
	//Constructor - a state of object
public Books(int booknum, String author, String brand) {
	//super();
	
	this.booknum = booknum;
	this.author = author;
	this.brand = brand;
}
//Methods describes the behaviour
public void starreading() {
	System.out.println("read");
}

public String toString() {
	return "Books:" +" "+ booknum +" "+ author +" "+ brand;

}

public String getBrand() {
	return brand;
}
}


