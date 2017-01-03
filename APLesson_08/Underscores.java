import java.util.Scanner;

public class Underscores
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		String sent = kb.nextLine();
		replace(sent);
		
	}

	public static String replace(String sent)
	{
		int n = sent.indexOf(" ");
		
		if (n == -1)
		{
			System.out.println(sent);
		}
		else
		{ 
			replace(sent.substring(0,n) + "_" + sent.substring(n+1));
		}
		
		return " ";
	}
}
