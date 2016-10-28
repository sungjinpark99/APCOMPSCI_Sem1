import java.util.Scanner;

public class Lab3_04
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		Lab3_04 interest = new Lab3_04();
		
		System.out.println("What is your interest rate?");
		double rate = keyboard.nextDouble();
		
		System.out.println("How much is the original amount you intend to borrow?");
		int principal = keyboard.nextInt();
		
		System.out.println("How many times would the loan compound per year?");
		int number = keyboard.nextInt();
		
		System.out.println("How many years wil you have the loan?");
		int time = keyboard.nextInt();
		
		double monthly = interest.month(principal,rate,number,time);
		double total = interest.all(principal,rate,number,time);
		
		System.out.printf("Your total monthly payment is %10.2f\n", monthly);
		System.out.printf("Your total payment is %10.2f\n", total);
	}
	
	public double month(int p, double r, int n, int t)
	{
		return p* Math.pow((1+r/n), n*t)/(12*t);
	}
	
	public double all(int p, double r, int n, int t)
	{
		return p* Math.pow((1+r/n), n*t);
	}
}