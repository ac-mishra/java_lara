class F
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <=10; i ++)
		{
			System.out.println("loop body begin:" + i);
			if (i == 6)
			{
				System.out.println(" if loop body end:" + i);
				continue;
			
			}
			System.out.println("loop body end:" + i);
		}
		System.out.println("main end");
	}
}
