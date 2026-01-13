import java.util.Arrays;

public class TypeConversion {
    public static void main(String[] args) {


        //Convert char to String
        System.out.println("\nConvert char to String");
        char ch = 'c';
        String st = Character.toString(ch);
        // Alternatively
        // st = String.valueOf(ch);
        System.out.println("The string is: " + st);

        //Convert char array to String
        System.out.println("\nConvert char array to String");
        char[] ch2 = {'a', 'e', 'i', 'o', 'u'};

        String st1 = String.valueOf(ch2);
        String st2 = new String(ch2);

        System.out.println(st1);
        System.out.println(st2);

        //Convert String to char array
        System.out.println("\nConvert String to char array");
        String st4 = "This is great";

        char[] chars = st4.toCharArray();

        //import the library java.util.Arrays;
        System.out.println(Arrays.toString(chars));


        //char to int using parseInt() method
         System.out.println("\nchar to int using parseInt() method");
        // create char variables
	    char a = '5';
	    char b = '9';

	    // convert char variables to int
	    // Use parseInt()
	    int num1 = Integer.parseInt(String.valueOf(a));
	    int num2 = Integer.parseInt(String.valueOf(b));

	    // print numeric value
	    System.out.println(num1);    // 5
	    System.out.println(num2);    // 9



	    //Convert int to char
	    System.out.println("\nConvert int to char");
	    // create int variables
	    int num3 = 80;
	    int num4 = 81;

	    // typecasting
	    char c = (char)num3;
	    char d = (char)num4;

	    // print value
	    System.out.println(c);    // P
	    System.out.println(d);    // Q



	    //Convert boolean to String using toString()
	    System.out.println("\nConvert boolean to String using toString()");
	    // create boolean variables
	    // create boolean variables
	    boolean booleanValue1 = true;
	    boolean booleanValue2 = false;

	    // convert boolean to string
	    // using toString()
	    String stringValue1 = Boolean.toString(booleanValue1);
	    String stringValue2 = Boolean.toString(booleanValue2);

	    System.out.println(stringValue1);    // true
	    System.out.println(stringValue2);    // true


	    //Convert string to int using valueOf()
	    System.out.println("\nConvert string to int using valueOf()");
	    // create string variables
	    String str1 = "643";

	    // convert String to int
	    // using valueOf()
	    int num5 = Integer.valueOf(str1);

	    // print int values
	    System.out.println(num5);    // 643


	    //Convert string to int using parseInt()
	    System.out.println("\nConvert string to int using parseInt()");
	    // create string variables
	    String str2 = "23";

	    // convert string to int
	    // using parseInt()
	    int num6 = Integer.parseInt(str2);

	    // print int values
	    System.out.println(num6);    // 23



	    //Convert int to string using valueOf()
	    System.out.println("\nConvert int to string using valueOf()");
	    int num7 = 36;

	    String str3 = String.valueOf(num7);

	    // print string variables
	    System.out.println(str3);    // 36


	    //Convert int to string using toString()
	    System.out.println("\nConvert int to string using toString()");
	    int num8 = 476;

	    // convert int to string
	    // using toString()
	    String str4 = Integer.toString(num8);

	    // print string variables
	    System.out.println(str4);    // 476


    }
}
