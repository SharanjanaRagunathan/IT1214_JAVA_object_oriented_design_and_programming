//Example 1:Loop through each character of a string using for loop
class Charloop1{
	public static void main(String[] args){
	
	//create a string
	String name="IT1214_OOP";
	
	System.out.println("Characters in " + name + "are:");
	
	//loop through each element
	for(int i=0; i<name.length(); i++){
	
	//access each character
	char a= name.charAt(i);
	System.out.print(a + ", ");
	}
}
}