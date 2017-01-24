import java.util.Scanner;

public class Divisor
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		int[][]numbers = new int [4][4];
		
		for(int i = 0; i < numbers.length; i++)
		{
			for(int j = 0; j < numbers[i].length; j++)
			{
				numbers[i][j] = (int)(Math.random() * 100);
			}
		}

		for(int i = 0; i < numbers.length; i++)
		{
			for(int j = 0; j < numbers[i].length; j++)
			{
				System.out.print(numbers[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\nPlease enter a number: ");
		
		int Divisor = kb.nextInt();
		int C = 0;
		
		for(int i = 0; i < numbers.length; i++)
		{
			for(int j = 0; j < numbers[i].length; j++)
			{
				if (numbers[i][j] % Divisor == 0)
				{
					C++;
				}
			}
		}
		System.out.println("There are " +C+ " numbers divisible by " +Divisor+ " in the Array.");
	}

}
