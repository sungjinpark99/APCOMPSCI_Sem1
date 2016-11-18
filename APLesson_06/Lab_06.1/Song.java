import java.util.Scanner;

public class Song
{
	static int repeats;
	static String lyrics; 
	
	public static void main(String[]args)
	{
		sing("Na",3);
		sing("Na",3);
		sing("Hey",2);
		sing("Goodbye!",0);
	}
	public static void sing(String lyrics, int repeats)
	{
		for(int i = 0; i<=repeats; i++)
		{
			System.out.printf(lyrics + " ");
		}
		System.out.println("");
	}
}