import java.util.Random;

public class Toyota implements Location
{
	private double[] loc;

	public Toyota(String coords)
	{
		double[] Loc = new double[2];
		String[] c = coords.split(", ");
		Loc[0] = Double.parseDouble(c[0]);
		Loc[1] = Double.parseDouble(c[1]);

		this.loc = Loc;
	}
	public int getID()
	{
		Random rng = new Random();
		return 10000+rng.nextInt(90000);
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