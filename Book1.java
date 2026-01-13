//question 1 
class Book {
	private String book_id;
	private String title;
	private double price;
	
	
	//setter
	public void setBookId(String book_id){
		this.book_id = book_id;
		
	}
	public void setTitle (String title){
		this.title = title;
	}
	public void setprice(double price){
		if (price > 0) 
		{
			this.price = price;
		}
		else {
			System.out.println("The price cannot be negetive, Keep the price unchanged");
			
		}	
		
	}
	
	//getter
	public String getBookId(){
		return book_id;
	}
	
	public String getTitle(){
		return title;
	}
	public double getPrice() {
		return price;
		
	}
	
	public static void main(String args[]) {
		Book book1 = new Book();
		book1.setBookId("bk1");
		book1.setTitle("Madol Doova");
		book1.setprice(-850);
		System.out.println("The price is : " + book1.getPrice());
	}
}

//question 2
class Employee {
private String empName;
private int empId;

//getter
public String getempName(){
	return this.empName;
}

public int getempId() {
	return this.empId;
}

//setter
public void setempName(String empName){
	this.empName = empName;
	
}
public void setempId (int empId)
{
	this.empId = empId;
}


//constructors
//default constructor
public Employee(){
	
}

public Employee(String empName) {
	this.empName = empName;
}
public Employee (int empId) {
	this.empId = empId;
	
}
public Employee(String empName, int empId){
	this.empName= empName;
	this.empId = empId;
}

public static void main(String args[]) {
	
	Employee employee1 = new Employee();
	employee1.setempName("Sharanjana");
	employee1.setempId(678);
	System.out.println("Employee 1 name : " + employee1.getempName());
	System.out.println("Employee 1 id : " + employee1.getempId());
	
	
}
}