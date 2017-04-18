import java.util.Arrays;
public class Toyota extends Car
{
	private double[] Location;
	private double x;
	private double y;
	
	public Toyota()
	{
		x = 0;
		y = 0;
	}
	public Toyota(String i)
	{
		String[] locs = i.split(", ");
		x = Double.parseDouble(locs[0]);
		y = Double.parseDouble(locs[1]);
	}
	public void MOVE(double X, double Y)
	{
		x += X;
		y += Y;
	}
	public double[] getLocation()
	{
		return new double[] {x,y};
	}
}