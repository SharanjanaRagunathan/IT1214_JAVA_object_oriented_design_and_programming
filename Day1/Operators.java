class Operators{
	public static void main(String args[]){
		//Arithmetic Operators in Java
		System.out.println("\nArithmetic Operators");
		int a = 15;
		int b = 6;
		
		System.out.println("(a+b): "+(a+b));
		System.out.println("(a-b): "+(a-b));
		System.out.println("(a*b): "+(a*b));
		System.out.println("(a/b): "+(a/b));
		System.out.println("(a%b): "+(a%b));  //Modulus
		
		//Assignment Operators
		System.out.println("\nAssignment Operators");
		int c = 5;
		int val;	//declare a variable
		
		//Now assign value to var
		val = c;
		System.out.println("var using = operator: "+val);
		
		val += c;
		System.out.println("var using += operator: "+val);
		
		val -= 6;
		System.out.println("var using -= operator: "+val);
		
		val *= 3;
		System.out.println("var using *= operator: "+val);
		
		val /= 2;
		System.out.println("var using -= operator: "+val);
		
		val %= 4;
		System.out.println("var using -= operator: "+val);
		
		//Relational Operators
		System.out.println("\nRelational Operators");
		System.out.println("a is " + a + " and b is " + b);
		System.out.println("a == b: "+ (a == b));  
		System.out.println("a != b: "+ (a != b));  
		System.out.println("a > b: "+ (a > b));  
		System.out.println("a < b: "+ (a < b)); 
		System.out.println("a >= b: "+ (a >= b));  
		System.out.println("a <= b: "+ (a <= b));  
		
		//Logical operators
		System.out.println("\nLogical Operators");
		// AND operator
		System.out.println((5 > 3) && (8 > 5));  // true
		System.out.println((5 > 3) && (8 < 5));  // false

		// OR operator
		System.out.println((5 < 3) || (8 > 5));  // true
		System.out.println((5 > 3) || (8 < 5));  // true
		System.out.println((5 < 3) || (8 < 5));  // false

		// NOT operator
		System.out.println(!(5 == 3));  // true
		System.out.println(!(5 > 3));  // false
		
		// Increment and Decrement Operators
		System.out.println("\nIncrement and Decrement Operators");
		int p = 12, q = 12;
		int result1, result2;

		// original value
		System.out.println("Value of p: " + p);

		// increment operator
		result1 = ++p;
		System.out.println("After increment: " + result1);

		System.out.println("Value of q: " + q);

		// decrement operator
		result2 = --q;
		System.out.println("After decrement: " + result2);
		
		
		
		//Java instanceof Operator
		System.out.println("\nJava instanceof Operator");
		String str = "IT1214 - Object Oriented Programming";
		boolean result;

		// checks if str is an instance of the String class
		result = str instanceof String;
		System.out.println("Is str an object of String? " + result);
		
		
		//Java Ternary Operator
		System.out.println("\nJava Ternary Operator");
		/*shorthand for the if-then-else statement.
		If the Expression is true, expression1 is assigned 
		to the variable.
		If the Expression is false, expression2 is assigned 
		to the variable.
		*/
		
		int februaryDays = 29;
		String answer;

		// ternary operator
		answer = (februaryDays == 28) ? "Not a leap year" : "Leap year";
		System.out.println(answer);
		
	}
}