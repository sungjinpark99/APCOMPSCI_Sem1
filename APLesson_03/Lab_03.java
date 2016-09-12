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
		int num2 = keyboard.nextInt();
		System.out.println("Wow" + " " + num2 + "?" + " " + "I bet you are the ugliest one out of the siblings.");
		
		System.out.println("What do you want to be when you grow up? ");
		String Dream = keyboard.next();
		System.out.println("You are never going to become a" + " " + Dream + "." + " " + "You are just not talented enough.");
		
		System.out.println("So Sungjin, you're 20...");
		System.out.println("You like to play bass and listen to jazz...");
		System.out.println("Good luck becoming a jazz bassist.");
		System.out.println("I'm just kidding Sungjin.");
		System.out.println(" ");
		
		System.out.println("What is your weight in pounds?");
		int Weight = keyboard.nextInt();
		
		System.out.println("What is your height in inches");
		int Height = keyboard.nextInt();
		
		int BMI = (703 * Weight/ ( Height * Height));
		System.out.println("Your BMI is" + " " + BMI + ".");
		System.out.println(" ");
		
		System.out.println("How fast can you run a lap in seconds?");
		int time = keyboard.nextInt();
		System.out.println("How many laps can you run maintaining that speed?");
		int laps = keyboard.nextInt();
		
		int velocity = (400 * laps/time);
		System.out.println("You run" + " " + velocity + " " + "meters per second.");
	}
	
}