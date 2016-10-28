import java.util.Scanner;

public class BMI
{
	static double height;
	static double weight;
	static double BMI;
	static String condition;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your height?");
		height = kb.nextDouble();
		System.out.println("What is your weight?");
		weight = kb.nextDouble();
		
		
		
		
		BMI = (703 * weight/ ( height * height));
		
		System.out.printf("Your BMI is %.2f", BMI);
		System.out.println();
		System.out.println("You are " + condition);
	}
	
	public static void calcCondition(double BMI)
	{
		
		if (BMI >= 39.9)
			condition = "Morbidly Obese";
		if (BMI >= 35)
			condition =  "Very Obese";
		if (BMI >= 29.9)
			condition = "Obese";
		if (BMI >=25)
			condition = "Overweight";
		if (BMI >=18.5)
			condition = "Normal";
		else
			condition = "Underweight";
		
		
	}
}