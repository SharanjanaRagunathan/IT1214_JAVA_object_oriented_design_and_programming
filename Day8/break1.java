//Labeled Break
class break1{
	public static void main(String args[])
	{
	first:
	for(int i=1; i<5; i++)
	{second:
		for(int j=i; j<3; j++)
		{
		System.out.println("i = "+i+" j= "+j);
		if(i==2)
		{
			break first;
		}
		}
	}
}
}