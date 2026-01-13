/*    Create a Class Student
student has attributes name, age ,GPA
Student has method print_GPA()
Create an object of StudentAssign value to the attributes
Call method print_GPA()     */ 



class Student {
	
	
			String name;
			int age;
			double gpa;
			
			Student(String name,int age,double gpa)  				//constructor
			{
				this.name = name;
				this.age = age;
				this.gpa = gpa;
			}
			public void print_GPA()
			{
				System.out.println("The GPA is: "+gpa);
			}
			public static void main (String args[])
			{
				Student obj1 = new Student("Tony",23,3.23);
				System.out.println("The name is: "+obj1.name);
				obj1.print_GPA();
				
				Student obj2 = new Student("Alex",34,2.09);
				System.out.println("\nThe age is: "+obj2.age);
				obj2.print_GPA();
				
			}
	
}