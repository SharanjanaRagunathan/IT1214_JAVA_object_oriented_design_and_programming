/*write a java program to find the total and average for 5 numbers getting from the user using array*/

import java.util.Scanner;
class ArrayEx{
	public static void main(String args[]){
		
		double total=0.0;
		int[] student=new int[5];
		
		Scanner ArrayEx=new Scanner(System.in);
		
		for(int i=0; i<5; i++ ){
		
		System.out.print("Enter your marks: ");
		student[i]=ArrayEx.nextInt();
		total +=student[i];
	}
	
	System.out.println("Total is: "+total);
	System.out.println("Average is: "+(total/5));
}
}