//Find the largest array element in array student

class MyMain{
	public static void main(String args[])
	{  
	   int student[] = {50,60,80,100,35};
	   int Max=student[0];
	   
	   for(int i=0; i<5; i++)
	   {  
            if(Max<student[i])
			{
				Max= student[i];
			}
	   }
	   System.out.println("Maximum marks is: "+Max);
	   
	}
}