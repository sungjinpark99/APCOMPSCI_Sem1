import java.util.Scanner;

public class ReverseWord
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		String [] strings = new String[5];		
		System.out.println("Enter 5 strings: ");

		for(int i = 0; i < strings.length; i ++)
		{
			strings[i] = kb.next();
		}
		System.out.println("The strings in order: ");

		for(String string : strings)
		{
			System.out.println(string);
		}
		System.out.println();
		System.out.println("The strings reversed: ");
		reverse(strings);		
	}

	public static void reverse(String[] s)
	{
		for (int i = 4; i > -1;i--)
		{
			System.out.println(s[i]);
		}
	}
}

