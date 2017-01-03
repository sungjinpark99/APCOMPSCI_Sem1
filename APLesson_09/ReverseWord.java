import java.util.Scanner;

public class ReverseWord
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String [] words = new String[5];
		System.out.println("Enter 5 words: ");
		
		for(int i = 0; i <= words.length; i++)
		{
			words[i] = kb.next();
		}			
		
		
	}
}