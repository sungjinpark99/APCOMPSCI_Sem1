public class Advance extends TicketSuper
{
	public int DaysLeft;
	
	public Advance(int Days)
	{
		super();
		DaysLeft = Days;
	}
	public Advance()
	{
		super();
		DaysLeft = 0;
	}
	public int getDaysLeft()
	{
		return DaysLeft;
	}
	public int getPrice()
	{
		if(DaysLeft >= 10)
			return 30;
		else
			return 40;
	}
}

