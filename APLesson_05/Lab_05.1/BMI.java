import java.util.Scanner;

public class BMI
{
	static double height;
	static double weight;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your height?");
		height = kb.nextDouble();
		System.out.printlng("What is your weight?");
		weight = kb.nextDouble();
		
		int BMI = (703 * Weight/ ( Height * Height));
		
		System.out.println("Your BMI is " + BMI);
		System.out.println("You are " + calcCondition);
	}
	
	public static void calcCondition(int BMI)
	{
		if (BMI >= 39.9)
			return Morbidly_Obese;
		if (BMI >= 35)
			return Very_Obese;
		if (BMI >= 29.9)
			return Obese;
		if (BMI >=25)
			return Overweight;
		if (BMI >=18.5)
			return Normal;
		else
			condition = Underweight;
		
		return condition;
	}
}