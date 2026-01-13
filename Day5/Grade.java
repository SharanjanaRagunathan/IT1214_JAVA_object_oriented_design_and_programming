/*Write a java program to find the grade based on the score obtained by student
score      grade
90-100      A
80-89       B
70-79       C
50-69       D
0-49        E
*/
import java.util.Scanner;

class Grade{
		public static void main(String[]args){
		Scanner Grade=new Scanner(System.in);
		
		System.out.print("Enter your marks: ");
		int n=Grade.nextInt();
		
	if(90<=n && n<=100){
		System.out.println("Your Grade is A");
	}
	else if (80<n && n<=89){
		System.out.println("Your Grade is B");
	}
	else if (70<=n && n<=79){
		System.out.println("Your Grade is C");
	}
	else if (50<=n && n<=69){
		System.out.println("Your Grade is D");
	}
	
	else{
		System.out.println("Your Grade is E");
	}
}
}