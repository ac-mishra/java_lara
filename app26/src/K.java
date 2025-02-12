class K
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <=10; i ++)
		{
			System.out.println("loop body begin:" + i);
			if (i == 5)
			{
				break;
					System.out.println ("loop body end:" + i);
				
			}
			System.out.println("loop body end:" + i);
		}
		System.out.println("main end");
	}
}

