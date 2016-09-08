import java.util.Scanner; //import Statement

public class Lab_03
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String Name = keyboard.next();
		System.out.println("Wow" + " " + Name + " " + "sounds pretty stupid!");
		
		System.out.println("How old are you? ");
		int num = keyboard.nextInt();
		System.out.println("OMG!" + " " + num + "?" + " " + "You look mid 80's.");
		
		System.out.println("What do you do for fun? ");
		String Fun = keyboard.next();
		System.out.println("My grandma is probably better than you at" + " " + Fun);
		
		System.out.println("What kind of music do you like? ");
		String Music = keyboard.next();
		System.out.println("You listen to" + " " + Music + "?" + " " + "You have an awful taste in music. Yuk!");
		
		System.out.println("How many siblings do you have? ");
		int num = keyboard.next();
		System.out.println("Wow" + " " + Name + " " + "sounds pretty stupid!");
	}
	
}