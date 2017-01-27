import java.util.Scanner;

public class TheUserRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your first name:");
		String FirstName = kb.nextLine();
		
		System.out.println("Please enter your last name:");
		String LastName = kb.nextLine();
		
		System.out.println("Would you like to use a public avatar? (Y or N)");
		String choice = kb.nextLine();

		if(choice.equals("Y"))
		{
			System.out.println("Please enter your avatar:");
			String Avatar = kb.nextLine();
			
			TheUserClass User1 = new TheUserClass(FirstName, LastName, Avatar);
			System.out.println(User1);
		}
		
		else if(choice.equals("N")){
			TheUserClass User1 = new TheUserClass(FirstName, LastName);
			System.out.println(User1);
		}
	}
 }

