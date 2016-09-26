public class Lab_02
{
	public static void main(String[]args)
	{
		int x = 2;
		int y = 5;
		int product = (x * y);
		
		System.out.println( x + " " + "multiplied by" + " " + y + " " + "is " + product);
		
		String first = "Sungjin Park";
		String second = "3774 Mykonos Ln Unit 70";
		String third = "San Diego";
		String forth = "92130";
		String fifth = "CA";
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third + " " + fifth + ", " + forth);
		
		int l = 5;
		int w = 13;
		int h = 23;
		int RecCubeSA = (2*l*w + 2*w*h + 2*l*h);
		
		System.out.println( "The surface area of your rectangle is" + " " + RecCubeSA);
	}
}