import java.util.Scanner;
public class Q06
{
  public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Number1: ");
      int n1=sc.nextInt();
      System.out.print("Number2: ");
      int n2=sc.nextInt();
      int gcd=1;
      if(n1>n2)
       {
         for(int i=2;i<=n1;++i)
          {
            if(n1%i==0&&n2%i==0)
              {
                gcd=i;
              }
          }
        System.out.println("GCD of "+n1+" , "+n2+" = "+gcd);
      }
   if(n2>n1)
       {
         for(int i=2;i<=n2;++i)
          {
            if(n1%i==0&&n2%i==0)
              {
                gcd=i;
              }
          }
        System.out.println("GCD of "+n1+" , "+n2+" = "+gcd);
      }
   }
}

 