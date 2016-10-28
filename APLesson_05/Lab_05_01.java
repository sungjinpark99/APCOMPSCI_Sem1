public class Lab_05_01
{
	public static void main(String[]args)
	{
		int player = (int)(1+Math.random()*6);
		int computer = (int)(1+Math.random()+6);
		
		System.out.println("Player's number is " + player);
		System.out.println("Computer's number is " + computer);
		
		if(player >= computer)
			System.out.println("Player is the Winner!");
		if(computer >= player)
			System.out.println("Computer is the Winner!");
	}

}