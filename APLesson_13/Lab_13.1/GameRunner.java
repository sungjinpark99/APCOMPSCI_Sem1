public class GameRunner
{
	public static void main (String args[])
	{
		PlayStation ps = new PlayStation("ps");
		System.out.println(ps);

		PCClass pc = new PCClass("pc");
		System.out.println(pc);

		Xbox xbox = new Xbox("xbox");
		System.out.println(xbox);
	}
}
