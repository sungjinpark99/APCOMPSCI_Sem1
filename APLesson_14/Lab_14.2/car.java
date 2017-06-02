public class car implements Location
{
	public double[] location;
	
	public final int ID = (int)(Math.random()*1000000) + 1;
	
	public Car()
	{
		location = new double[2]
	}
	
	public double[] getLoc()
	{
		return location;
	}
	
	public void move(double X, double Y)
	{
		location[0] = X;
		location[1] = Y;
	}
	
	public int getID()
	{
		return ID;
	}
}