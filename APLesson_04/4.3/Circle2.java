import java.util.Scanner;

public class Circle2
{
	
	static double r;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the radius of the circle?");
		r = kb.nextDouble();
		
		print(calcArea(r));
	}
	
	public static double calcArea(double r)
	{
		return 3.14 * r * r;
	}
	
	public static void print(double Area)
	{
		System.out.printf("The area of a circle with a radius " + r + " is %.5f", Area);
	}
}