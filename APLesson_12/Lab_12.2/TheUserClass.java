import java.util.Random;

public class TheUserClass
{
	private String FirstName, LastName, Avatar;
	private int UserID;

	public TheUserClass()
	{
		FirstName = "First Name";
		LastName = "Last Name";
		Avatar = "Undefined";
		UserID = (int)(Math.random() * 1000000);
	}

	public TheUserClass(String FN, String LN)
	{
		FirstName = FN;
		LastName = LN;
		Avatar = "Undefined";
		UserID = (int)(Math.random() * 1000000);
	}

	public TheUserClass(String FN, String LN, String Av)
	{
		FirstName = FN;
		LastName = LN;
		Avatar = Av;
		UserID = (int)(Math.random() * 1000000);
	}

	public void modifyInfo(String FN, String LN, String Av)
	{
		FirstName = FN;
		LastName = LN;
		Avatar = Av;
	}

	public String toString()
	{
		return "Customer Info...\nFirst Name: " + FirstName + 
		"\nLast Name: " + LastName +
		"\nAvatar: " + Avatar +
        "\nUser ID#: " + UserID;
	}
}