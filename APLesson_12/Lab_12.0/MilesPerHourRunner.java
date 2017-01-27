import java.util.Scanner;
public class MilesPerHourRunner
{
	public static void main(String[]args)
	{
		int Dist=0;
		int H=0;
		int M=0;
		
		Scanner kb=new Scanner(System.in);
		
		System.out.println("Enter distance: ");
		Dist = kb.nextInt();
		
		System.out.println("Enter time in hours: ");
		H = kb.nextInt();
		
		System.out.println("Enter time in minutes: ");
		M = kb.nextInt();

		MilesPerHour object = new MilesPerHour(Dist,H,M);

		System.out.printf("%d miles in %d hours and %d minutes = %.2f mph%n",object.getDistance(),object.getHours(),object.getMinutes(),object.getmph());


		object.setDistance(5,6,1);

		System.out.printf("%d miles in %d hours and %d minutes = %.2f mph",object.getDistance(),object.getHours(),object.getMinutes(),object.getmph());
	}
}
