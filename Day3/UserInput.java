/*Write Java code that utilizes the Scanner class to obtain user input for the following data types: 
integer (age), double, boolean, string (name), and character (single or not). Make sure to prompt the 
user for each input and display the entered values.*/

import java.util.Scanner;

public class UserInput{
	public static void main(String[] args){
		Scanner reader= new Scanner(System.in);
		
		System.out.print("Enter your Age: ");
		int age = reader.nextInt();
		System.out.println("Your age is "+age);
		
		System.out.print("Enter a double value: ");
		double Dvalue = reader.nextDouble();
		System.out.println("The Value is: "+Dvalue);
		
		System.out.print("Enter a boolean value: ");
		boolean Bvalue = reader.nextBoolean();
		System.out.println("The Value is: "+Bvalue);
		
		System.out.print("Enter your Name: ");
		String name = reader.next();
		System.out.println("Your Name is: "+name);
		
		System.out.print("Are you Single(y/n)?: ");
		char isSingle = reader.next().charAt(0);
		System.out.println("You are single: "+isSingle);
		
	}
}