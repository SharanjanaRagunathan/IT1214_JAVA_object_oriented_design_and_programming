import java.util.Scanner;
public class Q02ForLoop
{
  public static void main(String[] args)
    {
      int fact=1;
      Scanner scan=new Scanner(System.in);
      System.out.print("Enter a number: ");
      int n=scan.nextInt();
      if(n==0||n==1)
        {
          System.out.println("Factorial is 1");
        }
    else if(n>1)
       {
         for(int i=1;i<=n;++i)
           {
             fact=fact*i;
           }
         System.out.println(n+" ! = "+fact);
       }
   else
    {
        System.out.println("Error");
    }
  }
}

      