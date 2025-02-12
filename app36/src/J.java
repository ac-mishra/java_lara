class j
{
	static int a = test();
	static
	{
		System.out.println("SIB");
	}
	static int test()
	{
		System.out.println("from test");
		return 200;
	}
	public static void main(String[] args) 
	{
		System.out.println("main");
	}
	static 
	{
		System.out.println("last-SIB");
	}
}
