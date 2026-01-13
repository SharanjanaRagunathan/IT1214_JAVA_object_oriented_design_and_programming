/*Write a java program to check if a number is positive or nagative using if else*/
public class IfElse{

	public static void main(String[]args){
		double number=12.34;
		
		//true if number is less than 0
		if(number<0.0)	
			System.out.println(number+"is nagative number.");
			
		//true if number is greater than 0
		if(number>0.0)	
			System.out.println(number+"is positive number.");	
		
		//true both test expression is evaluated to false
		else
			System.out.println(number+"is 0.");
		
		
		
		}
}