import java.util.Scanner;
public class Graph_Table
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter Integer");
		int integer = kb.nextInt();
		System.out.println("Enter Size of table");
		int Size = kb.nextInt();
	
		for(int i = 1; i <= Size; i++)
		{
			System.out.printf("%3d               %3d\n", i, i*integer);
		}
	}
}