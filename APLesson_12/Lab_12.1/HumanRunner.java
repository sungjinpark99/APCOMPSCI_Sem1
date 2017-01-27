import java.util.Scanner;

public class HumanRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your hair color:");
		String Hair = kb.nextLine();
		
		System.out.println("Please enter your eye color:");
		String Eyes = kb.nextLine();
		
		System.out.println("Please enter your skin color:");
		String Skin = kb.nextLine();

		HumanClass me = new HumanClass(Hair, Eyes, Skin);
		System.out.println("My info...");
		System.out.printf("Hair: %s%n", me.getHair());
		System.out.printf("Eyes: %s%n", me.getEyes());
		System.out.printf("Skin: %s%n", me.getSkin());

		me.setHuman("Blue", "Sunset Orange", "White");
		System.out.println("Friend's info...");
		System.out.printf("Hair: %s%n", me.getHair());
		System.out.printf("Eyes: %s%n", me.getEyes());
		System.out.printf("Skin: %s%n", me.getSkin());
	}
}
