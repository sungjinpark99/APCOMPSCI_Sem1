import java.util.Random;

public class GameSystems
{
	public Random ran = new Random();
	public String platform;
	public int serialNo;

	public GameSystems()
	{
		platform = "";
		serialNo = ran.nextInt(1000000) + 1000000 * ran.nextInt(10);
	}

	public GameSystems (String p)
	{
		platform = p;
		serialNo = ran.nextInt(1000000) + 1000000 * ran.nextInt(10);
	}

	public String getPlatform()
	{
		return this.platform;
	}

	public int getSerialNo()
	{
		return this.serialNo;
	}
}
