import java.util.Scanner;

public class Average2
{
	
	static double num1;
	static double num2;
	static double num3;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is number 1?");
		num1 = kb.nextDouble();
		
		System.out.println("What is number 2?");
		num2 = kb.nextDouble();
		
		System.out.println("What is number 3?");
		num3 = kb.nextDouble();
		
		print(calcAvg(num1,num2,num3));
	}
	
	public static double calcAvg(double num1, double num2, double num3)
	{
		return (num1 + num2 + num3)/3.0;
	}
	
	public static void print(double average)
	{
		System.out.printf("The average of " + num1 + " ," + num2 + " ," + num3 + " is %.5f", average);
	}
}