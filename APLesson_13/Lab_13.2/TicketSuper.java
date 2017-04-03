public abstract class TicketSuper
{
	private int SerialNumber = 0;
	private int Price = 0;

	public TicketSuper()
	{
		Price = 0;
		SerialNumber = (int)(Math.random() * 10000000);
	}

	public int getSerialNumber()
	{
		return SerialNumber;
	}

	public abstract int getPrice();
	public String toString()
	{
		return "Serial #: " + getSerialNumber() + "\nPrice: " + getPrice();
	}
}
