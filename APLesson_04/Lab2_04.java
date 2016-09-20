import java.util.Scanner;

public class Lab2_04
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String item1 = keyboard.next();
		
		System.out.println("Enter your last name:");
		String item2 = keyboard.next();
		
		System.out.println("Enter your title:");
		String item3 = keyboard.next();
		
		System.out.println("Enter the school site:");
		String item4 = keyboard.nextLine();
		String space = keyboard.nextLine();
		
		System.out.println("Enter the school year:");
		String item5 = keyboard.next();
		
		System.out.println("What is your subject:");
		String item6 = keyboard.nextLine();
		String space2 = keyboard.nextLine();
		
		
		Lab2_04 form = new Lab2_04();
		System.out.println(" ");
		
		System.out.println("*************************");
		String name1 = item4;
		String thing1 = item5;
		form.format(name1, thing1);
		
		String name2 = item1;
		String thing2 = item2;
		form.format(name2, thing2);
		
		String name3 = item3;
		String thing3 = item6;
		form.format(name3, thing3);
		
		System.out.println(" ");
		System.out.println("*************************");
		
	}
	public void format(String name, String thing)
	{
		System.out.printf("\n*%10s  %10s *",name, thing);
	}
}