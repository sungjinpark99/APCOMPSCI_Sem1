import java.util.Scanner;

public class DistanceRunner
{
	public static void main(String[]args)
	{
		int xO=0;
		int yO=0;
		int xT=0;
		int yT=0;
		
		Scanner kb=new Scanner(System.in);
		
		System.out.println("Enter the x of the first coordinate: ");
		xO = kb.nextInt();
		System.out.println("Enter the y of the first coordinate: ");
		yO = kb.nextInt();
		System.out.println("Enter the x of the second coordinate: ");
		xT = kb.nextInt();
		System.out.println("Enter the y of the second coordinate: ");
		yT = kb.nextInt();

		DistanceBetween2Points object = new DistanceBetween2Points(xO,yO,xT,yT);
		System.out.printf("Distance between the points = %.2f\n",object.getDist());



		object.setValues(5,8,2,3);
		System.out.printf("Distance between the points= %.2f",object.getDist());
	}
}
