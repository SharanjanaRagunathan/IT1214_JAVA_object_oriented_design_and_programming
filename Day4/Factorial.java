//Find factorial of a number using for loop and while loop
// 1*2*3*......n

import java.util.Scanner;
class Factorial{
		public static void main(String[]args){
		Scanner Factorial=new Scanner(System.in);
			
		System.out.print("Enter the value of n: ");
		int n=Factorial.nextInt();
		
			int factorial=1;
			//for loop
			for(int i=1; i<=n; ++i){
			factorial*=i;
			}
			System.out.println("factorial of a number" + n + "number is:" +factorial);
		}
}