import java.util.Scanner;
public class Box
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter any String");
		String input = kb.next();
		int number = input.length();
		
		for(int i = 0; 1 <= number -1; i++)
	{
		System.out.println(input);
	}
	}
}