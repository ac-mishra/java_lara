class M
{
	public static void main(String[] args) 
	{
		int i = 1;
		abs;
		while(i <= 5 )		
		{
			System.out.println("loop body begin:" + i);
			for(int j= 101; j <= 103; j++)
			{
				System.out.println("inner loop begin:" + i +", " + j);
				if (j == 102)
				{
					break abs;
				}
				System.out.println("inner loop end:" + i +", " + j);
			}
			System.out.println("loop body end:" + i);
			i++;
		}
		System.out.println("main end:" + i );
	}
}
