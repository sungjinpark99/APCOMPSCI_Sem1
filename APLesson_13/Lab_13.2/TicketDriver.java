public class TicketDriver
{
	public static void main(String[]args)
	{
		WalkUp walkup = new WalkUp();
		Advance advance = new Advance(10);
		StudentAdvance studentadvance = new StudentAdvance(10);
		System.out.println("Walkup\n" + walkup);
		System.out.println("\nAdvance\n" + advance);
		System.out.println("\nStudent Advance\n" + studentadvance);
	}
}
