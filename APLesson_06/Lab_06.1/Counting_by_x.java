import java.util.Scanner;

public class Counting_by_x
{
	static int num1;
	static int num2;
	
	public static void main(String[]args)
	{
			Scanner kb = new Scanner(System.in);
			System.out.println("What is the first number");
			num1 = kb.nextInt();
			System.out.println("What is the second number");
			num2 = kb.nextInt();
		
		
			for(int i = num2; i<=num1; i+=num2)
			{
					System.out.print(i + "\t");
			}
			
	}
	
}