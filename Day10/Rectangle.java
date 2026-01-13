/* 
Create a class Rectangle 
Attributes length, width
Method find_area(), find_perimeter()
create a rectangle object by passing length and width values */



class Rectangle{
	double length,width;
	
	Rectangle(double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	public void find_area()
	{
		System.out.println("Area is: "+length*width);
	}
	public void find_perimeter()
	{
		System.out.println("Parameter is: "+2*(length+width));
	}
	public static void main(String args[])
	{
		Rectangle obj1 = new Rectangle(20,10);
		obj1.find_area();
		obj1.find_perimeter();
	}
}