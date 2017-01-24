public class XsOs
{
	public static void main(String[]args)
	{
		String[][]XsOs = new String [4][4];

		for(int i = 0; i < XsOs.length; i++)
		{
			for(int j = 0; j < XsOs[i].length; j++)
			{
				int pick = (int)((Math.random() * 10) % 2) + 1;
				if (pick == 1)
				{
					XsOs[i][j] = "x";
				}
				if (pick == 2)
				{
					XsOs[i][j] = "o";
				}
				System.out.print(XsOs[i][j] + "\t");
			}
			System.out.println();
		}
	}
}