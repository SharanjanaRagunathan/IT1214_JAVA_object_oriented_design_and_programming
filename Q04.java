import java.util.Scanner;
public class Q04
{
  public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n1=0,n2=1,n3;
      System.out.print("Enter a number: ");
      int n=sc.nextInt();
      if(n==0)
        {
           System.out.println("Fibbonacci : "+n1);
         }
      else if(n==1)
       {
         System.out.println("Fibbonacci : "+n1+" "+n2);
       }
    else
      {
        System.out.print(n1+" "+n2+" ");
        for(int i=3;i<=n;++i)
             {
               n3=n1+n2;
               System.out.print(n3+" ");
               n1=n2;
               n2=n3;
             }
         }
      }
}