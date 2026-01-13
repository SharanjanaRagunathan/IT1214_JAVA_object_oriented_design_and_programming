//Write a java programme to find the sum square of the first n numbers
import java.util.Scanner;
class SumSquare{
		public static void main(String[]args){
		Scanner SumSquare=new Scanner(System.in);
			
		System.out.print("Enter the value of n: ");
		int n=SumSquare.nextInt();
		
			int sum=0;
			//for loop
			for(int i=1; i<=n; ++i){
			sum += i*i;
			}
			System.out.println("sum of the square of the first" +n+ "number is:" +sum);
		}
}