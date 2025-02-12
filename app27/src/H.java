class H
{
	public static void main(String[] args) 
	{
		xyz:
		for (int i = 1; i <= 10; i++ )
		{
			System.out.println("outer loop begin:" + i);
			for (int j = 101; j <= 103; j++ )
			{
				System.out.println("inner loop begin:" + i + ", " + j);
				if (j == 102)
				{
					break xyz;
				}
				System.out.println("inner loop begin:" + i + ", " + j);
			}
			System.out.println("outer loop end:" + i);
		}
	}
}
