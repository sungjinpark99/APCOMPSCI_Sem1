import java.util.Scanner;
public class ToyRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		ToySt obj = new ToySt("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println("List of toys: " + obj);
		System.out.println("\nMost frequent toy: " + obj.getMostFrequentToy());
		System.out.println("Most frequent type of toy: " + obj.getMostFrequentType());
	}
}


