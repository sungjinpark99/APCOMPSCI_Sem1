public abstract class Car implements Location
{
	public final int ID = (int)(Math.random()*1000000) + 1
	
	public int getID()
	{
		return ID;
	}

	public void move(double X, double Y)
	{
			location[0] += X;
			location[1] += Y;
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









