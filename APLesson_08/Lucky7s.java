import java.util.Scanner;

public class Lucky7s
{

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = kb.nextInt();
		System.out.println("The number of 7s in " + number + " is " + luck(number) + ".");

	}

	public static int luck(int num)
	{
		if (num > 0)
		{
			if (num%10 == 7)
			{
				return 1 + luck(num/10);
			}
			
			else
			{
				return 0 + luck(num/10);
			}
		}
		
		else
		{
			return 0;
		}
		
	}
}



