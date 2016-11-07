import java.util.Scanner;

public class Adventure
{
	Scanner kb;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Do you want to write your college essays? (Y or N)");
		String choice = kb.next();
	if(choice.equals("Y"))
		{
			System.out.println("Do you go grab your . . ."+
															"\n 1. laptop"+
															"\n 2. pen and pencil");
			int choice1 = kb.nextInt();
			if (choice1 == 1)
			{
				System.out.println("Which college do you start on first?" +
															"\n 1. UC Berkeley" +
															"\n 2. UCLA");
				int choice2 = kb.nextInt();
				if (choice2 == 1)
				{
					System.out.println("YOU GET INTO BERKELEY!! CONGRATS!!!");
				}
				else
				{
					System.out.println("OOF tough luck. Better luck next time. No one gets into UCLA");
				}
			}
		
			else 
			{
				System.out.println("Your pencil is broken... where do you go?"+
															"\n 1. Kitchen to go sharpen it with a meat cleaver"+
															"\n 2. Your room to go sharpen it in the pencil sharpener");
				int choice3 = kb.nextInt();
				if (choice3 == 1)
				{
					System.out.println("You can't seem to find the meat cleaver. Where do you go?"+
															"\n 1. To your room."+
															"\n 2. SCREW COLLEGE APPS. IM DONE");
															
					int choice4 = kb.nextInt();
					if (choice4 == 1)
					{
						System.out.println("You sharpened your pencil and got into college!");
					}
					else
					{
							System.out.println("Your mom sees that you aren't doing anything and body slams you.");
					}
				}
				else
				{
					System.out.println("You sharpen your pencil. Do you write your college essay now or now"+
															"\n 1. Nah push it off until later."+
															"\n 2. Do it and get it over with!");
															
					int choice5 = kb.nextInt();
					if (choice5 == 1)
					{
						System.out.println("Your mom sees that you aren't doing anything and body slams you.");
					}
					else
					{
						System.out.println("YOU GET INTO COLLEGE!!!");
					}
				}
		}
	
	}
	else
	{
		System.out.println("Your mom sees that you aren't doing anything and body slams you.");
	}
}
}
