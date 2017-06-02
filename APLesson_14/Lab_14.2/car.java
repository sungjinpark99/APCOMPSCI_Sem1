public class car implements Location
{
	double location
	
	private int ID = (int)(Math.random() * Math.pow(10,6))+1;
	
	public double[] getLoc()
	{
		return location
	}
	public void move(double x, double y)
	{
		location[0]=x;
		location[1]=y;
	}
	public int getID()
	{
		return ID;
	}
}