import java.util.Scanner;

public class Lab4_04
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		Lab4_04 volBox = new Lab4_04();
		
		System.out.println("What is the length in inches?");
		int length = keyboard.nextInt();
		
		System.out.println("What is the width in inches?");
		int width = keyboard.nextInt();
		
		System.out.println("What is the height in inches?");
		int height = keyboard.nextInt();
		
		double vol = volBox.calcVol(length, width, height);
		System.out.printf("The volume of the subwoofer box in cubic feet is %5.9f", vol);
	}
	
	public double calcVol(int l, int w, int h)
	{
		return (l * w * h)/1728.00;
	}
}