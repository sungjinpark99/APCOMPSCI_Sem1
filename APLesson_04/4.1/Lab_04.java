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
		
		String space3 = keyboard.nextLine();
		System.out.println("Please enter item 2:");
		String item2 = keyboard.nextLine();
		
	
		System.out.println("Please enter the price:");
		double price2 = keyboard.nextDouble();
		
		String space4 = keyboard.nextLine();
		System.out.println("Please enter item 3:");
		String item3 = keyboard.next();
	
		System.out.println("Please enter price:");
		double price3 = keyboard.nextDouble();

		System.out.println("<<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>>>");
		
		double price4 = (price1 + price2 + price3);
		double price5 = (.15 * price4);
		double total = (price4 + price5);
		
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
		
		System.out.println("           ");
		
		
		String name4 = "Subtotal:";
		double number4 = price4;
		form.format(name4, number4);
		
		String name5 = "Tax:";
		double number5 = price5;
		form.format(name5, number5);
		
		String name6 = "Total:";
		double number6 = total;
		form.format(name6, number6);
		
		System.out.println("     ");
		System.out.println(" ______________________________________ ");
		System.out.println(" *Thank you for your support* ");
		
		
	}
	public void format(String name, double number)
	{
		System.out.printf("\n*%20s ......   %5.2f",name, number);
	}
}

