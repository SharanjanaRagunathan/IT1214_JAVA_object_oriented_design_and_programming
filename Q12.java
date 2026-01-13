public class Q12
{
  public static void main(String[] args)
   {
     int num=2346432;
     int reversedNum=0;
     int originalNum=num;
     while(num!=0)
      {
        int digit=num%10;
        reversedNum=reversedNum*10 + digit;
        num/=10;
      }
  if(originalNum==reversedNum)
    {
      System.out.println(originalNum+" is palindrome number" );
    }
  else
   {
      System.out.println(originalNum+" is not palindrome number" );
   }
 }
}
