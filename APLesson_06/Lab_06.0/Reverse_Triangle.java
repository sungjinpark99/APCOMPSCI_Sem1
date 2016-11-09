import java.util.Scanner;
public class  Reverse_Triangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a string");
		String word = kb.next();
		int wl = word.length();
		
		for(int i = wl; i >= 0; i--)
		{
			System.out.println(word.substring(0,i));
		}
	}
}