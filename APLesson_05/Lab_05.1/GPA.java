import java.util.Scanner;

public class GPA
{
	static String P1;
	static String P2;
	static String P3;
	static String P4;
	static String P5;
	static String P6;
	static String P7;
	static double gPoints;
	static double GPA;
	static double gradePoints;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your letter grade for P1: ");
		P1 = kb.next();
		System.out.println("What is your letter grade for P2: ");
		P2 = kb.next();
		System.out.println("What is your letter grade for P3: ");
		P3 = kb.next();
		System.out.println("What is your letter grade for P4: ");
		P4 = kb.next();
		System.out.println("What is your letter grade for P5: ");
		P5 = kb.next();
		System.out.println("What is your letter grade for P6: ");
		P6 = kb.next();
		System.out.println("What is your letter grade for P7: ");
		P7 = kb.next();
		
		double gPoints = calcPoints(P1) + calcPoints(P2) + calcPoints(P3) + calcPoints(P4) + calcPoints(P5) + calcPoints(P6) + calcPoints(P7);
		GPA = gPoints / 7;
		System.out.println("Your GPA is " + GPA);
	}
	
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		if (grade.equals("B"))
			return 3.0;
		if (grade.equals("C"))
			return 2.0;
		if (grade.equals("D"))
			return 1.0;
		else 
			gradePoints = 0.0;
		
		return gradePoints;
	}
}
