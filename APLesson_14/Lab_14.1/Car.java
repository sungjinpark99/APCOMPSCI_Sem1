public abstract class Car implements Location
{
	public int ID =(int)(Math.random() * Math.pow(10,6))+1;
	
	public int getID()
	{
		return ID;
	}

	abstract void MOVE(double X, double Y);
	
	public abstract double[] getLocation();
}









