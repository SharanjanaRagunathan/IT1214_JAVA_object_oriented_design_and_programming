public class ExplicitConversionExample{
	public static void main(String[]args){
	
	//Explicit conversion
	//Narrowing casting(manually)-converting a alarger type to a smaller size type 
	//double->float->long->int->char->short->byte
	
	//original double value
	double originalDouble=1234.56789;
	System.out.println("Original double: "+originalDouble);
	
	//double to float
	float floatResult=(float)originalDouble;
	System.out.println("Narrowed float: "+floatResult);
	
	//float to long
	long longResult=(long)floatResult;
	System.out.println("Narrowed long: "+longResult);
	
	//long to int
	int intResult=(int)longResult;
	System.out.println("Narrowed int: "+intResult);
	}

}