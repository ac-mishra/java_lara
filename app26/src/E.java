class E
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <=10000; i = i * 2 )	// i *= 2
		{
			System.out.println("loop body:" + i);
		}
		System.out.println("main end");
	}
}
