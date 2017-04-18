public class GMC extends Car
{
	private double x;
	private double y;
	
	public GMC()
	{
		x = 0;
		y = 0;
	}
	public GMC(double X, double Y)
	{
		x += X;
		y += Y;
	}
	public void MOVE(double X, double Y)
	{
		x += X;
		y += Y;
	}
	public double[] getLocation()
	{
		double[] location = new double[] {x,y};
		return location;
	}
}
