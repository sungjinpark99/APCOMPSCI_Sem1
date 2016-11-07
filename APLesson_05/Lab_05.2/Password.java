import java.util.Scanner;

public class Password
{

	
	public static void main(String[]args)
	{	
		String username = "parks2110";
		String password = "11002110";
		
		passCheck(username,password);
		

	}
	public static void passCheck(String login, String loginpw)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the username?");
		String ID = kb.next();
		System.out.println("What is the password?");
		String PW = kb.next();
		
		if(ID.equals(login) && PW.equals(loginpw))
			System.out.println("You are now granted access!");
		else{
			if(ID.equals(login))
			{
				System.out.println("YOUR PASSWORD IS WRONG!!!!! STOP TRYING");
				passCheck(login,loginpw);
			}
			else if(PW.equals(loginpw))
			{
				System.out.println("YOUR ID IS WRONG!!!! STOP TRYING");
				passCheck(login,loginpw);
			}
			else 
			{
				System.out.println("Mannnnnnnn Both your ID and PW are wrong.");
				passCheck(login,loginpw);
			}
			
		
		}
		
		
		
	}
}