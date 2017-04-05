public abstract class Console extends GameSystems
{
		
	public Console(String p)
	{
		super(p);
	}
	public Console()
	{
		super();
	}
	public abstract String getController();
	public String toString()
	{
		return "Platform: " +this.getPlatform() + "\nSerial #: " + this.getSerialNo() + "\nController: " + this.getController();
	}
}
