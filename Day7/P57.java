//using looping construct to copy array

import java.util.Arrays;
class MyMain
{
	public static void main(String args[])
	{
		int[] source={1,2,3,4,5,6};
		int[] destination = new int[6];
		
		//iterate and copy elements to from source to deatination
		for(int i=0; i<source.length; i++){
			destination[i]= source[i];
		}
		System.out.println(Arrays.deeptoString(destination));
		
	}
}