import java.util.Scanner;
public class Factorial
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter any number (int)");
		int a = kb.nextInt();
	    
		for(int f = 1; f < a; f++)
		{
			System.out.println((f+1)*f);
		}
			
		
	}
}