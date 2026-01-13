//switch case
/* switch (expression)
{
case value1:
	startment 1;
	break;
case value2:
	startment 2;
	break;
	
	default:
	startment 3;
}
*/

// Excrcise: write a java program to find the day of the week using switch case


import java.util.Scanner;

public class WeekDays {
	public static void main (String[] args) {
	Scanner abc= new Scanner (System.in);
	
	System.out.print("Enter your number: ");
		int number = abc.nextInt();
		
		switch (number)
		{
		
		case 1:
		System.out.print("Monday ");
		break;
			
		case 2:
		System.out.print("Tuesday ");
		break;
			
		case 3:
		System.out.print("Wednesday ");
		break;
			
		case 4:
		System.out.print("Thursday ");
		break;
			
		case 5:
		System.out.print("Friday ");
		break;
			
		case 6:
		System.out.print("Saturday ");
		break;
			
		case 7:
		System.out.print("Sunday ");
		break;
		
		default:
		System.out.print("wrong Enter ");
		}
		
	
	}
	}
	