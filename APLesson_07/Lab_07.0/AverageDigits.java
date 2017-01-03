import java.util.Scanner;

public class AverageDigits
{
	static int number;
	static int avg = 0;
	static int digits = 0;

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter number:");
		number = kb.nextInt();
		avgDigits();
	}
	
	 public static void avgDigits()
	 {
		int num = number;
		
		while(num > 0)
		{
			digits ++;
			avg = (avg + (num % 10))/digits;
			num /= 10;
		}
		System.out.println("The Average of the digits of " + number + " is " + avg);
	}
}

