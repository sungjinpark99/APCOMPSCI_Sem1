import static java.lang.Math.*;

public class DistanceBetween2Points
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;
	
	public DistanceBetween2Points()
	{
		xOne=0;
		yOne=0;
		xTwo=0;
		yTwo=0;
		distance=0;
	}
	
	public DistanceBetween2Points(int xO, int yO, int xT, int yT)
	{
		xOne=xO;
		yOne=yO;
		xTwo=xT;
		yTwo=yT;
		distance=0;
	}
	
	public void setValues(int xO, int yO, int xT, int yT)
	{
		xOne=xO;
		yOne=yO;
		xTwo=xT;
		yTwo=yT;
	}
	
	public double getDist()
	{
		distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
		return distance;
	}
}


