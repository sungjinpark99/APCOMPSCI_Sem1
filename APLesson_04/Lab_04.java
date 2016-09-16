import java.util.Scanner;

public class Lab_04
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter item 1:");
		String item1 = keyboard.next();
		
		System.out.println("Please enter the price:");
		double price1 = keyboard.nextDouble();
		
		System.out.println("Please enter item 2:");
		String item2 = keyboard.next();
	
		System.out.println("Please enter the price:");
		double price2 = keyboard.nextDouble();
		
		System.out.println("Please enter item 3:");
		String item3 = keyboard.next();
	
		System.out.println("Please enter price:");
		double price3 = keyboard.nextDouble();

		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		
		Lab_04 form = new Lab_04();
		
		String name1 = item1;
		double number1 = price1;
		form.format(name1, number1);
		
		String name2 = item2;
		double number2 = price2;
		form.format(name2, number2);
		
		String name3 = item3;
		double number3 = price3;
		form.format(name3, number3);
		
		
	}
	public void format(String name, double number)
	{
		System.out.printf("\n%15s  %10.2f", name, number);
	}
}