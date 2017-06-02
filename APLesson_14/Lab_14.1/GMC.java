public class GMC extends Car
{
	private double a;
	private double b;
	
	public GMC(double x, double y)
	{
		a += x;
		b += y;
	}
	
	public void move(double x, double y)
	{
		a += x;
		b += y;
	}
	
	public double[] getLoc()
	{
		double[] loc = new double[] {a,b};
		return loc;
	}
}
