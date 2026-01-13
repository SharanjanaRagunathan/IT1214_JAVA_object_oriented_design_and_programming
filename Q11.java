public class Q11
{
  public static void main(String[] args)
    {
      String str="ABCDCBA";
      String reverseStr=new StringBuilder(str).reverse().toString();
      if(str.equals(reverseStr))
          {
             System.out.println(str+" is a palindrome");
           }
      else
        {
          System.out.println(str+"is not a palindrome");
        }
     }
}