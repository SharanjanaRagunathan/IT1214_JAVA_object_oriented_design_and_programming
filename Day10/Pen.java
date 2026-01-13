/*  Create a class pen
Pen has attributes colour and type (gel/ballpoint)
and a method write()
Create a parameterized constructor
Create two objects of pen class ob1:blue   gel  ob2:red ballpoint		*/

class Pen{
	String colour,type;
	
	Pen( String colour,String type)
	{
		this.colour=colour;
		this.type=type;
		
	}
	public void write()
	{
		
	}
	public static void main(String args[])
	{
		Pen obj1 = new Pen("blue","gel");
		System.out.println("Pen colour is: "+obj1.colour);
		System.out.println("Pen type is: "+obj1.type);
	}
}