import java.util.Scanner;

public class Cube2
{
	static double side;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the measure of the side?");
		side = kb.nextDouble();
		
		print(calcSA(side));
	}
	
	public static double calcSA(double side)
	{
		return 6 * side * side;
	}
	
	public static void print(double SA)
	{
		System.out.printf("The surface area of a cube whose sides are " + side + " in length is %.5f", SA);
	}
}
