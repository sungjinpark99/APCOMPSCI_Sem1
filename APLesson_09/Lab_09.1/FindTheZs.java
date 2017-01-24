import java.util.Scanner;

public class FindTheZs
{
	static String[] strings;
	static Scanner kb = new Scanner(System.in);

	public static void main(String[]args)
	{
		strings = new String[5];
		fillArray();
		System.out.println("For the strings,");
		printArray();
		System.out.println(", only " + Zs() + "contain(s) the letter z.");
	}

	public static void fillArray()
	{
		System.out.println("Enter 5 strings: ");
		for(int i = 0; i < strings.length; i ++)
		{
			strings[i] = kb.next();
		}
	}

	public static void printArray()
	{
		for(String word:strings)
		{
			System.out.print(word+ " ");
		}
	}

	public static String Zs()
	{
		String zs = " ";
		for(String word:strings)
		{
			if(word.indexOf("Z")>=0)
			zs+=word + " ";
		}
		return zs;
	}
}
