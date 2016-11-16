import java.util.Scanner;
public class  Left_Triangle
{
	static String word;

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a string");
		word = kb.next();
		int wl = word.length();
		
		for( int i = 0; i <= wl; i++)
		{
			System.out.println(word.substring(i));
		}
	}
}