class E
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 10; i++ )
		{
			System.out.println("outer loop begin:" + i);
			innerLoop:
			for (int j = 101; j <= 103; j++ )
			{
				System.out.println("inner loop begin:" + i + ", " + j);
				if (j == 102)
				{
					break innerLoop;
				}
				System.out.println("inner loop begin:" + i + ", " + j);
			}
			System.out.println("outer loop end:" + i);
		}
	}
}
