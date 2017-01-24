public class BiggestNumber
{
	static int[] number;

	public static void main(String[]args)
	{
		number = new int [10];
		fillArray();
		System.out.println("For the numbers");
		printArray();	
		System.out.println(", the biggest number is " + Odds() + ".");
	}

	public static void fillArray()
	{
		for(int i = 0; i < number.length; i ++)
		{
			number[i] = (int)(Math.random()*100);
		}
	}

	public static void printArray()
	{
		for(int num:number)
		{
			System.out.print(num+ " ");
		}
	}

	public static int Odds()
	{
		int max = 0;
		for(int num:number)
		{
			if((num>max))
			{
				max=num;
			}
		}
		return max;
	}
}
