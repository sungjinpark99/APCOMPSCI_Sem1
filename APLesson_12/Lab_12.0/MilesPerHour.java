import java.lang.Math.*;
public class MilesPerHour
{
	private int Distance, Hours, Minutes;
	private double mph;
	
	public MilesPerHour()
	{
		Distance = 0;
		Hours = 0;
		Minutes = 0;
		mph = 0;
	}
	
	public MilesPerHour(int Dist, int H, int M)
	{
		Distance = Dist;
		Hours = H;
		Minutes = M;
		mph = 0;
	}
	
	public void setDistance(int Dist, int H, int M)
	{
		Distance = Dist;
		Hours = H;
		Minutes = M;
	}
	
	public int getDistance()
	{
		return Distance;
	}
	
	public int getHours()
	{
		return Hours;
	}
	
	public int getMinutes()
	{
		return Minutes;
	}
	
	public double getmph()
	{
		mph = Math.round(Distance / (Hours + Minutes / 60.0));
		return mph;
	}	
}