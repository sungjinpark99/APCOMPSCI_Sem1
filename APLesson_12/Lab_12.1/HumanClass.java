
public class HumanClass
{
	private String Hair,Eyes,Skin;

	public HumanClass()
	{
		Hair="";
		Eyes="";
		Skin="";
	}

	public HumanClass(String h,String e,String s)
	{
		Hair=h;
		Eyes=e;
		Skin=s;
	}

	public void setHuman(String h,String e,String s)
	{
		Hair=h;
		Eyes=e;
		Skin=s;
	}

	public String getHair()
	{
		return Hair;
	}

	public String getEyes()
	{
		return Eyes;
	}

	public String getSkin()
	{
		return Skin;
	}
}
