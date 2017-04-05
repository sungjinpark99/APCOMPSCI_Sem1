public class StudentAdvance extends Advance
{
	public StudentAdvance(int n)
	{
		super(n);
	}
	public StudentAdvance()
	{
		super();
	}
	public int getPrice()
	{
		return super.getPrice()/2;
	}
	public String toString()
	{
		return super.toString() + "\n(STUDENT ID REQUIRED)";
	}
}

