public abstract class Car implements Location
{
	public final int ID = (int)(Math.random()*1000000) + 1;
	
	private double[] location;
	
	public int getID()
	{
		return ID;
	}

	public void move(double x, double y)
	{
			location[0] += x;
			location[1] += y;
	}
	
	public Car()
	{
		location =  new double[2];
	}
	
	public double[] getLoc()
	{
		return location;
	}
}









