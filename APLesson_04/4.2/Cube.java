import java.util.Scanner;

public class Cube
{
	static double side;
	static double sa;
	
	public class void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("How long is the side");
		side = kb.nextDouble();
		
		calcSurf();
		print();
	}
	
	public static void calcSurf()
	{
		sa = side*side*side;
	}
	
	public static void print()
	{
		System.out.printf("The surface area of the cube is %.5f")
	}
}