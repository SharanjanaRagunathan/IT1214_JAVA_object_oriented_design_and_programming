class MultidimensionalArray2{
	public static void main(String[] args){
	
	//create a 2nd array
	int[][] a={
		{1,-2,3},
		{-4,-5,6,9},
		{7},
		};
		
	//first for...each loop access the individual array
	//inside the 2nd array
	for (int[] innerArray: a){
	
	//second for...each loop accesss each element inside the row
	for(int data: innerArray){
		System.out.print(" "+data);
		}
		System.out.println();
	}
	}
}