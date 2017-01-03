import java.util.Scanner;

public class Center
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String w1 = kb.next();
		System.out.println("Enter another word: ");
		String w2 = kb.next();
		System.out.println("Enter one more word: ");
		String w3 = kb.next();
		makeCenter(w1);
		makeCenter(w2);
		makeCenter(w3);
	}

	public static String makeCenter(String word)
	{
		if(word.length() >= 20)
		{	
			System.out.println (word);
		}
		else
		{
			 makeCenter(" " + word + " ");
		}
		return " ";
	}
}