public class AverageNumbers
{
	public static void main(String[]args)
	{
		int [] nums = new int[10];
		for(int i = 0; i < nums.length; i ++)
		{
			nums[i] = (int)(Math.random()*100);
		}
		System.out.println("Your Random Numbers are ");

		for (int num : nums)
		{
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("The average is " + average(nums));
	}

	public static int average(int[] nm)
	{
		int sum = 0;

		for(int n : nm)
		{
			sum += n;
		}
		return (sum/10);
	}
}
