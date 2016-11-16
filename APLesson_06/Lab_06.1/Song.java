import java.util.Scanner;

public class Song
{
	public static void main(String[]args)
	{
		sing("Na",3);
		sing("Na",3);
		sing("Hey",2);
		sing("Goodbye!",0);
	}
	public static void sing(String word, int num)
	{
		for(int i = 0; i<=num; i++)
		{
			System.out.printf(word + " ");
		}
		System.out.println("");
	}
}