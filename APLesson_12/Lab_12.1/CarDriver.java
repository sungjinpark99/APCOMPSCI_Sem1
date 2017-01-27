import java.util.Scanner;

public class CarDriver
{
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);
		
		System.out.println("Enter a paint color: ");
		String paint = kb.nextLine();
		
		System.out.println("Give information for interior: ");
		String interior = kb.nextLine();
		
		System.out.println("Give information for engine: ");
		String engine = kb.nextLine();
		
		System.out.println("Give information for tires: ");
		String tires = kb.nextLine();

		CarClass object = new CarClass(paint, interior,engine,tires);

		System.out.printf("Paint:\t %s%n Interior:\t %s%n Engine:\t %s%n Tires:\t %s",object.getPaint(),object.getInterior(),object.getEngine(),object.getTires());



	}
}
