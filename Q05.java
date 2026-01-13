
public class Q05
{
  public static void main(String[] args)
    {
      int n1=0,n2=1,n3;
      int n=5;
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
        for(int i=3;i<=5;++i)
             {
               n3=n1+n2;
               System.out.print(n3+" ");
               n1=n2;
               n2=n3;
             }
         }
      }
}