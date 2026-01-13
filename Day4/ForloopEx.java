//display Sum of 15 Natural Numbers using for loops
//output:-
//1+2+3+......+15

class ForloopEx{
		public static void main(String[]args){
			
			int sum=0;
			//for loop
			for(int i=1; i<=15; ++i){
				sum+=i;
			
			}
			System.out.println(sum);
		}
}