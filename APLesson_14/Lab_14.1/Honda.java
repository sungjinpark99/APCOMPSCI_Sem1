public class Honda extends Car
{
	private double x;
	private double y;
	private double[] location;
	
	public Honda()
	{
		x = 0;
		y = 0;
	}
	public Honda(double[]location)
	{
		x = location[0];
		y = location[1];
	}
	public void MOVE(double X, double Y)
	{
		x +=X;
		y +=Y;
	}
	public double[] getLocation()
	{
		return location;
	}
}