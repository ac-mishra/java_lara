class S
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int s1 = test();
		System.out.println("main end");
	}
	static int test()
	{
		System.out.println("test");
		return 1000;
	}
}