import java.util.Scanner;
public class Q09
{
  public static void main(String[] args)
 {

  Scanner sc=new Scanner(System.in);
  System.out.print("Enter Base: ");
  int base=sc.nextInt();
  System.out.print("Enter Exponent: ");
  int exponent=sc.nextInt();
  int n=1;
  int i=1;
 while(i<=exponent)
  {
    n=n*base;
    ++i;
  }
  System.out.println("Power of the number is : "+n);
 }
}

  