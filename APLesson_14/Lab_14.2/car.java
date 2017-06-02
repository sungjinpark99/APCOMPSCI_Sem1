public class car implements Location
{
	double x;
	double y;
	
	private int ID = (int)(Math.random()*900000)+100000;
	
	public double[] getLoc()
	{
		return new double[] {x,y};
	}
	public void move(double X, double Y)
	{
		x += X;
		y += Y;
	}
	public int getID()
	{
		return ID;
	}
}