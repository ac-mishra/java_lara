class C
{
	public static void main(String[] args) 
	{
		int i = 10;
		while(i >= 1)		
		{
			int j = 50;
			System.out.println("loop body:" + i);
			i--;
		}
		System.out.println("main end:" + i );
		System.out.println("main end:" + j );
	}
}
