//Write a java program to check'*' is Alphabet or not using if else

public class IfElseAlphabet{
	public static void main(String[]args){
		char c='*';
		
	if((c>='a'&&c<='z') ||(c>='A'&&c<='Z'))
		System.out.println(c+" is an alphabet.");
	
	else
		System.out.println(c+" is not an alphabet.");
	}
}