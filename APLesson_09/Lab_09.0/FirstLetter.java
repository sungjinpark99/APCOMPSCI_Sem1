import java.util.Scanner;

public class FirstLetter
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		String [] strings = new String[5];
		System.out.println("Please enter 5 words: ");

		for(int i = 0; i < strings.length; i ++)
		{
			strings[i] = kb.next();
		}
		firstletter(strings);
	}

	public static void firstletter(String[] strings)
	{
		for (String s : strings)
		{
			System.out.println(s.charAt(0));
		}
	}
}

