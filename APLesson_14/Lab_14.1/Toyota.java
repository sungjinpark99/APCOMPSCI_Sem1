import java.util.Arrays;
public class Toyota extends Car
{
	private double[] loc;

	public Toyota(String z)
	{
		String[] locs = z.split(", ");
		loc[0] = Double.parseDouble(locS[0]);
		loc[1] = Double.parseDouble(locS[1]);
	}
	
	public void move(double x, double y)
	{
		loc[0] += x;
		loc[1] += y;
	}
	
	public double[] getLoc()
	{
		return loc
	}
}