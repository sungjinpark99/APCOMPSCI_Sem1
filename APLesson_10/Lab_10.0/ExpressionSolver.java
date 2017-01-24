import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExpressionSolver
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an equation: ");
		String eq = input.nextLine();

		ArrayList<String>equation = new ArrayList<>(Arrays.asList(eq.split(" ")));

		Functions(equation);
	}

	public static void Functions(ArrayList<String> equation)
	{	
		int i = 0;
		while(i < equation.size())
		{
			if(equation.get(i).equals("+"))
			{
				equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) + Integer.parseInt(equation.get(i+1))));
				equation.remove(i-1);
				equation.remove(i);
			}
			else if(equation.get(i).equals("-"))
			{
				equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) - Integer.parseInt(equation.get(i+1))));
				equation.remove(i-1);
				equation.remove(i);
			}
			else if(equation.get(i).equals("*"))
			{
				equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) * Integer.parseInt(equation.get(i+1))));
				equation.remove(i-1);
				equation.remove(i);  
			}
			else if(equation.get(i).equals("/"))
			{
				equation.set(i, "" + (Integer.parseInt(equation.get(i-1)) / Integer.parseInt(equation.get(i+1))));
				equation.remove(i-1);
				equation.remove(i);
			}
			else
				i++;
		}

		System.out.println(equation);
	}
}


