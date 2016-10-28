import java.util.Scanner;
public class Lab_05_02
{
	static double price1;
	static double price2;
	static double price3;
	static double price4;
	static double subtotal;
	static double total;
	static double discount;
	static double tax;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Pleas enter item 1: ");
		String item1 = kb.next();
		System.out.println("Please enter price 1: ");
		price1 = kb.nextDouble();
		System.out.println("Pleas enter item 2: ");
		String item2 = kb.next();
		System.out.println("Please enter price 2: ");
		price2 = kb.nextDouble();
		System.out.println("Pleas enter item 3: ");
		String item3 = kb.next();
		System.out.println("Please enter price 3: ");
		price3 = kb.nextDouble();
		System.out.println("Pleas enter item 4: ");
		String item4 = kb.next();
		System.out.println("Please enter price 4: ");
		price4 = kb.nextDouble();
		
		subtotal = price1 + price2 + price3 + price4;
		calcDisc();
		tax = subtotal * 0.08;
		double total = subtotal + tax - discount;
		
		System.out.println("<<<<<<< receipt >>>>>>>");
		
		format(item1, price1);
		format(item2, price2);
		format(item3, price3);
		format(item4, price4);
		format("Subtotal: ", subtotal);
		format("Discount: ", discount);
		format("Tax: ", tax);
		format("Total: ", total);
		
		System.out.println("_______________________");
		System.out.println("Thank you for your help");
		
	}
	
	public static void calcDisc()
	{
		if (subtotal >= 2000.00)
			discount = .15 * subtotal;
		 else 
			 discount = 0.00 * subtotal;
	}
	
	public static void format(String item, double price)
	{
		System.out.printf("%12s ...... %15.2f\n", item, price);
	}
}