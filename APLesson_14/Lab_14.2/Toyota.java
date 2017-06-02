import java.util.Arrays;
public class Toyota extends car
{
	public Toyota()
	{
		x = 0;
		y = 0;
	}
	public Toyota(String i)
	{
		String[] locs = i.split(", ");
		x = Double.parseDouble(locs[0]);
		y = Double.parseDouble(locs[1]);
	}
}