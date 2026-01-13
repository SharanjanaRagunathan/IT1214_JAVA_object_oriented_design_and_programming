class Array2{
	public static void main(String args[])
	{
		//declare the double array
		double data[];
		
		//allocate memory
		data=new double[5];
		
		data[0]=5.0;
		data[1]=4.7;
		data[2]=7.0;
		data[3]=8.7;
		data[4]=5.2;
		
		System.out.println("First Element: "+data[0]);
		System.out.println("Second Element: "+data[1]);
		System.out.println("Third Element: "+data[2]);
		System.out.println("Forth Element: "+data[3]);
		System.out.println("Fifth Element: "+data[4]);
	}
}