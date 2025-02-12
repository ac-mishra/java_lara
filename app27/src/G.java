class G
{
	public static void main(String[] args) 
	{
		test:
		for (int i = 1; i <= 10; i++ )
		{
			System.out.println("outer loop begin:" + i);
			abc:
			for (int j = 101; j <= 103; j++ )
			{
				System.out.println("inner loop begin:" + i + ", " + j);
				if (j == 102)
				{
					continue test;
				}
				System.out.println("inner loop begin:" + i + ", " + j);
			}
			System.out.println("outer loop end:" + i);
		}
	}
}
