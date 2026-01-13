//Java continue Statement
class continue1{
	public static void main(String args[])
	{
		for(int i=1; i<=10; ++i)
		{
		if(i>4 && i<9)   //if value of i is betweeen 4 and 9
		{
			continue;   //continue is executed
		}
		System.out.println(i);
		}
	}
}