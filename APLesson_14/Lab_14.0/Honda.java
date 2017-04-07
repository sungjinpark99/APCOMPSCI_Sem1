import java.util.Random;

public class Honda implements Location
{
	private double[] loc;

	public Honda(double[] loc)
	{
		this.loc = loc;
	}
	public int getID()
	{
		Random rng = new Random();
		return 100000+rng.nextInt(900000);
	}
	public void move(int x, int y)
	{
		loc[1] = x;
		loc[2] = y;
	}
	public double[] getLocation()
	{
		return loc;
	}
}

