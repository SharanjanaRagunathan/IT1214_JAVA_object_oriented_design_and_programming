//Find the smallest array element in array student

class MyMain{
	public static void main(String args[])
	{  
	   int student[] = {55,67,88,94,32};
	   int Min=student[0];
	   
	   for(int i=0; i<5; i++)
	   {  
            if(Min>student[i])
			{
				Min= student[i];
			}
	   }
	   System.out.println("Manimum marks is: "+Min);
	   
	}
}