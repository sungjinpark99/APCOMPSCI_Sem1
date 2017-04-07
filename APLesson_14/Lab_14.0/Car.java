public abstract class Car implements Location
{
	public double[] loc;
	public final int ID = (int)(Math.random()*90000)+10000;

	public Car()
	{
		loc = new double[2];
	}
	public int getID()
	{
		return ID;
	}
	public void move(double x, double y)
	{
		loc[0] = x;
		loc[1] = y;
	}
	public double[] getLocation()
	{
		return loc;
	}
}
