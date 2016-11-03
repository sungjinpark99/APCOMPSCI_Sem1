import java.util.Scanner;

public class BMI
{
	static String condition;
	static double weight, height, BMI;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your height?");
		height = kb.nextDouble();
		System.out.println("What is your weight?");
		weight = kb.nextDouble();
		
		
		calcCondition();
		System.out.printf("Your BMI is %.2f", BMI);
		System.out.println();
		System.out.println("You are " + condition);
		
	}
	
	public static void calcCondition()
	{
		
		BMI = (703 * weight/ ( height * height));
		
		if (BMI >= 39.9)
			condition = "Morbidly Obese";
		else if (BMI >= 35)
			condition =  "Very Obese";
		else if (BMI >= 29.9)
			condition = "Obese";
		else if (BMI >=25)
			condition =  "Overweight";
		else if (BMI >=18.5)
			condition = "Normal";
		else
			condition = "Underweight";
		
		
	}
}