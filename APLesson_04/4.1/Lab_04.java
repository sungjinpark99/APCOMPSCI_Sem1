import java.util.Scanner;

public class Lab_04
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter item 1:");
		String item1 = keyboard.nextLine();
		System.out.println("Please enter the price:");
		double price1 = keyboard.nextDouble();
		keyboard.nextLine();
		
		System.out.println("Please enter item 2:");
		String item2 = keyboard.nextLine();
		System.out.println("Please enter the price:");
		double price2 = keyboard.nextDouble();
		keyboard.nextLine();
		
		System.out.println("Please enter item 3:");
		String item3 = keyboard.next();
		System.out.println("Please enter price:");
		double price3 = keyboard.nextDouble();
		
		double subtotal = (price1 + price2 + price3);
		double tax = (.15 * subtotal);
		double total = (subtotal + tax);
		
		Lab_04 form = new Lab_04();
		
		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		System.out.println();
		form.format("Subtotal:", subtotal);
		form.format("Tax:", tax);
		form.format("Total:", total);
		System.out.println(" ______________________________________ ");
		System.out.println(" *Thank you for your support* ");
		
		
	}
	public void format(String name, double number)
	{
		System.out.printf("* %15s ......   %15.2f\n",name, number);
	}
}

