import java.util.Scanner;
public class Q10
{
  public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.print("Base: ");
    double base=sc.nextDouble();
    System.out.print("Exponent: ");
    double exponent=sc.nextDouble();
    double result=Math.pow(base,exponent);
    System.out.println("Power of the number is : "+result);
   }
}
    
   