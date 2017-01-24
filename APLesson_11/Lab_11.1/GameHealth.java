import java.util.Scanner;

public class GameHealth
{
	static String[] HEALTH;
	static int HEALTHLOAD=6;
	static int HEALTHCOUNT;

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);

		String turn = "";
		int damage=0;
		int amount=0;
		HEALTHCOUNT=6;
		HEALTH= new String[HEALTHLOAD];

		while(!turn.equals("Q") && HEALTHCOUNT>0)
		{
			System.out.println("Your turn. Hit enter when ready");
			turn=kb.next();
			damage=(int)(Math.random()*2)+1;
			amount=(int)(Math.random()*3)+1;
			System.out.println(takeD(damage,amount));
			printClip();
		}
		System.out.println("You have died");
	}
	public static String takeD(int d, int a)
	{
		if(d==1)
		{
			HEALTHCOUNT-=a;
			return "Taking " + a + " damage";
		}
		else	
		{
			if((HEALTHCOUNT+a)<HEALTHLOAD)
				HEALTHCOUNT+=a;
			else
				HEALTHCOUNT=HEALTHLOAD;
			return ("Power up " + a);
		}
	}
	public static void printClip()
	{
		String output = "Health" + "\t";
		for(int i=0;i<HEALTHCOUNT;i++)
		{
			if(i<HEALTHCOUNT)
				HEALTH[i]="[ ] ";
			else
				HEALTH[i]= "[x]";
			output+= HEALTH[i];
		}
		System.out.println(output);
	}
}
