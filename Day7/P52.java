//Initialize the array name as student 
//length of the array is 5 
//Find the Total and Average
//Find the largest array element in array student
//Find the smallest array element in array student
class MyMain{
	public static void main(String args[])
	{  
       int student[] = {50,60,80,90,35};
	   int sum=0;
	   
	   for(int marks:student)
	   {  sum += marks;
	   }
	    System.out.println("Sum is: "+sum);
		double average = sum/student.length;
		System.out.println("Average  is: "+average);
		
	   int Max=student[0];
	   for(int i=0; i<5; i++)
	   {  if(Max<student[i])
			{  Max= student[i];
			}
	   }
	   System.out.println("Maximum marks is: "+Max);
	   
	   int Min=student[0];
	   for(int i=0; i<5; i++)
	   {  if(Min>student[i])
			{  Min= student[i];
			}
	   }
	   System.out.println("Maximum marks is: "+Min);
	}
}