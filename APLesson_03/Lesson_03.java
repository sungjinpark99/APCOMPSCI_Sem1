import java.util.Scanner; //import Statement

public class Lesson_03
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//promt for user input
		System.out.println("Who is your favorite teacher? ");
		
		//search for the next integer that the user enters
		String Teacher = keyboard.next();
		
		//print the results...
		System.out.println( "Okay!" + " " + Teacher + " " + "is a really good teacher.");
		
	}
}