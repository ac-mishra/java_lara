class Y
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if(test())
		{
			System.out.println("from if");
		}
		System.out.println("main end:" );
	}

	static boolean test()
	{
		System.out.println("from test");
		return true;
	}
}
