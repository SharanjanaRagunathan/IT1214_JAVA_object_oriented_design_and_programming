//Compute the sum of 5 positive numbers

import java.util.Scanner;
	class SumPositive{
		public static void main(String args[])
		{
		Double no,sum=0.0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<6; i++)
		{
			System.out.print("Enter Number "+i+": ");
			no = sc.nextDouble();
			
			if(no<=0.0)
			{
				continue;
			}
			sum=sum+no;
		}
		System.out.println("Sum is: "+sum);
		}
}