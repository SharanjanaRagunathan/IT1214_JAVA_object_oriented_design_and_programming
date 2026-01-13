import java.util.Scanner;
public class Q01
{
  public static void main(String[] args)
   {
    Scanner scan=new Scanner(System.in);
    System.out.print("Enter a year: ");
    int year=scan.nextInt();
    if(year%4==0)
      {
         System.out.println("Leap year");
      }
    else
      {
         System.out.println("Not a leap year");
       }
     }
}
    