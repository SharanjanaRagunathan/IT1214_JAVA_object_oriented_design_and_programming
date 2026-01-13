class MyMain
{  public static void main(String args[])
   {
	  int[][] a={ {1,2,3},
	              {4,5,6,9},
				  {7},
				};

	                                      //first for..each loop access the individual array inside the 2d array
		for(int[] innerArray:a)
		{   for(int data: innerArray)     //second for...each loop access each element inside the row
			{
				System.out.print(data+" ");
			}
			System.out.println();
        }
   }

}
