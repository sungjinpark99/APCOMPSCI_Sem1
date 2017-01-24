import java.util.Scanner;

public class Strings
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		String[][] strings = new String[4][4];

		for(int i = 0; i < strings.length; i++)
		{
			for(int j = 0; j < strings[i].length; j++)
			{
				System.out.println("Please enter a string: ");
				strings[i][j] = kb.nextLine();
			}
		}

		for(int i = 0; i < strings.length; i++)
		{
			for(int j = 0; j < strings[i].length; j++)
			{
				System.out.print(strings[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

