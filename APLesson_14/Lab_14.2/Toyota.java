import java.util.Arrays;
public class Toyota extends car
{
	public Toyota(String i)
	{
		String[] locS = i.split(", ");
		this.location[0] = Double.parseDouble(locS[0]);
		this.location[1] = Double.parseDouble(locS[1]);
	}
}