import java.util.Scanner;

public class FibonacciSequence
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your starting number: ");
		int number = kb.nextInt();

		System.out.println("Please enter your sequence size: ");
		int SeqSize = kb.nextInt();

		int s [] = new int [SeqSize];
		for (int i = 0; i < s.length; i++)
		{
			if (i==0 || i ==2)
			{
				s[i] = number;
			}
			else
			{
				s[i] = s[i-3] + s[i-2];
			}
			
			System.out.print(s[i] + " ");
		}
	}
}

