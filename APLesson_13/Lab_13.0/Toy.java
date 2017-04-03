public abstract class Toy
{
	private String Name;
	private int Count;

	public Toy()
	{
		this.Name = "";
		this.Count = 1;
	}

	public Toy(String N)
	{
		this.Name = N;
		this.Count = 1;
	}

	public String getName()
	{
		return Name;
	}

	public int getCount()
	{
		return Count;
	}

	public void setName(String N)
	{
		this.Name = N;
	}

	public void setCount(int C)
	{
		this.Count = C;
	}

	public abstract String getType();

	public String toString()
	{
	return "["+Name+"]" + "["+Count+"]";
	}
}
