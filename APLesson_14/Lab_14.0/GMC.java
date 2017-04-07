import java.util.Random;

public class GMC implements Location
{
	private int x;
	private int y;

	public GMC(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public int getID()
	{
		Random rng = new Random();
		return 10000+rng.nextInt(90000);
	}
	public void move(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public double[] getLocation()
	{
		double[] Loc = new double[2];
		Loc[0] = x;
		Loc[1] = y;
		return Loc;
	}
}
