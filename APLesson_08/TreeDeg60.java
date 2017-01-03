import java.util.Scanner;

public class TreeDeg60
{
	static int start;
	static int stop;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String word = kb.nextLine();
		start = 1;
		stop = word.length();
		treedeg60(word,start,stop);
	}
	
	public static String treedeg60(String word, int start, int stop)
	{
		if(start <= stop)
		{
			System.out.printf("%10s  \n", word.substring(0,start));
			start += 1;
			treedeg60(word, start, stop);
		}
		return " ";
	}
}