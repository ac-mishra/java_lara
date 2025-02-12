class Z1
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		double ch = test();
		System.out.println("main end:" + ch );
	}

	static double test()
	{
		System.out.println("from test");
		return 4.5 ;
	}
}
