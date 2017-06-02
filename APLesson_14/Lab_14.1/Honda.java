public class Honda extends Car
{
	public double[] loc;
	
	public Honda(double[]loc)
	{
		x = loc[0];
		y = loc[1];
	}
	
	public void move(double x, double y)
	{
		loc[0] +=x;
		loc[1] +=y;
	}
	
	public double[] getLoc()
	{
		return loc;
	}
}