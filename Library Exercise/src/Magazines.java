
 public class Magazines {

	//Fields/Attributes - describes object
    public int issuenum;
    public String author;
    public String brand;
    
	//Constructor - a state of object
 public Magazines(int issuenum, String author, String brand) {
	//super();
	
	this.issuenum = issuenum;
	this.author = author;
	this.brand = brand;
}
//Methods describes the behaviour
public void starreading() {
	System.out.println("read");
}

public String toString() {
	return "Books:" +" "+ issuenum +" "+ author +" "+ brand;

}

}