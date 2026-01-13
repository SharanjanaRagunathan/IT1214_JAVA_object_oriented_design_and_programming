/*
 Create a class circle
Ateibutes radius
Method Find_area(), find_perimeter()
create a circle object by passing radius 
PI : Math.PI (Constant in the math class in java)		*/


class Circle
{
	double radius;
	
	Circle(double radius)
	{
		this.radius=radius;
	}
	public void find_area()
	{
		System.out.println("Area is: "+Math.PI*(radius*radius));
	}
	public void find_perimeter()
	{
		System.out.println("Parameter is: "+2*Math.PI*radius);
	}
	public static void main(String args[])
	{
		Circle obj1 = new Circle(7);
		obj1.find_area();
		obj1.find_perimeter();
	}
}