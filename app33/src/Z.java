class Z
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		char ch = test();
		System.out.println("main end:" + ch );
	}

	static char test()
	{
		System.out.println("from test");
		return 'd';
	}
}
