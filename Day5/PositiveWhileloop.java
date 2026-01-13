//Print sum of the positive numbers using while loop take the integer from user

import java.util.Scanner;

class PositiveWhileloop{
		public static void main(String[]args){
		 
		 int n,sum=0;
		 
		Scanner PositiveWhileloop=new Scanner(System.in);	
		System.out.print("Enter the numbers: ");
		n=PositiveWhileloop.nextInt();
	
			
			while (n>=0) {
			sum = sum+n;
			System.out.print("Enter the numbers: ");
			n=PositiveWhileloop.nextInt();
		}
		System.out.println("sum of the positive number is:" +sum);
	}
}
