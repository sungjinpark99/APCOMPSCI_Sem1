import java.util.ArrayList;
import java.util.Arrays;

public class ToySt
{
	private ArrayList<Toy> ToyList = new ArrayList<>();

	public ToySt()
	{
		ToyList = null;
	}
	public ToySt(String TS)
	{
		loadToys(TS);
	}
	public void loadToys(String TS)
	{
		ArrayList<String> Toys = new ArrayList<String>(Arrays.asList(TS.split(", ")));
		for(int i = 0; i < Toys.size(); i+=2)
		{
			String Name = Toys.get(i);
			String Type = Toys.get(i+1);
			Toy T = getToy(Name);
			if (T == null)
			{
				if (Type.equals("Car"))
				{
					ToyList.add(new Car(Name));
				}
				else if (Type.equals("AF"))
				{
					ToyList.add(new AFigure(Name));
				}
			}
			else
			{
				T.setCount(T.getCount()+1);
			}
		}
	}
	public Toy getToy(String nm)
	{
		for(Toy i : ToyList)
		{
			if(i.getName().equals(nm))
			{
				return i;
			}
		}
		return null;
	}
	public String getMostFrequentToy()
	{
		String Name = "";
		int max = Integer.MIN_VALUE;
		for(Toy i : ToyList)
		{
			if(max < i.getCount())
			{
				max = i.getCount();
				Name = i.getName();
			}
		}
		return Name;
	}
	public String getMostFrequentType()
	{
		int Cars = 0;
		int Figs = 0;
		for(Toy i : ToyList)
		{
			if(i.getType().equals("Car"))
			{
				Cars =+ 1;
			}
			if(i.getType().equals("AF"))
			{
				Figs =+ 1;
			}
		}
		if(Cars > Figs)
		{
			return "Cars";
		}
		if(Figs > Cars)
		{
			return "Action figures";
		}
		else
		{
			return "Equal numbers of both";
		}
	}
	public String toString()
	{
		return ""+ToyList;
	}
}
