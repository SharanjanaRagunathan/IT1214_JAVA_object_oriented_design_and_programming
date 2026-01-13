public class Book{
	private String name;
	private double price
    private int quantity;
    private Author author;
}

public Book(String name, double price,Author author)
this.name = name;
this.price = price;
this.author = author;
this.quantity = 0;
}

public Book(String name, double price,Author author int quantity)
this.name = name;
this.price = price;
this.author = author;
this.quantity = quantity;
}

public String getName(){
	return name;
}

public Author getAuthor(){
	return author;
}

public double getPrice(){
	return price;
}
public int getQuantity(){
	return quantity;
}

public void sePrice(double price){
	this.price = price
}
public void setQuantity(int quantity){
	this.quantity = quantity
}
public String tostring(){
	
    return "Book Name: " + name + "\nAuthor Name: " + author.getName() + "\nEmail: " + author.getEmail() + "\nGender: " + author.getGender() + "\nPrice: " + price;
   }
	
}